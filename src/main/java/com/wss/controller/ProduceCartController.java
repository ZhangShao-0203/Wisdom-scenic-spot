package com.wss.controller;

import com.wss.pojo.Produce;
import com.wss.pojo.ProduceCart;
import com.wss.pojo.UserTourist;


import com.wss.service.IProduceService;
import com.wss.service.IProduceCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/produceCart")
public class ProduceCartController {

   @Autowired
    private IProduceService produceService;

    @Autowired
    private IProduceCartService produceCartService;

    @RequestMapping("/add")
    public int produceCartAdd(ProduceCart produceCart,HttpSession session){
        //UserTourist tourist = (UserTourist)session.getAttribute("tourist");
        Produce produce = produceService.findPrice(produceCart.getProduceId());


        //produceCart.setTouristId(tourist.getTouristId());
        produceCart.setTouristId(101);
        produceCart.setProduce(produce);

        int i = produceCartService.produceCartAdd(produceCart);
        return i;

    }


    @RequestMapping("/toPay")
    public String toPay(String ProduceCartIds){

        String[] ids_arr = ProduceCartIds.split(",");
        int[] ids_int = new int[ids_arr.length];

        for(int i = 0;i<ids_arr.length;i++){
            ids_int[i] = Integer.parseInt(ids_arr[i]);
        }

        List<ProduceCart> cartList= produceCartService.findByIds(ids_int);
        return "";

    }
}
