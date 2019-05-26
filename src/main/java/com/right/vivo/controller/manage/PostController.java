package com.right.vivo.controller.manage;

import com.right.vivo.bl.manage.PostService;
import com.right.vivo.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 帖子管理
 *
 * @author cdx
 * @date 2019/5/26 2:21 PM
 */

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }


    @DeleteMapping(value = "/delete/{postId}")
    public ResponseVO deletePost(@PathVariable int postId) {
        return postService.deletePost(postId);
    }


    @PostMapping(value = "/recover/{postId}")
    public ResponseVO recoverPost(@PathVariable int postId) {
        return postService.recoverPost(postId);
    }


}
