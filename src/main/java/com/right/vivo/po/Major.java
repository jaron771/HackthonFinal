package com.right.vivo.po;


import lombok.Data;

@Data
public class Major {

    private Integer id;

    /**
     * 专业名称
     */
    private String name;

    /**
     * 学校id
     */
    private String universityId;

    /**
     * 专业简介
     */
    private String briefIntro;

    /**
     * 地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * logo_url
     */
    private String logoUrl;
}
