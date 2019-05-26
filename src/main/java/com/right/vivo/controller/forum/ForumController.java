package com.right.vivo.controller.forum;

import com.right.vivo.bl.forum.ForumService;
import com.right.vivo.vo.PostForm;
import com.right.vivo.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Zhang Jianrong
 * @date 2019/5/26
 */
@RestController
@RequestMapping("/forum")
public class ForumController {
    private final ForumService forumService;

    @Autowired
    public ForumController(ForumService forumService){
        this.forumService = forumService;
    }

    @GetMapping("/get")
    public ResponseVO getForumIdByMajorId(@RequestParam int majorId){
        return ResponseVO.buildSuccess(forumService.getForumIdByMajorId(majorId));
    }

    @GetMapping("/post")
    public ResponseVO getPostsByForumId(@RequestParam int forumId){
        return ResponseVO.buildSuccess(forumService.getPostsByForumId(forumId));
    }

    @GetMapping("/post/replies")
    public ResponseVO getRepliesByPostId(@RequestParam int postId){
        return ResponseVO.buildSuccess(forumService.getRepliesByPostId(postId));
    }

    @PostMapping("/post/add")
    public ResponseVO addPost(@RequestBody PostForm postForm){
        forumService.addPost(postForm);
        return ResponseVO.buildSuccess();
    }

    @PostMapping("/post/delete")
    public ResponseVO deletePost(@RequestParam int postId){
        forumService.deletePost(postId);
        return ResponseVO.buildSuccess();
    }

    @PostMapping("/post/update")
    public ResponseVO deletePost(@RequestBody PostForm postForm){
        forumService.updatePost(postForm);
        return ResponseVO.buildSuccess();
    }
}
