package com.example.team2021.Service;

import com.example.team2021.Entity.Back;
import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Entity.gaokaozixun;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BackService {
    List<Back> findalluser();
    Integer adduserinfo(Back back);
    Integer edituserinfo(Back back);
    Back findoneuser(Integer userid);
    Integer deleteUserinfo(Integer userid);

    PageInfo<Zhijigaokao> findAllzhenti(Integer pageIndex,Integer pageSize);
    Integer deleteZhenti(Integer picId);


    PageInfo<ViewIssue> findAllIssue(Integer pageIndex, Integer pageSize);
    Integer deleteIssue(Integer shitiId);

    List<gaokaozixun> findAllzixun();

}
