package com.skrflower.backend.controller;

import com.skrflower.backend.bean.Guideline;
import com.skrflower.backend.service.GuidelineService;
import com.sun.javafx.fxml.builder.JavaFXFontBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/guideline")
public class GuidelineController {

    @Autowired
    GuidelineService guidelineService;

    @GetMapping("/findByName")
    public Map<String,Object> findByName(String name){
        Map<String, Object> map = new HashMap<>();
        Guideline guideline = guidelineService.findByGuideName(name);
        map.put("guideline", guideline);
        return map;
    }
    @GetMapping("/findByCategory")
    public Map<String,Object> findByCategory(String categoryName){
        Map<String, Object> map = new HashMap<>();
        List<Guideline> list = guidelineService.findByCategory(categoryName);
        map.put("guidelines",list);
        return map;
    }
    @GetMapping("/findByTag")
    public Map<String,Object> findByTag(String tag){
        Map<String,Object> map = new HashMap<>();
        List<Guideline> list = guidelineService.findByTag(tag);
        map.put("guidelines", list);
        return map;
    }
}
