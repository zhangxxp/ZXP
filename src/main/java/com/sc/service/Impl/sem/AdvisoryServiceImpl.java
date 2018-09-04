package com.sc.service.Impl.sem;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.mapper.SAdvisoryMapper;
import com.sc.mapper.SWayMapper;
import com.sc.pojo.SAdvisory;
import com.sc.pojo.SWay;
import com.sc.service.sem.AdvisoryService;
import com.sc.service.sem.WayService;
import com.sc.vo.sem.LayRequestVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdvisoryServiceImpl implements AdvisoryService {
    @Resource
    private SAdvisoryMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SAdvisory record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(SAdvisory record) {
        return mapper.insertSelective(record);
    }

    @Override
    public SAdvisory selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SAdvisory record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SAdvisory record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SAdvisory> findByPage(LayRequestVo layRequestVo) {
        PageHelper.startPage(layRequestVo.getPage(),layRequestVo.getLimit());
        List<SAdvisory> sadvisory =mapper.selectByPage(layRequestVo.getParams());
        return new PageInfo(sadvisory);
    }

    @Override
    public List<SAdvisory> selectAll() {
        return mapper.selectAll();
    }
}
