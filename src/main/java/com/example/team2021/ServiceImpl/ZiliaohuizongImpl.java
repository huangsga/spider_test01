package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.Ziliaohuizong;
import com.example.team2021.Mapper.ZiliaohuizongMapper;
import com.example.team2021.Service.ZiliaohuizongService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZiliaohuizongImpl implements ZiliaohuizongService {
    @Autowired
    private ZiliaohuizongMapper ziliaohuizongMapper;

    @Override
    public PageInfo<Ziliaohuizong> findAllziliao(Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);//一个设置
        List<Ziliaohuizong> lists = ziliaohuizongMapper.findAllziliao();
        PageInfo<Ziliaohuizong> info=new PageInfo<Ziliaohuizong>(lists);
        return info;
    }
}
