package com.right.vivo.blImpl.manage;

import com.right.vivo.bl.manage.PostService;
import com.right.vivo.data.manage.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cdx
 * @date 2019/5/26 3:00 PM
 */

@Service
public class PostServiceImpl implements PostService {

    private final PostMapper postMapper;

    @Autowired
    public PostServiceImpl(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public void deletePost(int postId) {
        postMapper.deletePost(postId);
    }


    public void recoverPost(int postId) {
        postMapper.recoverPost(postId);
    }


}
