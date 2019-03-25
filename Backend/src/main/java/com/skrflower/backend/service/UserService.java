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

    public User findByNameAndPwd(String username, String password) {
        return userDao.findByNameAndPwd(username, password);
    }

    public boolean isUser(String username,String password){
        User user = findByNameAndPwd(username, password);
        if (user == null){
            return false;
        }
        return true;
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }
}
