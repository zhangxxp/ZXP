package com.sc.service.Impl.sem;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.mapper.SWayMapper;
import com.sc.pojo.SWay;
import com.sc.service.sem.WayService;
import com.sc.vo.sem.LayRequestVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class WayServiceImpl implements WayService {
    @Resource
    private SWayMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SWay record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(SWay record) {
        return mapper.insertSelective(record);
    }

    @Override
    public SWay selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SWay record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SWay record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SWay> findByPage(LayRequestVo layRequestVo) {
        PageHelper.startPage(layRequestVo.getPage(),layRequestVo.getLimit());
        List<SWay> sway =mapper.selectByPage(layRequestVo.getParams());
        return new PageInfo(sway);
    }

    @Override
    public List<SWay> selectAll() {
        return mapper.selectAll();
    }
}
