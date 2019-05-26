package com.right.vivo.vo;

import lombok.Data;

/**
 * @author DW
 * @date 2019/5/26
 */
@Data
public class SearchForm {
    private String region;
    private int lowScore;
    private int highScore;
    private String major;
    private String university;

}
