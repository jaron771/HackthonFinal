package com.right.vivo.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -10L;

    private Integer id;
    /**
     * 昵称
     */
    private String username;
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
