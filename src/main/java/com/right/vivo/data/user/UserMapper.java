package com.right.vivo.data.user;

import com.right.vivo.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author DW
 * @date 2019/5/26
 */

@Mapper
public interface UserMapper {
    /**
     * 创建一个新的账号
     *
     * @param username
     * @param password
     * @return
     */
    public int createNewAccount(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名查找账号
     *
     * @param name
     * @return
     */
    public User getAccountByName(@Param("name") String name);
}
