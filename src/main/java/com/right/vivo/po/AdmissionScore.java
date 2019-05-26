package com.right.vivo.po;

import java.util.Map;

public class AdmissionScore {

    private Integer id;

    /**
     * 专业id
     */
    private Integer majorId;

    /**
     * 录取分数<年份,分数线>
     */
    private Map<Integer, Integer> admissionScores;

}
