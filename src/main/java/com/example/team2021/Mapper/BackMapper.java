package com.example.team2021.Mapper;

import com.example.team2021.Entity.Back;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BackMapper {
    @Select("select * from userinfo")
    List<Back> findalluser();
}
