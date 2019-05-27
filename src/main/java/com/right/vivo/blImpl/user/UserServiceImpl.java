package com.right.vivo.blImpl.user;

import com.right.vivo.bl.user.UserService;
import com.right.vivo.data.user.UserMapper;
import com.right.vivo.po.User;
import com.right.vivo.vo.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DW
 * @date 2019/5/26
 */
@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(UserForm userForm) {
        User user = userMapper.getAccountByName(userForm.getUsername());
        if (null == user || !user.getPassword().equals(userForm.getPassword())) {
            return null;
        }
        return user;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void registerAccount(UserForm userForm) {
        userMapper.createNewAccount(userForm.getUsername(), userForm.getPassword());
    }

    @Override
    public User getUserById(int userId) {
        return userMapper.getUserById(userId);
    }

}
