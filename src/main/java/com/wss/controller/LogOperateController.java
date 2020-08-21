package com.wss.controller;

import com.wss.pojo.LogOperate;
import com.wss.service.ILogSysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogOperateController {
    @Autowired
    private ILogSysLogService logSysLogService;
    @RequestMapping("/queryLogOperate")
    public ModelAndView queryLogOperate(ModelAndView mav, LogOperate logOperate){

        try {
            LogOperate logOperate1 = logSysLogService.querylogOperate(logOperate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    @RequestMapping("/delLogOperate")
    public ModelAndView delLogOperate(ModelAndView mav,LogOperate logOperate){
        try {
            int i = logSysLogService.deleteLogOperate(logOperate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mav;
    }
}
