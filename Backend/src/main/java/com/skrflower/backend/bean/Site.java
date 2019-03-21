package com.skrflower.backend.bean;

public class Site {

    private Integer siteId;
    private String siteName;
    private String description;
    private String info;
    private String label;
    private Integer regionNum;

    public Site() {
    }

    public Site(Integer siteId, String siteName, String description, String info, String label, Integer regionNum) {
        this.siteId = siteId;
        this.siteName = siteName;
        this.description = description;
        this.info = info;
        this.label = label;
        this.regionNum = regionNum;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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
