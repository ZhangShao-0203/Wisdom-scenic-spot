package com.wss.controller;

import com.wss.pojo.UserAdmin;
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

    //管理员登录
    @RequestMapping("/login")
    @ResponseBody
    public String login(int adminId){
        UserAdmin userAdmin = adminSevice.selectByPrimaryKey(adminId);
        if(userAdmin!=null){
            return "1";
        }
        return "0";
    }
}
