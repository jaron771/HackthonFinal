package com.right.vivo.blImpl.manage;

import com.right.vivo.bl.manage.PostService;
import com.right.vivo.data.manage.PostMapper;
import com.right.vivo.vo.ResponseVO;
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

    public ResponseVO deletePost(int postId) {
        try {
            postMapper.deletePost(postId);
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }


    public ResponseVO recoverPost(int postId) {
        try {
            postMapper.recoverPost(postId);
            return ResponseVO.buildSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }


}
