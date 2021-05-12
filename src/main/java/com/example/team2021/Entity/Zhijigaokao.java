package com.example.team2021.Entity;

public class Zhijigaokao {
    private Integer pic_id;
    private String address;
    private String subject;
    private String year;
    private String type;
    private String title;
    private boolean cover;
    private String test_id;

    public String getTest_id() {
        return test_id;
    }

    public void setTest_id(String test_id) {
        this.test_id = test_id;
    }

    public boolean isCover() {
        return cover;
    }

    public void setCover(boolean cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPic_id() {
        return pic_id;
    }

    public void setPic_id(Integer pic_id) {
        this.pic_id = pic_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
