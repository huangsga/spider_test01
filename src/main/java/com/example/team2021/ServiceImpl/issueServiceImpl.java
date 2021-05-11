package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.issue;
import com.example.team2021.Entity.jiaoCai;
import com.example.team2021.Entity.kemu;
import com.example.team2021.Mapper.issueMapper;
import com.example.team2021.Service.issueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: com.example.team2021.ServiceImpl-> issueServiceImpl
 * @description: 试题
 * @author: 曾豪
 * @createDate: 2021-05-07 8:41
 * @version: 1.0
 * @todo:
 */
@Service
public class issueServiceImpl implements issueService {
    @Autowired
    private issueMapper issueMapper;

    @Override
    public List<ViewIssue> findAllIssue() {
        return issueMapper.findAllIssue();
    }

//    @Override
//    public List<ViewIssue> findAllIssueItem(){
//        return issueMapper.findAllIssueItem();
//    }

    @Override
    public List<ViewIssue> findjiaoCaiBX() {
        return issueMapper.findjiaoCaiBX();
    }

    @Override
    public List<ViewIssue> findjiaoCaiXX() {
        return issueMapper.findjiaoCaiXX();
    }

    @Override
    public List<ViewIssue> findzhangJie() {
        return issueMapper.findzhangJie();
    }

    @Override
    public List<kemu> findAllKemu() {
        return issueMapper.findAllKemu();
    }

    ;
}
