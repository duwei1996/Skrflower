package com.skrflower.backend.bean;

public class Destination {

    private Integer destId;
    private String destName;
    private Integer categoryId;
    private Integer regionNum;

    public Destination() {
    }

    public Destination(String destName, Integer categoryId, Integer regionNum) {
        this.destName = destName;
        this.categoryId = categoryId;
        this.regionNum = regionNum;
    }

    public Integer getDestId() {
        return destId;
    }

    public void setDestId(Integer destId) {
        this.destId = destId;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
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

    @Override
    public String toString() {
        return "[" + destId + "," + destName + "," + categoryId + "," + regionNum + "]";
    }
}
