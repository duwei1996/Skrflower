package com.skrflower.backend.dao;

import com.skrflower.backend.bean.Guideline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class GuidelineDaoTest {

    @Autowired
    GuidelineDao guidelineDao;

    @Test
    public void findById(){
        Guideline guideline = guidelineDao.findById(1);
        System.out.println(guideline);
    }

    @Test
    public void findByCategory(){
        List<Guideline> list = guidelineDao.findByCategory("国内攻略");
        for (Guideline g:list) {
            System.out.println(g);
        }
    }

    @Test
    public void findByTag(){
        List<Guideline> list = guidelineDao.findByTag("四川");
        for (Guideline g:list) {
            System.out.println(g);
        }
    }
}
