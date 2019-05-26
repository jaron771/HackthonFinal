package com.right.vivo.controller.user;

import com.right.vivo.bl.user.UserService;
import com.right.vivo.po.User;
import com.right.vivo.vo.ResponseVO;
import com.right.vivo.vo.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author DW
 */
@RestController()
@RequestMapping("/user")
public class UserController {
    private final static String ACCOUNT_INFO_ERROR = "用户名或密码错误";
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseVO login(@RequestBody UserForm userForm, HttpSession session) {

        User user = userService.login(userForm);
        if (user == null) {
            return ResponseVO.buildFailure(ACCOUNT_INFO_ERROR);
        }
        //注册session
        session.setAttribute("user",userForm);
        return ResponseVO.buildSuccess(user);
    }

    @PostMapping("/register")
    public ResponseVO registerAccount(@RequestBody UserForm userForm) {
        try {
            userService.registerAccount(userForm);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("注册失败");
        }

        return ResponseVO.buildSuccess();
    }

    @PostMapping("/logout")
    public String logOut() {

        return "index";
    }
}
