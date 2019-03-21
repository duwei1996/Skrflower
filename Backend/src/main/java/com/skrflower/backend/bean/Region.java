package com.skrflower.backend.bean;

public class Region {

    private Integer regionId;
    private String regionName;
    private Integer regionNum;
    private Integer parentRegionNum;

    public Region() {
    }

    public Region(Integer regionId, String regionName, Integer regionNum, Integer parentRegionNum) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.regionNum = regionNum;
        this.parentRegionNum = parentRegionNum;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(Integer regionNum) {
        this.regionNum = regionNum;
    }

    public Integer getParentRegionNum() {
        return parentRegionNum;
    }

    public void setParentRegionNum(Integer parentRegionNum) {
        this.parentRegionNum = parentRegionNum;
    }
}
