package com.example.team2021.Service;

import com.example.team2021.Entity.Ziliaohuizong;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ZiliaohuizongService {
    PageInfo<Ziliaohuizong> findAllziliao(Integer pageIndex, Integer pageSize);
}
