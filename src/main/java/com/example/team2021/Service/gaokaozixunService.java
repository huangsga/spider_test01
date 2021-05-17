package com.example.team2021.Service;

import com.example.team2021.Entity.gaokaozixun;
import com.github.pagehelper.PageInfo;

import java.util.List;

//黄偲佳修改了
public interface gaokaozixunService {
    List<gaokaozixun> findAlltype();
    PageInfo<gaokaozixun> findAlltitle(String zixunType, Integer pageIndex, Integer pageSize);
    List<gaokaozixun> findAllbyid(Integer zixunId);
    List<gaokaozixun> findAlldes();

}
