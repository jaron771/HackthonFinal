package com.right.vivo.vo;

import lombok.Data;

import java.util.Calendar;

@Data
public class PostForm {
    private int userId;

    private int forumId;

    private String title;

    private String content;

    private boolean delete;

    private int prePostId;

    private Calendar sendTime;
}
