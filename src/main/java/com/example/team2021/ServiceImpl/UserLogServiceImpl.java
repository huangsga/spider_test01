package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.UserLog;
import com.example.team2021.Mapper.UserLogMapper;
import com.example.team2021.Service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLogServiceImpl implements UserLogService {
    @Autowired
    private UserLogMapper userLogMapper;
    @Override
    public Integer InsertLog(UserLog log){
        return userLogMapper.InsertLog(log);
    };

    @Override
    public List<UserLog> findAllLog(){
        return userLogMapper.findAllLog();
    };

    @Override
    public Integer deleteUserLog(Integer logid){
        return userLogMapper.deleteUserLog(logid);
    };
}
