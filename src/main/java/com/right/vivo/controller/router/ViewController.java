package com.right.vivo.controller.router;

import com.right.vivo.bl.school.SchoolService;
import com.right.vivo.po.University;
import com.right.vivo.vo.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
    private final SchoolService schoolService;

    @Autowired
    ViewController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

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

    @PostMapping("/search/findSchool")
    public String search(@RequestParam("region") String region, @RequestParam("lowScore") int lowScore, @RequestParam("highScore") int highScore, @RequestParam("university") String university, @RequestParam("major") String major, ModelMap map) {
        SearchForm form = new SearchForm();
        form.setRegion(region);
        form.setLowScore(lowScore);
        form.setHighScore(highScore);
        form.setMajor(major);
        form.setUniversity(university);

        map.addAttribute("VOS", schoolService.search(form));
        return "searchResult";
    }


    @GetMapping("/search/getSchoolInfo")
    public String getSchoolInfo(@RequestParam("universityId") int universityId, ModelMap map) {
        University u = schoolService.getSchoolInfo(universityId).getUniversity();
        map.addAttribute("university", u);
        return "universityInfo";

    @RequestMapping(value = "/add/post")
    public String getAddPost(@RequestParam int majorId) {
        return "addPost";

    }
}
