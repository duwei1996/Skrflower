package com.skrflower.backend.bean;

import java.util.List;

public class Hotel {

    private Integer hotelId;
    private String hotelName;
    private double price;
    private String description;
    private Integer categoryId;
    private Integer regionNum;

    List<Comment> comments;

    public Hotel() {
    }

    public Hotel(String hotelName, double price, String description, Integer categoryId, Integer regionNum) {
        this.hotelName = hotelName;
        this.price = price;
        this.description = description;
        this.categoryId = categoryId;
        this.regionNum = regionNum;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(Integer regionNum) {
        this.regionNum = regionNum;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
