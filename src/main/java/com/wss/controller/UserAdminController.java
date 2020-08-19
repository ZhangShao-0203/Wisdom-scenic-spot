package com.wss.controller;

import com.wss.service.impl.UserAdminSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class UserAdminController {
    @Autowired
    private UserAdminSeviceImpl adminSevice;

    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView login(ModelAndView mav){

        mav.setViewName("/");
        return mav;
    }
}
