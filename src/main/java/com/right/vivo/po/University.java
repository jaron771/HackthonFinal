package com.right.vivo.po;


import lombok.Data;

@Data
public class University {

    private Integer id;
    /**
     * 学校名
     */
    private String name;
    /**
     * 学校简介
     */
    private String briefIntro;
    /**
     * logo
     */
    private String url;
    /**
     * 学校地址
     */
    private String address;
    /**
     * 联系电话
     */
    private String tel;
    /**
     * 邮编地址
     */
    private Integer postCode;
}
