package com.skrflower.backend.bean;

import java.util.Date;

public class GuidelineCommnet extends Comment {

    private Guideline guideline;

    public GuidelineCommnet() {
        super();
    }

    public GuidelineCommnet(Integer commentId, String content, Date time, User author, Guideline guideline) {
        super(commentId, content, time, author);
        this.guideline = guideline;
    }

    public Guideline getGuideline() {
        return guideline;
    }

    public void setGuideline(Guideline guideline) {
        this.guideline = guideline;
    }
}
