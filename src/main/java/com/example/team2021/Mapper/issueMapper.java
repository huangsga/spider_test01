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
//展示所有试题
    @Select("select * from shiti01")
    List<ViewIssue> findAllIssue();

//根据科目展示试题
    @Select("select * from shiti01 where kemu_id = #{kemuId}")
    List<ViewIssue> findIssueList(String kemuId);

//展示科目名称
    @Select("select distinct shiti01.kemu_id,kemu_name from shiti01 join kemu on shiti01.kemu_id = kemu.kemu_id")
    List<ViewIssue> findKemuName();
//展示必修教材名称
    @Select("select distinct shiti01.jiaocai_id,jiaocai.jiaocai_name,shiti01.kemu_id from shiti01 join jiaocai on shiti01.jiaocai_id = jiaocai.jiaocai_id where jiaocai_type = #{jiaocaiType} and shiti01.kemu_id = #{kemuId}")
    List<ViewIssue> findJC(String jiaocaiType, String kemuId);

//展示章节名称
    @Select("SELECT shiti01.zhangjie_id,shiti01.jiaocai_id,zhangjie.zhangjie_name from shiti01 join zhangjie on shiti01.zhangjie_id = zhangjie.zhangjie_id where kemu_id = #{kemuId} and jiaocai_id = #{jiaocaiId}")
    List<ViewIssue> findZhangjieName(String kemuId, String jiaocaiId);
//通过试题ID，展示试题详情
    @Select("select * from shiti01 join jiaocai on shiti01.jiaocai_id =jiaocai.jiaocai_id and shiti01.shiti_id = #{shitiId}")
    List<ViewIssue> findIssueDetails(Integer shitiId);

//详情页面，根据科目ID,教材ID，章节ID，举一反三
    @Select("SELECT * FROM shiti01 where kemu_id = #{kemuId} and jiaocai_id = #{jiaocaiId} and zhangjie_id = #{zhangjieId} order by rand() limit 3")
    List<ViewIssue> findIssueRand(String kemuId, String jiaocaiId, String zhangjieId);

//二级查询
    @Select("select * from shiti01 where kemu_id = #{kemuId} and jiaocai_id = #{jiaocaiId} and zhangjie_id = #{zhangjieId}")
    List<ViewIssue> loadIssues(String kemuId, String jiaocaiId, String zhangjieId);

//获取所有章节名称
    @Select("SELECT * from zhangjie")
    List<zhangJie> listZhangJie();

    //删除试题
    @Select("delete from shiti01 where shitiId=#{shitiId}")
    Integer deleteIssue(Integer shitiId);
}
