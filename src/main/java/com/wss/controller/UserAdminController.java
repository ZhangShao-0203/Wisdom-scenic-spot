package com.wss.controller;

import com.wss.log.MyLog;
import com.wss.pojo.UserAdmin;
import com.wss.pojo.UserTourist;
import com.wss.service.impl.UserAdminSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class UserAdminController {
    @Autowired
    private UserAdminSeviceImpl adminSevice;

    //管理员登录
    //管理员登录
    @MyLog(value = "登录")  //这里添加了AOP的自定义注解
    @RequestMapping("/login")
    @ResponseBody
    public String login(int adminId,HttpSession session,UserAdmin admin){
        UserAdmin userAdmin = adminSevice.selectByPrimaryKey(adminId);
        if(userAdmin!=null){
            session.setAttribute("admin",admin);
            return "1";
        }
        return "0";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout(UserAdmin userAdmin, HttpSession session){

        if(session!=null && session.getAttribute("admin")!=null){
            //退出---销毁session
            session.invalidate();
            return "1";
        }
        return "0";
    }


}
