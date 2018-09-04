package com.sc.service.sem;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.SClientcallback;
import com.sc.service.BaseService;
import com.sc.vo.sem.LayRequestVo;

public interface ClCaService extends BaseService<SClientcallback> {
    public PageInfo<SClientcallback> findByPage(LayRequestVo layRequestVo);
    public void selectAll();
}
