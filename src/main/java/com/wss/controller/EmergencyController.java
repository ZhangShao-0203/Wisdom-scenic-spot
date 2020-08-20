package com.wss.controller;

import com.wss.pojo.Emergency;
import com.wss.service.EmergencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmergencyController {

    @Autowired
    private EmergencyService emergencyService;

    @RequestMapping("/queryAllEmergencies")
    public ModelAndView queryAllEmergencies(ModelAndView modelAndView){
        List<Emergency> emergencies = null;
        try {
            emergencies = emergencyService.queryAllEmergencies();
            modelAndView.addObject("emergencies",emergencies);
            modelAndView.setViewName("emergencies");
        } catch (Exception e) {
            modelAndView.setViewName("error");
            modelAndView.addObject("出错啦！",e.getMessage());
            e.printStackTrace();
        }finally {
            return modelAndView;
        }
    }

    @RequestMapping("/queryEmergenciesWithResult")
    public ModelAndView queryEmergenciesWithResult(ModelAndView modelAndView){
        List<Emergency> emergencies = null;
        try {
            emergencies = emergencyService.queryEmergenciesWithResult();
            modelAndView.addObject("emergencies",emergencies);
            modelAndView.setViewName("emergencies");
        } catch (Exception e) {
            modelAndView.setViewName("error");
            modelAndView.addObject("出错啦！",e.getMessage());
            e.printStackTrace();
        }finally {
            return modelAndView;
        }
    }

    @RequestMapping("/queryEmergencyById")
    public ModelAndView queryEmergencyById(@RequestParam("emergencyId")int emergencyId, ModelAndView modelAndView){
        Emergency emergency = null;
        try {
            emergency = emergencyService.queryEmergencyById(emergencyId);
            modelAndView.addObject("emergency",emergency);
            modelAndView.setViewName("emergencyDetail");
        } catch (Exception e) {
            modelAndView.addObject("出错啦",e.getMessage());
            modelAndView.setViewName("error");
            e.printStackTrace();
        }finally {
            return modelAndView;
        }
    }

    @RequestMapping("/addEmergency")
    public ModelAndView addEmergency(Emergency emergency,ModelAndView modelAndView){
        try {
            int i = emergencyService.addEmergency(emergency);
            modelAndView.addObject("i","添加成功啦");
            modelAndView.setViewName("emergencies");
        } catch (Exception e) {
            modelAndView.addObject("i","添加失败啦");
            modelAndView.setViewName("emergencies");
            e.printStackTrace();
        }finally {
            return modelAndView;
        }
    }

    @RequestMapping("/deleteEmergency")
    public ModelAndView deleteEmergency(int emergencyId,ModelAndView modelAndView){
        try {
            int i = emergencyService.deleteEmergency(emergencyId);
            modelAndView.addObject("result","成功啦！");
            modelAndView.setViewName("redirect:/emergencies");
        } catch (Exception e) {
            modelAndView.addObject("result","失败啦！");
            modelAndView.setViewName("redirect:/emergencies");
            e.printStackTrace();
        }finally {
            return modelAndView;
        }
    }

    @RequestMapping("/updateEmergency")
    public ModelAndView updateEmergency(Emergency emergency,ModelAndView modelAndView){
        try {
            int i = emergencyService.updateEmergency(emergency);
            modelAndView.addObject("result","更新成功啦！");
            modelAndView.setViewName("emergencies");
       } catch (Exception e) {
            modelAndView.addObject("result","更新失败啦！");
            modelAndView.setViewName("emergencies");
            e.printStackTrace();
        }finally {
            return  modelAndView;
        }
    }
}
