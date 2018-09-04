package com.sc.mapper;

import com.sc.pojo.STalkabout;

public interface STalkaboutMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(STalkabout record);

    int insertSelective(STalkabout record);

    STalkabout selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(STalkabout record);

    int updateByPrimaryKey(STalkabout record);
}