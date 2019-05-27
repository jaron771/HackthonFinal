package com.right.vivo.vo;

import com.right.vivo.po.Major;
import lombok.Data;

@Data
public class MajorVO {
    private int id;
    private String name;
    private String briefIntro;
    private String address;
    private String tel;
    private String logoUrl;
    public MajorVO(Major major){
        this.id=major.getId();
        this.name=major.getName();
        this.briefIntro=major.getBriefIntro();
        this.logoUrl=major.getLogoUrl();
        this.address=major.getAddress();
        this.tel=major.getTel();
    }
}
