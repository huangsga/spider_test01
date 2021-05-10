package com.example.team2021.Mapper;

import com.example.team2021.Entity.Back;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
    // 显示需要修改的用户信息
    @Select("select * from userinfo where userid=#{userid}")
    Back findoneuser(Integer userid);
    // 修改用户信息
    @Select("update userinfo set username=#{username},password=#{password},user_sex=#{user_sex},grade=#{grade},education=#{education},school=#{school},email=#{email},phone=#{phone},provinces=#{provinces},birthday=#{birthday} where userid=#{userid}")
    Integer edituserinfo(Back back);
    // 删除用户信息
    @Select("delete from userinfo where userid=#{userid}")
    Integer deleteUserinfo(Integer userid);
}
