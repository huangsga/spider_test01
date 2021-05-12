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
}
