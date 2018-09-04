package com.sc.mapper;

import com.sc.pojo.SPower;

public interface SPowerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SPower record);

    int insertSelective(SPower record);

    SPower selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SPower record);

    int updateByPrimaryKey(SPower record);
}