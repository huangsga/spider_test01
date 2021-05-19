package com.example.team2021.Service;

import com.example.team2021.Entity.*;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BackService {
    List<Back> findalluser();
    Integer adduserinfo(Back back);
    Integer edituserinfo(Back back);
    Back findoneuser(Integer userid);
    Integer deleteUserinfo(Integer userid);

    PageInfo<Zhijigaokao> findAllzhenti(Integer pageIndex, Integer pageSize);
    Integer deleteZhenti(Integer picId);


//    PageInfo<ViewIssue> findAllIssue(Integer pageIndex, Integer pageSize);
    List<ViewIssue> findAllIssue();
    Integer editIssue(ViewIssue viewIssue);
    ViewIssue findOneIssue(Integer shitiId);
    Integer deleteIssue(Integer shitiId);


    PageInfo<gaokaozixun> findAllzixun(Integer pageIndex, Integer pageSize);
    List<Ziliaohuizong> findalllibary();
    Integer deleteZiliaoinfo(Integer ziliaoID);
    Integer updateziliao(Ziliaohuizong ziliaohuizong);
    Ziliaohuizong updatefindziliao(Integer ziliaoID);

}
