package com.right.vivo.blImpl.school;

import com.right.vivo.bl.school.SchoolService;
import com.right.vivo.blImpl.forum.ForumServiceForBl;
import com.right.vivo.data.school.SchoolMapper;
import com.right.vivo.po.AdmissionScore;
import com.right.vivo.po.Major;
import com.right.vivo.po.University;
import com.right.vivo.vo.CollegeVO;
import com.right.vivo.vo.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author DW
 * @date 2019/5/26
 */
@Service
public class SchoolServiceImpl implements SchoolService, ForumServiceForBl {
    private SchoolMapper schoolMapper;

    @Autowired
    SchoolServiceImpl(SchoolMapper schoolMapper) {
        this.schoolMapper = schoolMapper;
    }

    @Override
    public List<CollegeVO> search(SearchForm form) {
        schoolMapper.searchSchoolByForm(form);
        return null;
    }

    @Override
    public List<Map<Integer, String>> getSchool() {
        return null;
    }

    @Override
    public University getSchoolInfo(int schoolId) {
        return null;
    }

    @Override
    public Major getMajorInfo(int majorId) {
        return null;
    }

    @Override
    public AdmissionScore getMajorScore(int major, String region) {
        return null;
    }


    public List<University> searchSchoolByForm(SearchForm form) {
        return schoolMapper.searchSchoolByForm(form);
    }
}
