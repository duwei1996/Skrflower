package com.skrflower.backend.dao;

import com.skrflower.backend.bean.Guideline;

import java.util.List;

public interface GuidelineDao {

    Guideline findById(Integer id);

    Guideline findByGuideName(String guidName);

    List<Guideline> findByCategory(String categoryName);

    List<Guideline> findByTag(String tag);

}
