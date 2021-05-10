package com.example.team2021.Mapper;

import com.example.team2021.Entity.Back;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BackMapper {
    // 查询用户信息
    @Select("select * from userinfo")
    List<Back> findalluser();
    // 添加用户信息
    @Select("insert into userinfo(username,password,user_sex,grade,education,school,email,phone,provinces,creatDate,birthday) values(#{username},#{password},#{user_sex},#{grade},#{education},#{school},#{email},#{phone},#{provinces},sysdate(),#{birthday})")
    Integer adduserinfo(Back back);
}
