package com.skrflower.backend.bean;

import java.util.Date;

public class RoomComment extends Comment {

    private Room room;

    public RoomComment() {
        super();
    }

    public RoomComment(Integer commentId, String content, Date time, User author, Room room) {
        super(commentId, content, time, author);
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
