package com.sc.service.Impl.sem;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.mapper.SCallbackMapper;
import com.sc.mapper.SClientMapper;
import com.sc.pojo.SCallback;
import com.sc.pojo.SClient;
import com.sc.service.sem.CallbackService;
import com.sc.service.sem.ClientService;
import com.sc.vo.sem.LayRequestVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CallbackServiceImpl implements CallbackService {
    @Resource
    private SCallbackMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SCallback record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(SCallback record) {
        return mapper.insertSelective(record);
    }

    @Override
    public SCallback selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SCallback record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SCallback record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SCallback> findByPage(LayRequestVo layRequestVo) {
        PageHelper.startPage(layRequestVo.getPage(),layRequestVo.getLimit());
        List<SCallback> sCallbacks =mapper.selectCallbackByClientId(Integer.valueOf(layRequestVo.getParams().get("id").toString()) );
        return new PageInfo(sCallbacks);
    }

    @Override
    public List<SCallback> selectAll() {
        return mapper.selectAll();
    }
}
