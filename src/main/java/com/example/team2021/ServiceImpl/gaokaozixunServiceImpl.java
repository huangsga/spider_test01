package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.gaokaozixun;
import com.example.team2021.Mapper.gaokaozixunMapper;
import com.example.team2021.Service.gaokaozixunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gaokaozixunServiceImpl implements gaokaozixunService {
    @Autowired
    private gaokaozixunMapper gaokaozixunMapper;

    @Override
    public List<gaokaozixun> findAllpolicy() {
        return gaokaozixunMapper.findAllpolicy();
    }

}
