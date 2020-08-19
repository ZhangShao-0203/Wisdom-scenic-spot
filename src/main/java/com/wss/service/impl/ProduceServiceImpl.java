package com.wss.service.impl;

import com.wss.mapper.ProduceMapper;
import com.wss.pojo.Produce;
import com.wss.service.IProduceService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduceServiceImpl implements IProduceService {
    @Autowired
    private ProduceMapper produceMapper;

    @Override
    public Produce findPrice(int produceId) {
        return produceMapper.selPriceById(produceId);
    }
}
