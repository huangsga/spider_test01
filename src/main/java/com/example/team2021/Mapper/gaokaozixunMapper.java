package com.example.team2021.Mapper;

import com.example.team2021.Entity.gaokaozixun;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//黄偲佳修改了
@Mapper
public interface gaokaozixunMapper {
    @Select("select * from team01all.gaokaozixun where zixun_title='高考大纲' limit 3")
    List<gaokaozixun> findAllpolicy();

}
