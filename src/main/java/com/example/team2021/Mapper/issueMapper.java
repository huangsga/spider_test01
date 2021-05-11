package com.example.team2021.Mapper;

import com.example.team2021.Entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @className: com.example.team2021.Mapper-> issueMapper
 * @description: 试题
 * @author: 曾豪
 * @createDate: 2021-05-07 8:40
 * @version: 1.0
 * @todo:
 */

@Mapper
public interface issueMapper {
    @Select("select * from `shiti01` limit 10")
    List<ViewIssue> findAllIssue();

//    @Select("select shiti01.*,jiaocai_name from shiti01 join jiaocai on shiti01.jiaocai_id = jiaocai.jiaocai_id where jiaocai_type = '必修'")
//    List<ViewIssue> findAllIssueItem();

    @Select("select shiti01.*,jiaocai_name from shiti01 join jiaocai on shiti01.jiaocai_id = jiaocai.jiaocai_id where jiaocai_type = '必修'")
    List<ViewIssue> findjiaoCaiBX();

    @Select("select shiti01.*,jiaocai_name from shiti01 join jiaocai on shiti01.jiaocai_id = jiaocai.jiaocai_id where jiaocai_type = '选修'")
    List<ViewIssue> findjiaoCaiXX();

    @Select("select shiti01.*,zhangjie_name from shiti01 join zhangjie on shiti01.zhangjie_id = zhangjie.zhangjie_id")
    List<ViewIssue> findzhangJie();

    @Select("select * from kemu")
    List<kemu> findAllKemu();
}
