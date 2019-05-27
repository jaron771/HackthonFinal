package com.right.vivo.bl.school;


import com.right.vivo.po.AdmissionScore;
import com.right.vivo.po.Major;
import com.right.vivo.vo.CollegeVO;
import com.right.vivo.vo.SearchForm;

import java.util.List;
import java.util.Map;

/**
 * @author DW
 */
public interface SchoolService {
    /**
     * 根据表单选择学校范围
     *
     * @param form 地区分数等表单
     * @return 学校+专业列表 的列表
     */
    List<CollegeVO> search(SearchForm form);

    /**
     * 获取全部学校
     *
     * @return 学校和对应的序号
     */
    List<Map<Integer, String>> getSchool();

    /**
     * 获取学校信息
     */
    CollegeVO getSchoolInfo(int schoolId);

    /**
     * 获取专业信息
     */
    Major getMajorInfo(int majorId);

    /**
     * 获取分数信息，因为和地区有关，所以单独拿出来
     */
    AdmissionScore getMajorScore(int major, String region);


}
