package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Mapper.ZhijigaokaoMapper;
import com.example.team2021.Service.ZhijigaokaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhijigaokaoImpl implements ZhijigaokaoService {
    @Autowired
    private ZhijigaokaoMapper zhijigaokaoMapper;

    @Override
    public List<Zhijigaokao> findAllch1(){
        return zhijigaokaoMapper.findAllch1();
    }



}
