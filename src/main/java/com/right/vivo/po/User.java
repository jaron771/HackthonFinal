package com.right.vivo.po;

import lombok.Data;

@Data
public class User {

    private Integer id;
    /**
     * 昵称
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 学校
     */
    private Integer universityId;
    /**
     * 专业
     */
    private Integer majorId;

    /**
     * 是否为管理员
     */
    private boolean isAdmin;
}
