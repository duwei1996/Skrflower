package com.skrflower.backend.bean;

import java.util.Date;

public class Guideline {

    private Integer guideId;
    private String guideName;
    private String content;
    private String label;
    private Date time;
    private String type;

    private User author;

    public Guideline() {
    }

    public Integer getGuideId() {
        return guideId;
    }

    public Guideline(Integer guideId, String guideName, String content, String label, Date time, String type, User author) {
        this.guideId = guideId;
        this.guideName = guideName;
        this.content = content;
        this.label = label;
        this.time = time;
        this.type = type;
        this.author = author;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
