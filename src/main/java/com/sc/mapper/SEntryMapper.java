package com.sc.mapper;

import com.sc.pojo.SEntry;

public interface SEntryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SEntry record);

    int insertSelective(SEntry record);

    SEntry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SEntry record);

    int updateByPrimaryKey(SEntry record);
}