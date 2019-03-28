package com.skrflower.backend.bean;

import java.util.List;

public class Site {

    private Integer siteId;
    private String siteName;
    private String description;
    private String info;
    private Integer categoryId;
    private Integer destId;

    private List<Comment> comments;

    public Site() {
    }

    public Site(String siteName, String description, String info, Integer categoryId, Integer destId) {
        this.siteName = siteName;
        this.description = description;
        this.info = info;
        this.categoryId = categoryId;
        this.destId = destId;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getDestId() {
        return destId;
    }

    public void setDestId(Integer destId) {
        this.destId = destId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
