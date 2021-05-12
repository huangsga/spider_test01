package com.example.team2021.Service;

import com.example.team2021.Entity.Ziliaohuizong;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ZiliaohuizongService {
    PageInfo<Ziliaohuizong> findAllziliao(Integer pageIndex, Integer pageSize);
    Ziliaohuizong findOneziliao(Integer ziliaoID);
    PageInfo<Ziliaohuizong> findAllziliaoMath(Integer pageIndex, Integer pageSize);
    PageInfo<Ziliaohuizong> findAllziliaoEn(Integer pageIndex, Integer pageSize);
    PageInfo<Ziliaohuizong> findAllziliaoWuli(Integer pageIndex, Integer pageSize);
    PageInfo<Ziliaohuizong> findAllziliaoHUaxue(Integer pageIndex, Integer pageSize);
    PageInfo<Ziliaohuizong> findAllziliaoLizong(Integer pageIndex, Integer pageSize);
    PageInfo<Ziliaohuizong> findAllziliaoWenzong(Integer pageIndex, Integer pageSize);
}
