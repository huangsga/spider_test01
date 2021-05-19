package com.example.team2021.Mapper;

import com.example.team2021.Entity.Echarts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EchartsMapper {

    @Select("SELECT DISTINCT jiaocai_name,shiti_kaodian,zhangjie_name from shiti01,zhangjie,jiaocai where shiti01.zhangjie_id = zhangjie.zhangjie_id and shiti01.jiaocai_id=jiaocai.jiaocai_id and shiti_kaodian like '%.%' and jiaocai_name='数学必修1' and isdelete=0")
    List<Echarts> findMath1();

    @Select("SELECT DISTINCT jiaocai_name,shiti_kaodian,zhangjie_name from shiti01,zhangjie,jiaocai where shiti01.zhangjie_id = zhangjie.zhangjie_id and shiti01.jiaocai_id=jiaocai.jiaocai_id and shiti_kaodian like '%.%' and jiaocai_name='数学必修2' AND isdelete = 0")
    List<Echarts> findMath2();

//    @Select("SELECT kemu_name,count(*) as count from shiti01,kemu where shiti01.kemu_id=kemu.kemu_id GROUP BY kemu_name")
//    List<Echarts> findALL();
}
