package com.sc.controller;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.SCallback;
import com.sc.pojo.SClientcallback;
import com.sc.service.sem.CallbackService;
import com.sc.service.sem.ClCaService;
import com.sc.vo.sem.LayRequestVo;
import com.sc.vo.sem.LayResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/callback")
public class SCallbackController {
    @Resource
    private CallbackService callbackService;

    @Resource
    private ClCaService clCaService;
    @ResponseBody
    @RequestMapping("/list")
    public LayResponseVo  findAll(LayRequestVo layRequestVo, String name, ModelMap modelMap){
        PageInfo<SCallback> sCallbacks = callbackService.findByPage(layRequestVo);
        return new LayResponseVo<SCallback>((int) sCallbacks.getTotal(),sCallbacks.getList());
    }
    @ResponseBody
    @RequestMapping("/delete")
    public LayResponseVo delete(Integer id){
        callbackService.deleteByPrimaryKey(id);
        return new LayResponseVo<SCallback>("删除成功");
    }
    @RequestMapping("/update")
    public String update(SCallback sCallback){
        callbackService.updateByPrimaryKey(sCallback);
        return "redirect:/pages/sem/dept/client.jsp";
    }

    @RequestMapping("/save")
    public String insert(SCallback sCallback, Integer[] clid,SClientcallback sClientcallback , ModelMap modelMap){
        callbackService.insertSelective(sCallback);
        sClientcallback.setCaid(sCallback.getId());
        for (int i = 0; i <clid.length ; i++) {
            sClientcallback.setClid(clid[i]);
            clCaService.insertSelective(sClientcallback);
        }
        modelMap.put("id",sCallback);
        return "sem/dept/callback2";
    }
    @ResponseBody
    @RequestMapping("/findAll")
    public List<SCallback> findAll(){
        List<SCallback> sCallbacks = callbackService.selectAll();
        return sCallbacks;
    }
}
