package com.right.vivo.bl.manage;

/**
 * @author cdx
 * @date 2019/5/26 2:30 PM
 */

public interface PostService {
    /**
     * 删除帖子
     */
    void deletePost(int postId);

    /**
     * 恢复帖子
     */
    void recoverPost(int postId);
}
