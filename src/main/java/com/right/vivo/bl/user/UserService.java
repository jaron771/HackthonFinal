package com.right.vivo.bl.user;

import com.right.vivo.po.User;
import com.right.vivo.vo.UserForm;

/**
 * @author DW
 * @date 2019/5/26
 */


public interface UserService {

    User login(UserForm userForm);

    void registerAccount(UserForm userForm);

    User getUserById(int userId);

}
