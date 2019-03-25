package com.skrflower.backend.dao;

import com.skrflower.backend.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User findById(Integer id);

    User findByUsername(String username);

    //当mapper接口方法有多个参数时，java不会保存行参的记录,需要使用 @Param 帮助传入参数完成映射
    User findByNameAndPwd(@Param("username") String username,@Param("password") String password);

    void addUser(User user);

    void updateUser(User user);
}
