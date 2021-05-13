package com.example.team2021.Service;

import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Entity.Ziliaohuizong;

import java.util.List;

public interface ZhijigaokaoService {
    List<Zhijigaokao> findAllch1(String year,String type,String subject);
    List<Zhijigaokao> findSubjectLabelNo();
    List<Zhijigaokao> findSubjectLabel(String subject);
    List<Zhijigaokao> findSubjectAll();
    List<Zhijigaokao> findDetail(String testId);
}
