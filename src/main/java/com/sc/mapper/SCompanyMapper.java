package com.sc.mapper;

import com.sc.pojo.SCompany;

public interface SCompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SCompany record);

    int insertSelective(SCompany record);

    SCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SCompany record);

    int updateByPrimaryKey(SCompany record);
}