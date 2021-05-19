package com.example.team2021.Entity;

import lombok.Data;

import java.util.Date;

/**
 * @className: com.example.team2021.Entity-> issue
 * @description: 试题
 * @author: xuhang
 * @createDate: 2021-05-07 8:40
 * @version: 1.0
 * @todo:
 */
@Data
public class issue {
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

}
