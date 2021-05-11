package com.example.team2021.Mapper;

import com.example.team2021.Entity.Ziliaohuizong;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ZiliaohuizongMapper {
    @Select("select * from ziliao where subject='语文' and photo is not null")
    List<Ziliaohuizong> findAllziliao();
}
