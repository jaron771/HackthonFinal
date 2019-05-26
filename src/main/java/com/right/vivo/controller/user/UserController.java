package com.right.vivo.controller.user;

import com.right.vivo.bl.user.UserService;
import com.right.vivo.po.User;
import com.right.vivo.vo.ResponseVO;
import com.right.vivo.vo.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DW
 */
@RestController()
public class UserController {
    private final static String ACCOUNT_INFO_ERROR = "用户名或密码错误";
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseVO login(@RequestBody UserForm userForm) {
        User user = userService.login(userForm);
        if (user == null) {
            return ResponseVO.buildFailure(ACCOUNT_INFO_ERROR);
        }

        return ResponseVO.buildSuccess(user);
    }

    @PostMapping("/register")
    public ResponseVO registerAccount(@RequestBody UserForm userForm) {
        return userService.registerAccount(userForm);
    }

    @PostMapping("/logout")
    public String logOut() {

        return "index";
    }
}
