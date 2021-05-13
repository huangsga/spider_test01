package com.example.team2021.Mapper;

import com.example.team2021.Entity.gaokaozixun;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface gaokaozixunMapper {
    @Select("select distinct zixun_type from team01.gaokaozixun")
    List<gaokaozixun> findAlltype();

    @Select("select * from team01.gaokaozixun where zixun_type=#{zixunType}")
    List<gaokaozixun> findAlltitle(String zixunType);

    @Select("select * from team01.gaokaozixun where zixun_id=#{zixunId}")
    List<gaokaozixun> findAllbyid(Integer zixunId);

    @Select("select * from team01.gaokaozixun where description is not null")
    List<gaokaozixun> findAlldes();


}
