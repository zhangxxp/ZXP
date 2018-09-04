package com.sc.mapper;

import com.sc.pojo.SWay;

import java.util.List;
import java.util.Map;

public interface SWayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SWay record);

    int insertSelective(SWay record);

    SWay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SWay record);

    int updateByPrimaryKey(SWay record);

    List<SWay> selectByPage(Map<String ,Object> params);

    List<SWay> selectAll();
}