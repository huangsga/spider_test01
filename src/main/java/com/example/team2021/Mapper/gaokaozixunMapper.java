package com.example.team2021.Mapper;

import com.example.team2021.Entity.gaokaozixun;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface gaokaozixunMapper {
    @Select("select distinct zixun_type from team01all.gaokaozixun")
    List<gaokaozixun> findAlltype();

    @Select("select * from team01all.gaokaozixun where zixun_type=#{zixun_type}")
    List<gaokaozixun> findAlltitle(String zixun_type);

    @Select("select * from team01all.gaokaozixun where zixun_id=#{zixun_id}")
    List<gaokaozixun> findAllbyid(Integer zixun_id);

    @Select("select * from team01all.gaokaozixun where description is not null")
    List<gaokaozixun> findAlldes();


}
