package com.right.vivo.data.forum;

import com.right.vivo.po.Forum;
import com.right.vivo.po.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author DW
 * @date 2019/5/26
 */
@Mapper
public interface ForumMapper {
    Forum selectForumByMajorId(@Param("majorId") int majorId);

    List<Post> selectPostsByForumId(@Param("forumId") int forumId);

    List<Post> selectRepliesByPostId(@Param("postId") int postId);

    void insertPost(Post post);

    void deletePost(@Param("postId") int postId);

    void updatePost(Post post);

}
