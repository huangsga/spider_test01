package com.example.team2021.Mapper;

import com.example.team2021.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from UserInfo")
    List<User> findAllUser();
}
