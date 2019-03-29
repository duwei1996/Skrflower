package com.skrflower.backend.dao;

import com.skrflower.backend.bean.Hotel;

import java.util.List;

public interface HotelDao {

    List<Hotel> findByCategory(String categoryName);

    List<Hotel> findByTag(String tagName);

    List<Hotel> findByDest(String destName);

    Hotel findById(Integer id);

    Hotel findByName(String hotelName);


}
