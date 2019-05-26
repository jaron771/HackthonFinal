package com.right.vivo.po;


import lombok.Data;

@Data
public class Forum {

    private int id;

    /**
     * 学校id
     */
    private int universityId;

    /**
     * 论坛名称
     */
    private String name;

    /**
     * 专业id
     */
    private int majorId;
}
