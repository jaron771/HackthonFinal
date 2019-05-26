package com.right.vivo.vo;

import lombok.Data;

/**
 * @author DW
 * @date 2019/5/26
 */
@Data
public class UserForm {
    /**
     * 用户名，不可重复
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
}
