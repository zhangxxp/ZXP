package com.sc.service.sem;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.SClient;
import com.sc.service.BaseService;
import com.sc.vo.sem.LayRequestVo;
import com.sc.vo.sem.LayResponseVo;

public interface ClientService extends BaseService<SClient> {
    public PageInfo<SClient> findByPage(LayRequestVo layRequestVo);
    public int saveclientcallback(SClient sClient,Integer [] caid);
}
