package com.right.vivo.controller.user;

import com.right.vivo.bl.user.UserService;
import com.right.vivo.config.InterceptorConfiguration;
import com.right.vivo.po.User;
import com.right.vivo.vo.ResponseVO;
import com.right.vivo.vo.UserForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author DW
 */
@RestController()
@RequestMapping("/user")
public class UserController {
    private static final String ACCOUNT_INFO_ERROR = "用户名或密码错误";
    private final UserService userService;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

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
        session.setAttribute(InterceptorConfiguration.SESSION_KEY, userForm);
        return ResponseVO.buildSuccess(user);
    }

    @PostMapping("/register")
    public ResponseVO registerAccount(@RequestBody UserForm userForm) {
        try {
            userService.registerAccount(userForm);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            return ResponseVO.buildFailure("注册失败");
        }

        return ResponseVO.buildSuccess();
    }

    @GetMapping("/get/{userId}")
    public ResponseVO getUserInfo(@PathVariable int userId) {
        try {
            return ResponseVO.buildSuccess(userService.getUserById(userId));
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            return ResponseVO.buildFailure("失败");
        }

    }

    @PostMapping("/logout")
    public String logOut() {

        return "index";
    }
}
