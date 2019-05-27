package com.right.vivo.blImpl.forum;

import com.right.vivo.bl.forum.ForumService;
import com.right.vivo.po.Post;
import com.right.vivo.vo.PostForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ForumServiceImpl implements ForumService {

    @Override
    public int getForumIdByMajorId(int majorId) {
        return 0;
    }

    @Override
    public List<Post> getPostsByForumId(int forumId) {
        return new ArrayList<>();
    }

    @Override
    public List<Post> getRepliesByPostId(int postId) {
        return new ArrayList<>();
    }

    @Override
    public void addPost(PostForm postForm) {
    }

}
