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
    private String university;
    /**
     * 院系
     */
    private String department;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 是否为管理员
     */
    private boolean isAdministrator;


}
