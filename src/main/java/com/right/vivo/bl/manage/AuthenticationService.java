package com.right.vivo.bl.manage;

import com.right.vivo.vo.ResponseVO;


public interface AuthenticationService {

    /**
     * 通过验证
     */
    ResponseVO passAuthen();

    /**
     * 拒绝验证
     */
    ResponseVO refuseAuthen();

}
