package com.skrflower.backend.controller;

import com.skrflower.backend.bean.Destination;
import com.skrflower.backend.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/destination")
public class DestinationController {

    @Autowired
    DestinationService destinationService;

    @GetMapping("/findByName")
    public Map<String,Object> findByName(String destName){
        Map<String,Object> map = new HashMap<>();
        Destination destination = destinationService.findByName(destName);
        map.put("destination",destination);
        return map;
    }

    @GetMapping("/findByRegion")
    public Map<String,Object> findByRegion(Integer regionNum){
        Map<String,Object> map = new HashMap<>();
        List<Destination> list = destinationService.findByRegion(regionNum);
        map.put("destination",list);
        return map;
    }

    @GetMapping("/findByCategory")
    public Map<String,Object> findByCategory(String categoryName){
        Map<String,Object> map = new HashMap<>();
        List<Destination> list = destinationService.findByCategory(categoryName);
        map.put("destinations",list);
        return map;
    }

    @GetMapping("/findByTags")
    public Map<String,Object> findByTags(List<String> tags){
        Map<String,Object> map = new HashMap<>();
        List<Destination> list = destinationService.findByTags(tags);
        map.put("destinations",list);
        return map;
    }


}
