package com.wss.controller;

import com.wss.pojo.InfoEzstop;
import com.wss.service.IInfoEzstopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/InfoEzstop")
public class InfoEzstopController {

    @Autowired
    private IInfoEzstopService infoEzstopService;

    @RequestMapping("/Add")
    public ModelAndView AddInfoEzstop(ModelAndView mav,InfoEzstop infoEzstop){
        System.out.println("进入Controller!!");
        int i = infoEzstopService.AddInfoEzstop(infoEzstop);
        System.out.println("结束!!"+i);
        mav.setViewName("停车记录");
        return mav;
    }

    @RequestMapping("/Update")
    public ModelAndView UpdateInfoEzstop(ModelAndView mav,InfoEzstop infoEzstop){
        System.out.println(infoEzstop.getEzstopUid()+"!!!!");
        int i = infoEzstopService.UpdateInfoEzstop(infoEzstop);
        System.out.println("结束!!"+i);
        mav.setViewName("停车记录");
        return mav;
    }

}
