package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.User;
import com.example.team2021.Mapper.UserMapper;
import com.example.team2021.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

//    @Override
//    public String doLogin(Model model, HttpServletRequest request) {
//        HttpSession session = request.getSession(true);
//
//        System.out.println("登录之前：="+session.getAttribute("loginState"));
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if (username.isEmpty()){
//            model.addAttribute("usernameIsEmpty","用户名为空");
//            return "redirect:/user/login";
//        }
//        if (password.isEmpty()){
//            model.addAttribute("passwordIsEmpty","密码为空");
//            return "redirect:/user/login";
//        }
//        System.out.println(username+"  ==   "+password);
//        User user = userMapper.findUserByUsername(username);
//        if (user != null){
//            //解密
//            String passwordFromDb = user.getPassword();
//            boolean matches = bCryptPasswordEncoder.matches(password, passwordFromDb);
//            if (matches) {
//                //判断权限,如果管理员登录成功转发到管理后台
//                if (user.getPower().equals("admin")){
//                    model.addAttribute("accountNotAllow","管理员登录成功");
//                    return "redirect:/user/login";
//                }
//                //如果不是管理员则跳转到前台
//                model.addAttribute("loginSuccess","登录成功");
//                //把用户信息加到session里面
//                session.setAttribute("loginState",true);//把用户数据保存到session对象中
//                System.out.println("登录之后：="+session.getAttribute("loginState"));
//                return "redirect:/main/index";
//            }else{
//                model.addAttribute("loginFailed","登录失败，用户名或者密码错误");
//                return "redirect:/user/login";
//            }
//        }
//        model.addAttribute("userNoRegister","用户不存在");
//        return "login.html";
//    }

//    @Override
//    public String doRegister(Model model, HttpServletRequest request) {
//        //TODO:生成Id的算法
//        String username = request.getParameter("username");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        if (username.isEmpty()){
//            model.addAttribute("usernameIsEmpty","用户名为空");
//            return "redirect:register";
//        }
//        if (email.isEmpty()){
//            model.addAttribute("usernameIsEmpty","邮箱为空");
//            return "redirect:/user/register";
//        }
//        if (password.isEmpty()){
//            model.addAttribute("usernameIsEmpty","密码为空");
//            return "redirect:/user/register";
//        }
//        //判断当前用户名是否已经注册
//        User userFromDb = userMapper.findUserByUsername(username);
//        if (userFromDb !=null){
//            model.addAttribute("userIsRegistered","用户名已经注册");
//            return "redirect:/user/register";
//        }
//        //创建一个新的用户
//        User user = new User();
//        user.setUsername(username);
//        user.setEmail(email);
//        user.setPower("normal");
//        //设置密码前，使用MD5对密码进行加密
//        String Md5Password = bCryptPasswordEncoder.encode(password);
//        System.out.println(Md5Password);
//        user.setPassword(Md5Password);
//        //写进数据库
//        Integer integer = userMapper.addUser(user);
//        if (integer>0){
//            model.addAttribute("registerSuccess","注册成功");
//            //注册成功后跳转到登录页面
//            return "login.html";
//        }
//        //这里是注册失败的，然后继续跳转到注册页面
//        return "redirect:/user/register";
//    }
    @Override
    public List<User> findAllUser(){
        List<User> userlists=userMapper.findAllUser();
        return userlists;
    }

    @Override
    public User findUserByID(Integer userid){
        return userMapper.findUserByID(userid);
    }

    @Override
    public User UserLogin(String username,String password){
        return userMapper.UserLogin(username,password);
    }

    @Override
    public Integer addUserInfo(String username,String password,String email){
        return userMapper.addUserInfo(username,password,email);
    }
    @Override
    public Integer updateUserInfo(User user) {
        return userMapper.updateUserInfo(user);
    }
    @Override
    public Integer deleteUserInfo(Integer userid){
        return userMapper.deleteUserInfo(userid);
    }

    @Override
    public Integer countUser(){
        return userMapper.countUser();
    }

    @Override
    public User JudgePassword(User user){
        return userMapper.JudgePassword(user);
    }

    @Override
    public Integer updatePassword(User user){
        return userMapper.updatePassword(user);
    }
}
