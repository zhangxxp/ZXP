package com.sc.mapper;

import com.sc.pojo.SStudents;

public interface SStudentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SStudents record);

    int insertSelective(SStudents record);

    SStudents selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SStudents record);

    int updateByPrimaryKey(SStudents record);
}