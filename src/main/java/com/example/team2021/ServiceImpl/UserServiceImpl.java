package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.User;
import com.example.team2021.Mapper.UserMapper;
import com.example.team2021.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        return null;
    }
}
