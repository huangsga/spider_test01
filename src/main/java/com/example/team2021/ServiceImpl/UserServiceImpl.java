package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.User;
import com.example.team2021.Mapper.UserMapper;
import com.example.team2021.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAllUsers() {
        return null;
    }

    @Override
    public String doLogin(Model model, HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.isEmpty()){
            model.addAttribute("usernameIsEmpty","用户名为空");
            return "redirect:/user/login";
        }
        if (password.isEmpty()){
            model.addAttribute("passwordIsEmpty","密码为空");
            return "redirect:/user/login";
        }
        System.out.println(username+"  ==   "+password);
        User user = userMapper.findUserByUsername(username);
        if (user != null){
            //判断权限
            if (!user.getPower().equals("admin")){
                model.addAttribute("accountNotAllow","账户权限不足");
                return "redirect:/user/login";
            }
            //解密
            String passwordFromDb = user.getPassword();
            boolean matches = bCryptPasswordEncoder.matches(password, passwordFromDb);
            if (matches) {
                model.addAttribute("loginSuccess","登录成功");
                return "index-1.html";
            }else{
                model.addAttribute("loginFailed","登录失败，用户名或者密码错误");
                return "redirect:/user/login";
            }
        }
        model.addAttribute("userNoRegister","用户不存在");
        return "login.html";
    }

    @Override
    public String doRegister(Model model, HttpServletRequest request) {
        //TODO:生成Id的算法
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if (username.isEmpty()){
            model.addAttribute("usernameIsEmpty","用户名为空");
            return "redirect:register";
        }
        if (email.isEmpty()){
            model.addAttribute("usernameIsEmpty","邮箱为空");
            return "redirect:/user/register";
        }
        if (password.isEmpty()){
            model.addAttribute("usernameIsEmpty","密码为空");
            return "redirect:/user/register";
        }
        //创建一个新的用户
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPower("normal");
        //设置密码前，使用MD5对密码进行加密
        String Md5Password = bCryptPasswordEncoder.encode(password);
        System.out.println(Md5Password);
        user.setPassword(Md5Password);
        //写进数据库
        Integer integer = userMapper.addUser(user);
        if (integer>0){
            model.addAttribute("registerSuccess","注册成功");
            //注册成功后跳转到登录页面
            return "login.html";
        }
        //这里是注册失败的，然后继续跳转到注册页面
        return "redirect:/user/register";
    }
}
