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

import java.util.ArrayList;
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
        //获取分数
        List<AdmissionScore> scores = schoolMapper.selectMajorByScore(form.getLowScore(), form.getHighScore(), form.getRegion());
        List<AdmissionScore> tempScore = new ArrayList<>();
        //检索院系
        if (form.getMajor() != null && !"".equals(form.getMajor())) {
            for (AdmissionScore admissionScore : scores) {
                if (admissionScore.getMajorName().equals(form.getMajor())) {
                    tempScore.add(admissionScore);
                }
            }
        } else {
            tempScore = scores;
        }
        List<Major> majors = new ArrayList<>();
        for (AdmissionScore admissionScore : tempScore) {
            majors.add(schoolMapper.selectMajorById(admissionScore.getMajorId()));
        }
        //检索学校
        List<University> universities = new ArrayList<>();
        if (form.getUniversity() != null && !"".equals(form.getUniversity())) {
            for (Major m : majors) {
                University u = schoolMapper.selectUniversityById(m.getUniversityId());
                if (u.getName().equals(form.getUniversity()) && !universities.contains(u)) {
                    universities.add(u);
                }
            }
        } else {
            for (Major m : majors) {
                University u = schoolMapper.selectUniversityById(m.getUniversityId());
                if (!universities.contains(u)) {
                    universities.add(u);
                }
            }
        }
        //包装成CollegeVO
        List<CollegeVO> collegeVOS = new ArrayList<>();
        for (int i = universities.size() - 1; i > -1; i--) {
            CollegeVO c = new CollegeVO();
            University u = universities.remove(i);
            c.setUniversity(u);
            c.setMajors(new ArrayList<>());
            for (int j = majors.size() - 1; j > -1; j--) {
                if (majors.get(j).getUniversityId().equals(u.getId())) {
                    c.getMajors().add(majors.remove(j));
                }
            }
            collegeVOS.add(c);
        }
        return collegeVOS;
    }

    @Override
    public List<Map<Integer, String>> getSchool() {
        return null;
    }

    @Override
    public CollegeVO getSchoolInfo(int schoolId) {
        University university = schoolMapper.selectUniversityById(schoolId);
        List<Major> majors = schoolMapper.selectMajorsByUniId(schoolId);
        CollegeVO collegeVO = new CollegeVO(university, majors);
        return collegeVO;
    }

    @Override
    public Major getMajorInfo(int majorId) {
        return null;
    }

    @Override
    public AdmissionScore getMajorScore(int major, String region) {
        return null;
    }


}
