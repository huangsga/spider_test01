package com.example.team2021.Service;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.issue;
import com.example.team2021.Entity.jiaoCai;
import com.example.team2021.Entity.kemu;

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
    List<ViewIssue> findAllIssue();
    List<ViewIssue> findIssueList(String kemuId);
    List<ViewIssue> findKemuName();
    List<ViewIssue> findJC(String jiaocaiType,String kemuId);
    List<ViewIssue> findZhangjieName(String kemuId,String jiaocaiId);

    List<ViewIssue> findIssueDetails(Integer shitiId);

}
