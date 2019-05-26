package com.right.vivo.blImpl.forum;

import com.right.vivo.bl.forum.ForumService;
import com.right.vivo.po.Post;
import com.right.vivo.vo.PostForm;
import com.right.vivo.vo.ResponseVO;

import java.util.List;

public class ForumServiceImpl implements ForumService{

    @Override
    public int getForumIdByMajorId(int majorId){
        return 0;
    }

    @Override
    public List<Post> getPostsByForumId(int forumId){
        return null;
    }

    @Override
    public List<Post> getRepliesByPostId(int postId){
        return null;
    }

    @Override
    public void addPost(PostForm postForm){
    }

    @Override
    public void deletePost(int postId){
    }

    @Override
    public void updatePost(PostForm postForm){
    }
}
