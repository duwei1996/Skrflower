package com.skrflower.backend.dao;

import com.skrflower.backend.bean.Destination;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class DestinationDaoTest {
    
    @Autowired
    DestinationDao destinationDao;
    
    @Test
    public void findByCategory(){
        List<Destination> list = destinationDao.findByCategory("国内");
        for (Destination d :list) {
            System.out.println(d);
        }
    }

    @Test
    public void findByTag(){
        List<Destination> list = destinationDao.findByTag("购物");
        for (Destination d :list) {
            System.out.println(d);
        }
    }
    @Test
    public void findByTags(){
        List<String> tags = new ArrayList<>();
        tags.add("美食");
        tags.add("购物");
        tags.add("拍片圣地");
        List<Destination> list = destinationDao.findByTags(tags);
        for (Destination d :list) {
            System.out.println(d);
        }
    }
}
