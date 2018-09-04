package com.sc.mapper;

import com.sc.pojo.SUser;

public interface SUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);
}