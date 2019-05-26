package com.right.vivo.controller.school;

import com.right.vivo.bl.school.SchoolService;
import com.right.vivo.vo.ResponseVO;
import com.right.vivo.vo.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author DW
 * @date 2019/5/26
 */
@RestController()
@RequestMapping("/search")
public class SchoolController {
    private final SchoolService schoolService;

    @Autowired
    SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/findSchool")
    public ResponseVO search(@RequestBody SearchForm form) {
        return ResponseVO.buildSuccess(schoolService.search(form));
    }

    @GetMapping("/getSchool")
    public ResponseVO getSchool() {
        return ResponseVO.buildSuccess(schoolService.getSchool());
    }

    @GetMapping("/getSchoolInfo/{schoolId}")
    public ResponseVO getSchoolInfo(@PathVariable int schoolId) {
        return ResponseVO.buildSuccess(schoolService.getSchoolInfo(schoolId));
    }

    @GetMapping("/getMajorInfo/{major}")
    public ResponseVO getMajorInfo(@PathVariable int major) {
        return ResponseVO.buildSuccess(schoolService.getMajorInfo(major));
    }

    @GetMapping("/getMajorScore/{major}/{region}")
    public ResponseVO getMajorScore(@PathVariable int major, @PathVariable String region) {
        return ResponseVO.buildSuccess(schoolService.getMajorScore(major,region));
    }


}
