package cn.edu.swpu.wxzx.provider.mapper;

import cn.edu.swpu.wxzx.provider.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(User user);      //将用户信息插入数据库

    String findPrivateKey(@Param("username") String username,@Param("public_key") String public_key); //通过用户名和p*q查找私钥
}
