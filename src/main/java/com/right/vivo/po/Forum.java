package com.right.vivo.po;


import lombok.Data;

@Data
public class Forum {

    private Integer id;

    /**
     * 学校id
     */
    private Integer universityId;

    /**
     * 论坛名称
     */
    private String name;

    /**
     * 专业id
     */
    private Integer majorId;
}
