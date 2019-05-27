package com.right.vivo.controller.school;

import com.right.vivo.bl.school.SchoolService;
import com.right.vivo.vo.MajorVO;
import com.right.vivo.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/getSchool")
    public ResponseVO getSchool() {
        return ResponseVO.buildSuccess(schoolService.getSchool());
    }

    @GetMapping("/get/SchoolInfo/{schoolId}")
    public ResponseVO getSchoolInfo(@PathVariable int schoolId) {
        return ResponseVO.buildSuccess(schoolService.getSchoolInfo(schoolId));
    }

    @GetMapping("/getMajorInfo/{majorId}")
    public ResponseVO getMajorInfo(@PathVariable int majorId) {
        return ResponseVO.buildSuccess(new MajorVO(schoolService.getMajorInfo(majorId)));
    }

    @GetMapping("/getMajorScore/{major}/{region}")
    public ResponseVO getMajorScore(@PathVariable int major, @PathVariable String region) {
        return ResponseVO.buildSuccess(schoolService.getMajorScore(major, region));
    }


}
