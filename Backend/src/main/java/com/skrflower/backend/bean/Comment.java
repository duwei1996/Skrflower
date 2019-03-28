package com.skrflower.backend.bean;

import java.util.Date;

public class Comment {

    protected Integer commentId;
    protected String content;
    protected Date time;

    private Integer otherId;

    private User author;

    public Comment() {
    }

    public Comment(String content, Date time, Integer otherId, User author) {
        this.content = content;
        this.time = time;
        this.otherId = otherId;
        this.author = author;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
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

    public Integer getOtherId() {
        return otherId;
    }

    public void setOtherId(Integer otherId) {
        this.otherId = otherId;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
