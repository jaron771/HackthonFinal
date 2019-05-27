package com.right.vivo.controller.manage;


import com.right.vivo.bl.manage.AuthenticationService;
import com.right.vivo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
    private final AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping(value = "/pass/{userId}")
    public ResponseVO passAuthen(@PathVariable int userId) {
        try {
            authenticationService.passAuthen(userId);
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            return ResponseVO.buildFailure("失败");
        }
    }


}
