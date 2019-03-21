package com.skrflower.backend.bean;

import java.util.Date;

public class Comment {

    protected Integer commentId;
    protected String content;
    protected Date time;
    protected User author;

    public Comment() {
    }

    public Comment(Integer commentId, String content, Date time, User author) {
        this.commentId = commentId;
        this.content = content;
        this.time = time;
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

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
