package com.example.team2021.Service;

import com.example.team2021.Entity.User;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public interface UserService {
    public List<User> listAllUsers();

//    String doLogin(Model model, HttpServletRequest request);
//
//    String doRegister(Model model, HttpServletRequest request);
    Integer addUserInfo(String username,String password,String email);

    Integer updateUserInfo(User user);
    User findUserByID(Integer userid);
    List<User> findAllUser();
    Integer deleteUserInfo(Integer userid);
    User UserLogin(String username,String password);
    Integer countUser();
    User JudgePassword(User user);
    Integer updatePassword(User user);
}
