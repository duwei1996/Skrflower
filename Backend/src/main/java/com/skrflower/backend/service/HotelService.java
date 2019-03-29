package com.skrflower.backend.service;

import com.skrflower.backend.bean.Hotel;
import com.skrflower.backend.dao.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    HotelDao hotelDao;

    public List<Hotel> findByCategory(String categoryName){
        return hotelDao.findByCategory(categoryName);
    }

    public List<Hotel> findByTag(String tagName){
        return hotelDao.findByTag(tagName);
    }

    public List<Hotel> findByDest(String destName){
        return hotelDao.findByDest(destName);
    }

    public Hotel findById(Integer id){
        return hotelDao.findById(id);
    }

    public Hotel findByName(String name){
        return hotelDao.findByName(name);
    }
}
