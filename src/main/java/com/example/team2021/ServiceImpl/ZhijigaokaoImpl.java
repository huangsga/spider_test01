package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Entity.Ziliaohuizong;
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
    public List<Zhijigaokao> findAllch1(String year,String type,String subject){
        return zhijigaokaoMapper.findAllch1(year,type,subject);
    }

    @Override
    public List<Zhijigaokao> findSubjectLabelNo() {
        return zhijigaokaoMapper.findSubjectLabelNo();
    }

    @Override
    public List<Zhijigaokao> findSubjectLabel(String subject) {
        return zhijigaokaoMapper.findSubjectLabel(subject);
    }

    @Override
    public List<Zhijigaokao> findSubjectAll() {
        return zhijigaokaoMapper.findSubjectAll();
    }

    @Override
    public List<Zhijigaokao> findDetail(String testId) {
        return zhijigaokaoMapper.findDetail(testId);
    }
}
