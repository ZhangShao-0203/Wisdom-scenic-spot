package com.wss.controller;

import com.wss.pojo.ProduceCart;
import com.wss.pojo.UserTourist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/produceCart")
public class ProduceCartController {

    @RequestMapping("/add")
    public void produceCartAdd(ModelAndView mav, ProduceCart produceCart, HttpSession session){
        UserTourist tourist = (UserTourist)session.getAttribute("tourist");
        produceCart.setTouristId(tourist.getTouristId());

    }
}
