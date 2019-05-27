package com.right.vivo.po;

import lombok.Data;

@Data
public class AdmissionScore {

    /**
     * 专业id
     */
    private Integer majorId;

    /**
     * 地区
     */
    private String region;

    /**
     * 分数
     */
    private Integer score;

    private String majorName;

}
