package com.skrflower.backend.bean;

import java.util.Date;

public class SiteComment extends Comment {

    private Site site;

    public SiteComment() {
        super();
    }

    public SiteComment(Integer commentId, String content, Date time, User author, Site site) {
        super(commentId, content, time, author);
        this.site = site;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
