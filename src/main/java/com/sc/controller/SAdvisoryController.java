package com.sc.controller;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.SAdvisory;
import com.sc.pojo.SWay;
import com.sc.service.sem.AdvisoryService;
import com.sc.vo.sem.LayRequestVo;
import com.sc.vo.sem.LayResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sadvisory")
public class SAdvisoryController {
    @Resource
    private AdvisoryService wayService;
    @ResponseBody
    @RequestMapping("/list")
    public LayResponseVo<SAdvisory> findAll(LayRequestVo layRequestVo, String name, ModelMap modelMap){
        PageInfo<SAdvisory> pageInfo = wayService.findByPage(layRequestVo);
        return new LayResponseVo<SAdvisory>((int) pageInfo.getTotal(),pageInfo.getList());
    }
    @ResponseBody
    @RequestMapping("xlk")
    public Map<String,Object> findWay(ModelMap map){
        List<SAdvisory> advisory = wayService.selectAll();
        Map<String,Object> map_way = new HashMap<>();
        map_way.put("advisorys",advisory);
        return  map_way;
    }
    @ResponseBody
    @RequestMapping("/delete")
    public LayResponseVo delete(Integer id){
        wayService.deleteByPrimaryKey(id);
        return new LayResponseVo<SAdvisory>("删除成功");
    }
    @ResponseBody/*不加的话 无法及时刷新*/
    @RequestMapping("/update")
    public LayResponseVo<SAdvisory> update(SAdvisory sAdvisory){
        wayService.updateByPrimaryKey(sAdvisory);
        return new LayResponseVo<SAdvisory>("修改成功");
    }
    @RequestMapping("/save")
    public String  save(SAdvisory sAdvisory){
        System.out.println(sAdvisory);
        wayService.insert(sAdvisory);
        return "redirect:/pages/sem/dept/advisory.jsp";
    }
}
