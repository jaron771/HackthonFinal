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
    private Integer universityId;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBriefIntro() {
        return briefIntro;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }
}
