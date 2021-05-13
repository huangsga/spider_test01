package com.example.team2021.Service;

import com.example.team2021.Entity.User;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public interface UserService {
    public List<User> listAllUsers();

    String doLogin(Model model, HttpServletRequest request);

    String doRegister(Model model, HttpServletRequest request);
}
