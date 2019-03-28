package com.skrflower.backend.bean;

import java.util.Date;
import java.util.List;

public class Guideline {

    private Integer guidId;
    private String guidName;
    private String content;
    private Date time;
    private Integer categoryId;

    private User author;
    private List<Comment> comments;

    public Guideline() {
    }

    public Guideline(String guidName, String content, Date time, Integer categoryId, User author) {
        this.guidName = guidName;
        this.content = content;
        this.time = time;
        this.categoryId = categoryId;
        this.author = author;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "[" + guidId + "," + guidName + "," + categoryId + "," + content + "]";
    }
}
