package com.wss.service;

import com.wss.pojo.ProduceCart;

import java.util.List;

public interface IProduceCartService {
    int produceCartAdd(ProduceCart produceCart);

    List<ProduceCart> findByIds(int[] ids_int);
}
