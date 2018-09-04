package com.sc.mapper;

import com.sc.pojo.SCallback;

import java.util.List;
import java.util.Map;

public interface SCallbackMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SCallback record);

    int insertSelective(SCallback record);

    SCallback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SCallback record);

    int updateByPrimaryKey(SCallback record);
/*
    List<SCallback> selectByPage(Map<String, Object> params);*/

    List<SCallback> selectAll();

    List<SCallback> selectCallbackByClientId(Integer clid);
}