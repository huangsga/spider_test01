package com.example.team2021.Mapper;


import com.example.team2021.Entity.UserLog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserLogMapper {

    @Insert( "Insert into userlog(userid,log_Content,IP_Address,OS,IE,createDate,remark) " +
            "values(#{userid},#{log_Content},#{IP_Address},#{OS},#{IE},sysdate(),'无')")
    Integer InsertLog(UserLog log);

    @Select("select * from userlog order by createDate desc")
    List<UserLog> findAllLog();

    @Delete("delete from userlog where logid=#{logid}")
    Integer deleteUserLog(Integer logid);
}
