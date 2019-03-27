package com.skrflower.backend.bean;

import java.util.Date;

public class Guideline {

    private Integer guidId;
    private String guidName;
    private String content;
    private Date time;
    private Integer userId;
    private Integer categoryId;

    public Guideline() {
    }

    public Guideline(String guidName, String content, Date time, Integer userId, Integer categoryId) {
        this.guidName = guidName;
        this.content = content;
        this.time = time;
        this.userId = userId;
        this.categoryId = categoryId;
    }

    public Integer getGuidId() {
        return guidId;
    }

    public void setGuidId(Integer guidId) {
        this.guidId = guidId;
    }

    public String getGuidName() {
        return guidName;
    }

    public void setGuidName(String guidName) {
        this.guidName = guidName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "[" + guidId + "," + guidName + "," + categoryId + "," + content + "]";
    }
}
