package com.example.team2021.Entity;

import lombok.Data;

import java.util.Date;
//黄偲佳修改了

@Data
public class gaokaozixun {
    private Integer zixunId;
    private String zixunTitle;
    private String zixunTime;
    private String zixunContent;
    private String zixunType;
    private Date createdate;
    private String description;
    private String imgsrc;

}
