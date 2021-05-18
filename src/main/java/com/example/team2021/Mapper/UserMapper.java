package com.example.team2021.Mapper;

import com.example.team2021.Entity.User;
import org.apache.ibatis.annotations.*;

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
    @Select("select * from userinfo")
    List<User> findAllUser();

    @Select("select * from userinfo where userid=#{userid}")
    User findUserByID(Integer userid);

    @Select("select * from userinfo where username=#{username} and password=#{password}")
    User UserLogin(String username,String password);

    @Insert("insert into userinfo(username,password,email) values(#{username},#{password},#{email})")
    Integer addUserInfo(String username,String password,String email);
    @Update("update userinfo set username=#{username},password=#{password},usersex=#{usersex},phone=#{phone},email=#{email},resume=#{resume} where username=#{username};")
    Integer updateUserInfo(User user);

    @Delete("delete from userinfo where userid=#{userid}")
    Integer deleteUserInfo(Integer userid);

    @Select("select count(*) from userinfo")
    Integer countUser();
    //判断是否原密码正确
    @Select("select * from userinfo where userid=#{userid} and password=#{password}")
    User JudgePassword(User user);

    @Update("update userinfo set password=#{newpassword} where userid=#{userid}")
    Integer updatePassword(User user);
}
