package com.right.vivo.controller.router;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
    @RequestMapping(value = "/index")
    public String getIndex() {
        return "index";
    }

    @RequestMapping(value = "/forum/search")
    public String getForumSearch() {
        return "forumSearch";
    }

    @RequestMapping(value = "/user/home")
    public String getUserHome() {
        return "userHome";
    }

    @RequestMapping(value = "/signUp")
    public String getSignUp() {
        return "signUp";
    }

    @RequestMapping(value = "/search")
    public String getLogin() {
        return "search";
    }

    @RequestMapping(value = "/search/result")
    public String getSearchResult(@RequestParam int universityId, @RequestParam(defaultValue = "-1") int majorId) {
        return "searchResult";
    }

    @RequestMapping(value = "/university/info")
    public String getUniversityInfo(@RequestParam int universityId) {
        return "universityInfo";
    }

    @RequestMapping(value = "/major/forum")
    public String getMajorForum(@RequestParam int majorId) {
        return "majorForum";
    }

    @RequestMapping(value = "/university/forum")
    public String getUniversityForum(@RequestParam int universityId) {
        return "universityForum";
    }

    @RequestMapping(value = "/add/post")
    public String getAddPost(@RequestParam int majorId) {
        return "addPost";
    }
}
