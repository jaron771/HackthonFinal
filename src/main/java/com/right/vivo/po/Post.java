package com.right.vivo.po;

public class Post {

    private int id;

    /**
     * 论坛id
     */
    private int forumId;

    /**
     * 帖子主题
     */
    private String theme;

    /**
     * 帖子内容
     */
    private String content;

    /**
     * 是否是回帖，0为否，1为是
     */
    private int isReply;
}
