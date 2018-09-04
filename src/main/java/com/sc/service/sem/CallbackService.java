package com.sc.service.sem;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.SCallback;
import com.sc.service.BaseService;
import com.sc.vo.sem.LayRequestVo;

import java.util.List;

public interface CallbackService extends BaseService<SCallback> {
    public PageInfo<SCallback> findByPage(LayRequestVo layRequestVo);
    public List<SCallback> selectAll();
}
