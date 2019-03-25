package com.skrflower.backend.dao;

import com.skrflower.backend.bean.User;

public interface UserDao {

    User findById(Integer id);

    User findByUsername(String username);

    User findByNameAndPwd(String username, String password);

    void addUser(User user);

    void updateUser(User user);
}
