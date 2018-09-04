package com.sc.mapper;

import com.sc.pojo.SModule;

public interface SModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SModule record);

    int insertSelective(SModule record);

    SModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SModule record);

    int updateByPrimaryKey(SModule record);
}