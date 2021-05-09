package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.Back;
import com.example.team2021.Mapper.BackMapper;
import com.example.team2021.Service.BackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackServiceImpl implements BackService {
    @Autowired
    private BackMapper backMapper;
    @Override
    public List<Back> findalluser() {
        return backMapper.findalluser();
    }
}
