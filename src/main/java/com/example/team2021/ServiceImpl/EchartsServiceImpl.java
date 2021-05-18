package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.Echarts;
import com.example.team2021.Mapper.EchartsMapper;
import com.example.team2021.Service.EchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EchartsServiceImpl implements EchartsService {

    @Autowired
    private EchartsMapper echartsMapper;


    @Override
    public List<Echarts> findMath1() {
        return echartsMapper.findMath1();
    }

    @Override
    public List<Echarts> findMath2() {
        return echartsMapper.findMath2();
    }
}
