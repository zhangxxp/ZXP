package com.sc.service.sem;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.SAdvisory;
import com.sc.pojo.SWay;
import com.sc.service.BaseService;
import com.sc.vo.sem.LayRequestVo;

import java.util.List;

public interface AdvisoryService extends BaseService<SAdvisory> {
    public PageInfo<SAdvisory> findByPage(LayRequestVo layRequestVo);
    List<SAdvisory> selectAll();
}
