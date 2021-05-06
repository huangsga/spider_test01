package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.Ziliaohuizong;
import com.example.team2021.Mapper.ZiliaohuizongMapper;
import com.example.team2021.Service.ZiliaohuizongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZiliaohuizongImpl implements ZiliaohuizongService {
    @Autowired
    private ZiliaohuizongMapper ziliaohuizongMapper;

    @Override
    public List<Ziliaohuizong> findAllziliao() {
        return ziliaohuizongMapper.findAllziliao();
    }
}
