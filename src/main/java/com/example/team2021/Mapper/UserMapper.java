package com.example.team2021.Mapper;

import com.example.team2021.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 登录的mapper
 * @author beiwangshan
 */
@Mapper
public interface UserMapper {

    /**
     * 获取所有的用户
     * @return
     */
    @Select("select * from `userinfo`")
    List<User> listUsers();

    /**
     * 通过用户名查找用户
     * @param username
     * @return
     */
    @Select("select * from `userinfo` where username=#{username}")
    User findUserByUsername(String username);

    /**
     * 注册用户
     * @param user
     * @return
     */
    @Insert("insert into `userinfo` (username,password,email,power) VALUES (#{username},#{password},#{email},#{power})")
    Integer addUser(User user);
}
