package com.right.vivo.po;

import lombok.Data;

import java.util.Map;

@Data
public class AdmissionScore {

    private Integer id;

    /**
     * 专业id
     */
    private Integer majorId;

    /**
     * 地区
     */
    private String region;

    /**
     * 录取分数<年份,分数线>
     */
    private Map<Integer, Integer> admissionScores;

}
