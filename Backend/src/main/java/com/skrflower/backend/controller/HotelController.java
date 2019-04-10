package com.skrflower.backend.controller;

import com.skrflower.backend.bean.Hotel;
import com.skrflower.backend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin//跨域注解
@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/findByCategory")
    public Map<String,Object> findByCategory(String categoryName){
        Map<String, Object> map = new HashMap<>();
        List<Hotel> list = hotelService.findByCategory(categoryName);
        map.put("hotels", list);
        return map;
    }
    @GetMapping("/findByTag")
    public Map<String,Object> findByTag(String tagName){
        Map<String, Object> map = new HashMap<>();
        List<Hotel> list = hotelService.findByTag(tagName);
        map.put("hotels", list);
        return map;
    }
    @GetMapping("/findByDest")
    public Map<String,Object> findByDest(String destName){
        Map<String, Object> map = new HashMap<>();
        List<Hotel> list = hotelService.findByDest(destName);
        map.put("hotels", list);
        return map;
    }

    @GetMapping("/findById")
    public Map<String,Object> findById(Integer hotelId){
        Map<String, Object> map = new HashMap<>();
        Hotel hotel = hotelService.findById(hotelId);
        map.put("hotel", hotel);
        return map;
    }

    @GetMapping("/findByName")
    public Map<String,Object> findByName(String hotelName){
        Map<String, Object> map = new HashMap<>();
        Hotel hotel = hotelService.findByName(hotelName);
        map.put("hotel", hotel);
        return map;
    }
}
