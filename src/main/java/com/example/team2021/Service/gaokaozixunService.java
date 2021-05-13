package com.example.team2021.Service;

import com.example.team2021.Entity.gaokaozixun;

import java.util.List;

//黄偲佳修改了
public interface gaokaozixunService {
    List<gaokaozixun> findAlltype();
    List<gaokaozixun> findAlltitle(String zixunType);
    List<gaokaozixun> findAllbyid(Integer zixunId);
    List<gaokaozixun> findAlldes();

}
