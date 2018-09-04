package com.sc.mapper;

import com.sc.pojo.SNotice;

public interface SNoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SNotice record);

    int insertSelective(SNotice record);

    SNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SNotice record);

    int updateByPrimaryKey(SNotice record);
}