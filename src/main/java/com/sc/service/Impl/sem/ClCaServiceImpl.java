package com.sc.service.Impl.sem;

import com.github.pagehelper.PageInfo;
import com.sc.mapper.SClientcallbackMapper;
import com.sc.pojo.SCallback;
import com.sc.pojo.SClientcallback;
import com.sc.service.sem.ClCaService;
import com.sc.vo.sem.LayRequestVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class ClCaServiceImpl implements ClCaService {
    @Resource
    private SClientcallbackMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return Integer.parseInt(null);
    }

    @Override
    public int insert(SClientcallback record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(SClientcallback record) {
        return mapper.insertSelective(record);
    }

    @Override
    public SClientcallback selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SClientcallback record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SClientcallback record) {
        return 0;
    }


    @Override
    public PageInfo<SClientcallback> findByPage(LayRequestVo layRequestVo) {
        return null;
    }

    @Override
    public void selectAll() {
    }
}
