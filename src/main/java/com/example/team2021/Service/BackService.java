package com.example.team2021.Service;

import com.example.team2021.Entity.Back;

import java.util.List;

public interface BackService {
    List<Back> findalluser();
    Integer adduserinfo(Back back);
    Integer edituserinfo(Back back);
    Back findoneuser(Integer userid);
    Integer deleteUserinfo(Integer userid);
}
