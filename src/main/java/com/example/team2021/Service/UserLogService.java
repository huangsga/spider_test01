package com.example.team2021.Service;

import com.example.team2021.Entity.UserLog;

import java.util.List;

public interface UserLogService {
    Integer InsertLog(UserLog log);
    List<UserLog> findAllLog();
    Integer deleteUserLog(Integer logid);
}
