package com.skrflower.backend.bean;

import java.util.Date;

public class HotelComment extends Comment{

    private Hotel hotel;

    public HotelComment() {
        super();
    }

    public HotelComment(Integer commentId, String content, Date time, User author, Hotel hotel) {
        super(commentId, content, time, author);
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
