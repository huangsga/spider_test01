package com.example.team2021.ServiceImpl;

import com.example.team2021.Entity.Back;
import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Mapper.BackMapper;
import com.example.team2021.Service.BackService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public Integer adduserinfo(Back back) {
        return backMapper.adduserinfo(back);
    }

    @Override
    public Integer edituserinfo(Back back) {
        return backMapper.edituserinfo(back);
    }

    @Override
    public Back findoneuser(Integer userid) {
        return backMapper.findoneuser(userid);
    }

    @Override
    public Integer deleteUserinfo(Integer userid) {
        return backMapper.deleteUserinfo(userid);
    }

    @Override
    public PageInfo<Zhijigaokao> findAllzhenti(Integer pageIndex,Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        List<Zhijigaokao> lists = backMapper.findAllzhenti();
        PageInfo<Zhijigaokao> info = new PageInfo<Zhijigaokao>(lists);
        return info;
    }



    @Override
    public Integer deleteZhenti(Integer pic_id) {
        return backMapper.deleteZhenti(pic_id);
    }
}
