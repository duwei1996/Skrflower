package com.skrflower.backend.service;

import com.skrflower.backend.bean.Guideline;
import com.skrflower.backend.dao.GuidelineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuidelineService {

    @Autowired
    GuidelineDao guidelineDao;

    public Guideline findById(Integer id){
        return guidelineDao.findById(id);
    }

    public Guideline findByGuideName(String guidName){
        return guidelineDao.findByGuideName(guidName);
    }

    public List<Guideline> findByCategory(String categoryName){
        return guidelineDao.findByCategory(categoryName);
    }

    public List<Guideline> findByTag(String tag){
        return guidelineDao.findByTag(tag);
    }
}
