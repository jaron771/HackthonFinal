package com.right.vivo.bl.manage;

import com.right.vivo.vo.ResponseVO;


/**
 * @author cdx
 * @date 2019/5/26 2:30 PM
 */

public interface PostService {
    /**
     * 删除帖子
     */
    ResponseVO deletePost(int postId);

    /**
     * 恢复帖子
     */
    ResponseVO recoverPost(int postId);
}
