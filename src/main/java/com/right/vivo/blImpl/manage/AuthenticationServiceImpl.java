package com.right.vivo.blImpl.manage;


import com.right.vivo.bl.manage.AuthenticationService;
import com.right.vivo.data.manage.AuthenticationMapper;
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
    public void passAuthen(int userId) {
        authenticationMapper.passAuthen(userId);
    }



}
