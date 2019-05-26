package com.right.vivo.blImpl.manage;


import com.right.vivo.bl.manage.AuthenticationService;
import com.right.vivo.data.manage.AuthenticationMapper;
import com.right.vivo.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationMapper authenticationMapper;

    @Autowired
    public AuthenticationServiceImpl(AuthenticationMapper authenticationMapper) {
        this.authenticationMapper = authenticationMapper;
    }

    @Override
    public ResponseVO passAuthen() {
        try {
            authenticationMapper.passAuthen();
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }

    @Override
    public ResponseVO refuseAuthen() {
        return ResponseVO.buildFailure("认证不通过");
    }


}
