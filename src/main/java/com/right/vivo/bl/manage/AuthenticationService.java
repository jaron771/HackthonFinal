package com.right.vivo.bl.manage;

public interface AuthenticationService {

    /**
     * 身份验证
     */
    String passAuthen(int userId, boolean isAccepted);

}
