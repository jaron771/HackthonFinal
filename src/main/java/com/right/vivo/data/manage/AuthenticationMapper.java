package com.right.vivo.data.manage;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthenticationMapper {

    void passAuthen(int userId);

}
