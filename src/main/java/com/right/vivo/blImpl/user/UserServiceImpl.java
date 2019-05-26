package com.right.vivo.blImpl.user;

import com.right.vivo.bl.user.UserService;
import com.right.vivo.data.user.UserMapper;
import com.right.vivo.po.User;
import com.right.vivo.vo.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DW
 * @date 2019/5/26
 */
@Service
public class UserServiceImpl implements UserService {
    private final static String ACCOUNT_EXIST = "账号已存在";
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(UserForm userForm) {
        User user = userMapper.getAccountByName(userForm.getUsername());
        System.out.println(user);
        if (null == user || !user.getPassword().equals(userForm.getPassword())) {
            System.out.println(userForm);
            return null;
        }
        return user;
    }

    @Override
    public void registerAccount(UserForm userForm) {
        userMapper.createNewAccount(userForm.getUsername(), userForm.getPassword());
    }
}
