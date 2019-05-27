package com.right.vivo.data.school;

import com.right.vivo.po.AdmissionScore;
import com.right.vivo.po.Major;
import com.right.vivo.po.University;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author DW
 * @date 2019/5/26
 */

@Mapper
public interface SchoolMapper {
    University selectUniversityById(@Param("universityId") int universityId);

    List<Major> selectMajorsByUniId(@Param("universityId") int universityId);

    List<AdmissionScore> selectMajorByScore(@Param("lowScore") int lowScore, @Param("highScore") int highScore, @Param("region") String region);

    Major selectMajorById(@Param("majorId") int majorId);

}
