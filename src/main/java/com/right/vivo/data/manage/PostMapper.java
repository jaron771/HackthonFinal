package com.right.vivo.data.manage;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author cdx
 * @date 2019/5/26
 */
@Mapper
public interface PostMapper {
    /**
     * 删除一个帖子
     */
    void deletePost(int postId);

    /**
     * 恢复一个帖子
     */
    void recoverPost(int postId);

}
