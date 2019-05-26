package com.right.vivo.data.school;

import com.right.vivo.po.Major;
import com.right.vivo.po.University;
import com.right.vivo.vo.SearchForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author DW
 * @date 2019/5/26
 */

@Mapper
public interface SchoolMapper {

    List<University> searchSchoolByForm(SearchForm form);

    University selectUniversityById(@Param("universityId") int universityId);

    List<Major> selectMajorsByUniId(@Param("universityId") int universityId);
}
