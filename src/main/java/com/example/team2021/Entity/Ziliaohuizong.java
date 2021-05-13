package com.example.team2021.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class Ziliaohuizong {
    private Integer ziliaoID;
    private String title;
    private String time;
    private String content;
    private String subject;
    private Date createdate;
    private String isdelete;
    private String photo;

}
