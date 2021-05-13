package com.example.team2021.Entity;

import lombok.Data;

import java.util.Date;

/**
 * @className: com.example.team2021.Entity-> ViewIssue
 * @description: 多变关联查询结果实体
 * @author: 曾豪
 * @createDate: 2021-05-08 9:49
 * @version: 1.0
 * @todo:
 */
@Data
public class ViewIssue {
    private Integer shitiId;
    private String kemuId;
    private String nianjiId;
    private String zhangjieId;
    private String jiaocaiId;
    private String shitiTimu;
    private String shitiTimuHref;
    private String shitiTimuLocal;
    private String shitiType;
    private String shitiOption;
    private String shitiDaan;
    private String shitiDaanHref;
    private String shitiDaanLocal;
    private String shitiKaodian;
    private Integer shitiHard;
    private String shitiTime;
    private Date createdate;
    private Integer isdelete;
    private String remark;

    private String jiaocaiName;
    private String zhangjieName;
    private String kemuName;
    private String jiaocaiType;

    public Integer getShitiId() {
        return shitiId;
    }

    public void setShitiId(Integer shitiId) {
        this.shitiId = shitiId;
    }

    public String getKemuId() {
        return kemuId;
    }

    public void setKemuId(String kemuId) {
        this.kemuId = kemuId;
    }

    public String getNianjiId() {
        return nianjiId;
    }

    public void setNianjiId(String nianjiId) {
        this.nianjiId = nianjiId;
    }

    public String getZhangjieId() {
        return zhangjieId;
    }

    public void setZhangjieId(String zhangjieId) {
        this.zhangjieId = zhangjieId;
    }

    public String getJiaocaiId() {
        return jiaocaiId;
    }

    public void setJiaocaiId(String jiaocaiId) {
        this.jiaocaiId = jiaocaiId;
    }

    public String getShitiTimu() {
        return shitiTimu;
    }

    public void setShitiTimu(String shitiTimu) {
        this.shitiTimu = shitiTimu;
    }

    public String getShitiTimuHref() {
        return shitiTimuHref;
    }

    public void setShitiTimuHref(String shitiTimuHref) {
        this.shitiTimuHref = shitiTimuHref;
    }

    public String getShitiTimuLocal() {
        return shitiTimuLocal;
    }

    public void setShitiTimuLocal(String shitiTimuLocal) {
        this.shitiTimuLocal = shitiTimuLocal;
    }

    public String getShitiType() {
        return shitiType;
    }

    public void setShitiType(String shitiType) {
        this.shitiType = shitiType;
    }

    public String getShitiOption() {
        return shitiOption;
    }

    public void setShitiOption(String shitiOption) {
        this.shitiOption = shitiOption;
    }

    public String getShitiDaan() {
        return shitiDaan;
    }

    public void setShitiDaan(String shitiDaan) {
        this.shitiDaan = shitiDaan;
    }

    public String getShitiDaanHref() {
        return shitiDaanHref;
    }

    public void setShitiDaanHref(String shitiDaanHref) {
        this.shitiDaanHref = shitiDaanHref;
    }

    public String getShitiDaanLocal() {
        return shitiDaanLocal;
    }

    public void setShitiDaanLocal(String shitiDaanLocal) {
        this.shitiDaanLocal = shitiDaanLocal;
    }

    public String getShitiKaodian() {
        return shitiKaodian;
    }

    public void setShitiKaodian(String shitiKaodian) {
        this.shitiKaodian = shitiKaodian;
    }

    public Integer getShitiHard() {
        return shitiHard;
    }

    public void setShitiHard(Integer shitiHard) {
        this.shitiHard = shitiHard;
    }

    public String getShitiTime() {
        return shitiTime;
    }

    public void setShitiTime(String shitiTime) {
        this.shitiTime = shitiTime;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getJiaocaiName() {
        return jiaocaiName;
    }

    public void setJiaocaiName(String jiaocaiName) {
        this.jiaocaiName = jiaocaiName;
    }

    public String getZhangjieName() {
        return zhangjieName;
    }

    public void setZhangjieName(String zhangjieName) {
        this.zhangjieName = zhangjieName;
    }

    public String getKemuName() {
        return kemuName;
    }

    public void setKemuName(String kemuName) {
        this.kemuName = kemuName;
    }

    public String getJiaocaiType() {
        return jiaocaiType;
    }

    public void setJiaocaiType(String jiaocaiType) {
        this.jiaocaiType = jiaocaiType;
    }
}
