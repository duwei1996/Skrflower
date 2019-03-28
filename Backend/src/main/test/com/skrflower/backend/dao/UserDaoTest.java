package com.skrflower.backend.dao;


import com.skrflower.backend.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void addUser(){
        User user = new User("柳齐","123123","123@qq.com",24,"男",false);
        userDao.addUser(user);
    }

    @Test
    public void findById(){
        User user = userDao.findById(1);
        System.out.println(user);
    }
    @Test
    public void findByName(){
        User user = userDao.findByUsername("柳齐");
        System.out.println(user);
    }
    @Test
    public void update(){
        User user = userDao.findByUsername("柳齐");
        user.setPassword("bbb");
        userDao.updateUser(user);
    }

    @Test
    public void findByNP(){
        User user = userDao.findByNameAndPwd("阿才","123456");
        System.out.println(user);
    }
}
