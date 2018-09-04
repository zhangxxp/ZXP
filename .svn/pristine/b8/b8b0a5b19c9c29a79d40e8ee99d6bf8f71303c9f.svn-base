package com.sc.mapper;

import com.sc.pojo.SCallback;
import com.sc.pojo.SClient;

import java.util.List;
import java.util.Map;

public interface SClientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SClient record);

    int insertSelective(SClient record);

    SClient selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SClient record);

    int updateByPrimaryKey(SClient record);

    List<SClient> selectByPage(Map<String, Object> params);

    List<SCallback> selectCallbackByClientId(Integer clid);

}