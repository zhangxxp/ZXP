package com.sc.mapper;

import com.sc.pojo.SReview;

public interface SReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SReview record);

    int insertSelective(SReview record);

    SReview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SReview record);

    int updateByPrimaryKey(SReview record);
}