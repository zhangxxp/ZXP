package com.sc.service.Impl.sem;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.mapper.SClientMapper;
import com.sc.mapper.SClientcallbackMapper;
import com.sc.pojo.SClient;
import com.sc.pojo.SClientcallback;
import com.sc.service.sem.ClientService;
import com.sc.vo.sem.LayRequestVo;
import com.sc.vo.sem.LayResponseVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Resource
    private SClientMapper mapper;

    @Resource
    private SClientcallbackMapper ccmapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SClient record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(SClient record) {
        return mapper.insertSelective(record);
    }

    @Override
    public SClient selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SClient record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SClient record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SClient> findByPage(LayRequestVo layRequestVo) {
        PageHelper.startPage(layRequestVo.getPage(),layRequestVo.getLimit());
        List<SClient> sClients =mapper.selectByPage(layRequestVo.getParams());
        return new PageInfo(sClients);
    }

    @Override
    public int saveclientcallback(SClient sClient, Integer[] caid) {
        insert(sClient);
        int i=0;
        if(caid!=null){
            for (int caids : caid){
                i+=ccmapper.insert(new SClientcallback(sClient.getId(),caids));
            }
        }
        return i;
    }

}
