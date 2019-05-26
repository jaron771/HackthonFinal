package com.right.vivo.po;

import java.util.List;

public class AdmissionScore {

    private int id;

    /**
     * 专业id
     */
    private int majorId;

    /**
     * 年份
     */
    private List<Integer> years;

    /**
     * 录取分数
     */
    private List<Integer> admissionScores;
}
