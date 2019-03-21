package com.skrflower.backend.bean;

public class Hotel {

    private Integer hotelId;
    private String hotelName;
    private double price;
    private String description;
    private String label;
    private Integer regionNum;

    public Hotel() {
    }

    public Hotel(Integer hotelId, String hotelName, double price, String description, String label, Integer regionNum) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.price = price;
        this.description = description;
        this.label = label;
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(Integer regionNum) {
        this.regionNum = regionNum;
    }
}
