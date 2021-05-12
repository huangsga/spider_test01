package com.example.team2021.Mapper;

import com.example.team2021.Entity.Ziliaohuizong;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ZiliaohuizongMapper {
    @Select("select * from ziliao where subject='语文' and photo is not null")
    List<Ziliaohuizong> findAllziliao();
    @Select("select * from ziliao where subject='数学' and photo is not null")
    List<Ziliaohuizong> findAllziliaoMath();
    @Select("select * from ziliao where subject='英语' and photo is not null")
    List<Ziliaohuizong> findAllziliaoEn();
    @Select("select * from ziliao where subject='物理' and photo is not null")
    List<Ziliaohuizong> findAllziliaoWuli();
    @Select("select * from ziliao where subject='化学' and photo is not null")
    List<Ziliaohuizong> findAllziliaoHUaxue();
    @Select("select * from ziliao where subject='高考理综' and photo is not null")
    List<Ziliaohuizong> findAllziliaoLizong();
    @Select("select * from ziliao where subject='高考文综' and photo is not null")
    List<Ziliaohuizong> findAllziliaoWenzong();
    @Select("select * from ziliao where ziliaoID=#{ziliaoID}")
    Ziliaohuizong findOneziliao(Integer ziliaoID);
}
