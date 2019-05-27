package com.right.vivo.bl.forum;

import com.right.vivo.po.Post;
import com.right.vivo.vo.PostForm;

import java.util.List;


public interface ForumService {

    /**
     * 根据专业id获取论坛id
     *
     * @param majorId
     * @return
     */
    int getForumIdByMajorId(int majorId);
    //TODO 返回值类型？

    /**
     * 获取论坛的帖子
     *
     * @param forumId
     * @return
     */
    List<Post> getPostsByForumId(int forumId);

    /**
     * 获取帖子的回帖
     *
     * @param postId
     * @return
     */
    List<Post> getRepliesByPostId(int postId);

    /**
     * 发帖
     *
     * @param postForm
     * @return
     */
    void addPost(PostForm postForm);

    /**
     * 删帖
     *
     * @param postId
     * @return
     */
    void deletePost(int postId);

    /**
     * 更新帖
     *
     * @param postForm
     * @return
     */
    void updatePost(PostForm postForm);
}
