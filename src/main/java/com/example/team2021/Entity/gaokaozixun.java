package com.example.team2021.Entity;

import java.util.Date;
//黄偲佳修改了

public class gaokaozixun {
    private Integer zixun_id;
    private String zixun_title;
    private String zixun_time;
    private String zixun_content;
    private String zixun_type;
    private Date createdate;
    private String description;
    private String imgsrc;

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getZixun_id() {
        return zixun_id;
    }

    public void setZixun_id(Integer zixun_id) {
        this.zixun_id = zixun_id;
    }

    public String getZixun_title() {
        return zixun_title;
    }

    public void setZixun_title(String zixun_title) {
        this.zixun_title = zixun_title;
    }

    public String getZixun_time() {
        return zixun_time;
    }

    public void setZixun_time(String zixun_time) {
        this.zixun_time = zixun_time;
    }

    public String getZixun_content() {
        return zixun_content;
    }

    public void setZixun_content(String zixun_content) {
        this.zixun_content = zixun_content;
    }

    public String getZixun_type() {
        return zixun_type;
    }

    public void setZixun_type(String zixun_type) {
        this.zixun_type = zixun_type;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
