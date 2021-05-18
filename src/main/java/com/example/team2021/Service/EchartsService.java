package com.example.team2021.Service;

import com.example.team2021.Entity.Echarts;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EchartsService {

    List<Echarts> findMath1();

    List<Echarts> findMath2();

}
