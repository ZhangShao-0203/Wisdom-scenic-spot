package com.wss.controller;

import com.wss.pojo.UserTourist;
import com.wss.service.impl.UserTouristServiceImpl;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/tourist")
public class UserTouristController {

    @Autowired
    private UserTouristServiceImpl touristService;

    @RequestMapping("/reg")
    @ResponseBody
    public UserTourist reg(ModelAndView mav, UserTourist tourist){

        //MD5加密
        String md5Hex = DigestUtils.md5Hex(tourist.getTouristPsw());
        tourist.setTouristPsw(md5Hex);

        //注册--调用插入方法
        int i = touristService.insert(tourist);
        return tourist;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(UserTourist tourist,HttpSession session,int touristId){

        //从数据库查询是否有此用户
        UserTourist tourist1 = touristService.selectByPrimaryKey(touristId);
        //得到数据库查到的密码-psw
        String psw = tourist1.getTouristPsw();

        if(tourist1!=null){//查询用户不为空
            //对页面传来的密码进行加密---md5psw
            String md5Hex = DigestUtils.md5Hex(tourist.getTouristPsw());
            String md5psw = md5Hex.toString();
            tourist.setTouristPsw(md5psw);
            //判断用户加密后的密码md5psw和数据库查到的密码psw是否相同
            if(psw.equals(md5psw)){
                session.setAttribute("tourist",tourist);//存session
                return "1";
            }
        }
        return "0";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout(UserTourist tourist,HttpSession session){

        if(session!=null && session.getAttribute("tourist")!=null){
            //退出---销毁session
            session.invalidate();
            return "1";
        }
        return "0";
    }


}
