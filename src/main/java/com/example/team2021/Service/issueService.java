package com.example.team2021.Service;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.issue;
import com.example.team2021.Entity.jiaoCai;

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
    List<issue> findAllIssue();
    List<ViewIssue> findAllIssueItem();
    List<jiaoCai> findjiaoCaiBX();
    List<jiaoCai> findjiaoCaiXX();
    List<ViewIssue> findzhangJie();
}
