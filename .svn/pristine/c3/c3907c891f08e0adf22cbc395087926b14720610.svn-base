package com.sc.controller;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.SWay;
import com.sc.service.sem.WayService;
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
@RequestMapping("/sway")
public class SWayController {
    @Resource
    private WayService wayService;
    @ResponseBody
    @RequestMapping("/list")
    public LayResponseVo<SWay> findAll(LayRequestVo layRequestVo, String name, ModelMap modelMap){
        PageInfo<SWay> pageInfo = wayService.findByPage(layRequestVo);
        return new LayResponseVo<SWay>((int) pageInfo.getTotal(),pageInfo.getList());
    }

    @ResponseBody
    @RequestMapping("xlk")
    public Map<String,Object> findWay(ModelMap map){
        List<SWay> ways = wayService.selectAll();
        Map<String,Object> map_way = new HashMap<>();
        map_way.put("ways",ways);
        return  map_way;
    }
    @ResponseBody
    @RequestMapping("/delete")
    public LayResponseVo delete(Integer id){
        wayService.deleteByPrimaryKey(id);
        return new LayResponseVo<SWay>("删除成功");
    }
    @ResponseBody/*不加的话 无法及时刷新*/
    @RequestMapping("/update")
    public LayResponseVo<SWay> update(SWay sWay){
        wayService.updateByPrimaryKey(sWay);
        return new LayResponseVo<SWay>("修改成功");
    }
    @RequestMapping("/save")
    public String  save(SWay sWay){
        wayService.insert(sWay);
        return "redirect:/pages/sem/dept/sway.jsp";
    }
}
