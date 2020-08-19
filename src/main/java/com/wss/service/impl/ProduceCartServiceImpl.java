package com.wss.service.impl;

import com.wss.mapper.ProduceCartMapper;
import com.wss.pojo.ProduceCart;
import com.wss.service.IProduceCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduceCartServiceImpl implements IProduceCartService {
    @Autowired
    private ProduceCartMapper produceCartMapper;

    @Override
    public int produceCartAdd(ProduceCart produceCart) {
        return produceCartMapper.insert(produceCart);
    }
}
