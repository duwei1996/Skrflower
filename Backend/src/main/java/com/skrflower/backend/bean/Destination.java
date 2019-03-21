package com.skrflower.backend.bean;

public class Destination {

    private Integer destId;
    private String destName;
    private String label;
    private Integer regionNum;

    public Destination() {
    }

    public Destination(Integer destId, String destName, String label, Integer regionNum) {
        this.destId = destId;
        this.destName = destName;
        this.label = label;
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
