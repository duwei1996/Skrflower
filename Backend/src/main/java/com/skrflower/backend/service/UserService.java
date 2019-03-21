package com.skrflower.backend.service;

import com.skrflower.backend.bean.User;
import com.skrflower.backend.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User findById(Integer id){
        return userDao.findById(id);
    }

    public User findByUsername(String username){
        return userDao.findByUsername(username);
    }
}
