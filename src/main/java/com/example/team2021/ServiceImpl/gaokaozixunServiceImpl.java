package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.gaokaozixun;
import com.example.team2021.Mapper.gaokaozixunMapper;
import com.example.team2021.Service.gaokaozixunService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//黄偲佳修改了

@Service
public class gaokaozixunServiceImpl implements gaokaozixunService {
    @Autowired
    private gaokaozixunMapper gaokaozixunMapper;

    @Override
    public List<gaokaozixun> findAlltype() {
        return gaokaozixunMapper.findAlltype();
    }

    @Override
    public PageInfo<gaokaozixun> findAlltitle(String zixunType,Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        List<gaokaozixun> lists = gaokaozixunMapper.findAlltitle(zixunType);
        PageInfo<gaokaozixun> info=new PageInfo<gaokaozixun>(lists);
        return info;
    }

    @Override
    public List<gaokaozixun> findAllbyid(Integer zixunId) {
        return gaokaozixunMapper.findAllbyid(zixunId);
    }

    @Override
    public List<gaokaozixun> findAlldes() {
        return gaokaozixunMapper.findAlldes();
    }




}
