package com.example.team2021.Mapper;

import com.example.team2021.Entity.Zhijigaokao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ZhijigaokaoMapper {
    @Select("select addtress from team01.zhijigaokao where subject='ch' and year=2020")
    List<Zhijigaokao> findAllch1();

}
