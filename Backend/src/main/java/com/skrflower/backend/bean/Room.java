package com.skrflower.backend.bean;

public class Room {

    private Integer roomId;
    private double proice;
    private Integer capacity;
    private String label;
    private String type;
    private Hotel hotel;

    public Room() {
    }

    public Room(Integer roomId, double proice, Integer capacity, String label, String type, Hotel hotel) {
        this.roomId = roomId;
        this.proice = proice;
        this.capacity = capacity;
        this.label = label;
        this.type = type;
        this.hotel = hotel;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public double getProice() {
        return proice;
    }

    public void setProice(double proice) {
        this.proice = proice;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
