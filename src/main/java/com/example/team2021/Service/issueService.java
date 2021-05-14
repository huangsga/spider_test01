package com.example.team2021.Service;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.zhangJie;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @className: com.example.team2021.Service-> issueService
 * @description: 试题
 * @author: 曾豪
 * @createDate: 2021-05-07 8:41
 * @version: 1.0
 * @todo:
 */
public interface issueService {
    PageInfo<ViewIssue> findAllIssue(Integer pageIndex, Integer pageSize);
    PageInfo<ViewIssue> findIssueList(String kemuId,Integer pageIndex, Integer pageSize);
    List<ViewIssue> findKemuName();
    List<ViewIssue> findJC(String jiaocaiType, String kemuId);
    List<ViewIssue> findZhangjieName(String kemuId, String jiaocaiId);

    List<ViewIssue> findIssueDetails(Integer shitiId);
    List<ViewIssue> findIssueRand(String kemuId, String jiaocaiId, String zhangjieId);
    PageInfo<ViewIssue> loadIssues(String kemuId, String jiaocaiId, String zhangjieId,Integer pageIndex, Integer pageSize);
    List<zhangJie> listZhangJie();
}
