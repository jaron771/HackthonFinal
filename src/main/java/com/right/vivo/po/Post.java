package com.right.vivo.po;


import lombok.Data;

import java.util.Calendar;

@Data
public class Post {

    private Integer id;

    /**
     * 论坛id
     */
    private Integer forumId;

    /**
     * 帖子主题
     */
    private String title;

    /**
     * 帖子内容
     */
    private String content;

    /**
     * 父贴id。如果为-1，表示为父贴；否则为回帖，表示父贴id。
     */
    private Integer prePostId;
    /**
     * 是否被删除,true表示删除
     */
    private Boolean delete;
    /**
     * 发布时间
     */
    private Calendar sendTime;

}
