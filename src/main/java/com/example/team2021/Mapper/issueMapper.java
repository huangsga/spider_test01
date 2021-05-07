package com.example.team2021.Mapper;

import com.example.team2021.Entity.Ziliaohuizong;
import com.example.team2021.Entity.issue;
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
    List<issue> findAllIssue();
}
