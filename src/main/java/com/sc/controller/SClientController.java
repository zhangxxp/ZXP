package com.sc.controller;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.SCallback;
import com.sc.pojo.SClient;
import com.sc.service.sem.CallbackService;
import com.sc.service.sem.ClientService;
import com.sc.vo.sem.LayRequestVo;
import com.sc.vo.sem.LayResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/client")
public class SClientController {
    @Resource
    private ClientService clientService;


    @ResponseBody
    @RequestMapping("/list")
    public LayResponseVo<SClient> findAll(LayRequestVo layRequestVo, String name, ModelMap modelMap){
        PageInfo<SClient> pageInfo = clientService.findByPage(layRequestVo);
        return new LayResponseVo<SClient>((int) pageInfo.getTotal(),pageInfo.getList());
    }
    @RequestMapping("/liss")
    public String show(Integer id, ModelMap modelMap){
        SClient crmStudent = clientService.selectByPrimaryKey(id);
        modelMap.put("client",crmStudent);
        return "sem/dept/clientupdate";
    }

    @ResponseBody
    @RequestMapping("/delete")
    public LayResponseVo delete(Integer id){
        clientService.deleteByPrimaryKey(id);
        return new LayResponseVo<SClient>("删除成功");
    }
    @RequestMapping("/update")
    public String update(SClient sClient){
        clientService.updateByPrimaryKey(sClient);
        return "redirect:/pages/sem/dept/client.jsp";
    }
    @RequestMapping("/save")
    public String  save(SClient sClient){
        clientService.insert(sClient);
        return "redirect:/pages/sem/dept/client.jsp";
    }
}
