package com.wss.controller;

import com.wss.pojo.Produce;
import com.wss.pojo.ProduceCart;
import com.wss.pojo.UserTourist;
import com.wss.service.IProduceCartService;
import com.wss.service.IProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/produceCart")
public class ProduceCartController {

    @Autowired
    private IProduceService produceService;

    @Autowired
    private IProduceCartService produceCartService;

    @RequestMapping("/add")
    public void produceCartAdd(ModelAndView mav, ProduceCart produceCart,HttpSession session){
        UserTourist tourist = (UserTourist)session.getAttribute("tourist");
        Produce produce = produceService.findPrice(produceCart.getProduceId());

        //produceCart.setTouristId(tourist.getTouristId());
        produceCart.setTouristId(101);
        produceCart.setProduce(produce);
        System.out.println("aaak");
        System.out.println("aaaaaaaaaaaad");

        int i = produceCartService.produceCartAdd(produceCart);

    }
}
