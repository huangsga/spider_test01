package com.example.team2021.Mapper;

import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Entity.Ziliaohuizong;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ZhijigaokaoMapper {
    @Select("select * from team01.zhijigaokao where year=#{year} and type=#{type} and subject=#{subject}")
    List<Zhijigaokao> findAllch1(String year,String type,String subject);
//静态页面

    @Select("select * from team01.zhijigaokao where subject=#{subject} and cover=1")
    List<Zhijigaokao> findSubjectLabel(String subject);
//制作简单的动态筛选标签
    @Select("select distinct subject from team01.zhijigaokao ")
    List<Zhijigaokao> findSubjectLabelNo();

    @Select("select * from team01.zhijigaokao where cover=1")
    List<Zhijigaokao> findSubjectAll();

    @Select("select * from team01.zhijigaokao where test_id=#{test_id}")
    List<Zhijigaokao> findDetail(String test_id);
}
