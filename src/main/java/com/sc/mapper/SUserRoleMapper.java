package com.sc.mapper;

import com.sc.pojo.SUserRole;

public interface SUserRoleMapper {
    int insert(SUserRole record);

    int insertSelective(SUserRole record);
}