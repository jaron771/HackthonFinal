package com.right.vivo.vo;

import com.right.vivo.po.Major;
import com.right.vivo.po.University;
import lombok.Data;

import java.util.List;

/**
 * @author DW
 * @date 2019/5/26
 */
@Data
public class CollegeVO {
    /**
     * 学校
     */
    private University university;
    /**
     * 专业列表
     */
    private List<Major> majors;

    public CollegeVO(University university, List<Major> majors){
        this.university=university;
        this.majors=majors;
    }
}
