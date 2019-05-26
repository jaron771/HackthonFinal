package com.right.vivo.controller.manage;


import com.right.vivo.bl.manage.AuthenticationService;
import com.right.vivo.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 身份验证
 *
 * @author cdx
 * @date 2019/5/26 3:39 PM
 */

@RestController
@RequestMapping("/authen")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping(value = "/pass/{userId}/{isAccepted}")
    public ResponseVO passAuthen(@PathVariable int userId, @PathVariable boolean isAccepted) {
        try {
            return ResponseVO.buildSuccess(authenticationService.passAuthen(userId, isAccepted));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }



}