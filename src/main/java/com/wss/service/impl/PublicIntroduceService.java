package com.wss.service.impl;

import com.wss.mapper.PublicIntroduceMapper;
import com.wss.pojo.PublicIntroduce;
import com.wss.service.IPublicIntroduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicIntroduceService implements IPublicIntroduceService {
    @Autowired
    PublicIntroduceMapper publicIntroduceMapper;
    @Override
    public int deleteByPrimaryKey(Integer introduceId) {
        return publicIntroduceMapper.deleteByPrimaryKey(introduceId);
    }

    @Override
    public int insert(PublicIntroduce record) {
        return publicIntroduceMapper.insert(record);
    }

    @Override
    public PublicIntroduce selectByPrimaryKey(Integer introduceId) {
        return publicIntroduceMapper.selectByPrimaryKey(introduceId);
    }

    @Override
    public List<PublicIntroduce> selectAll() {
        return publicIntroduceMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(PublicIntroduce record) {
        return publicIntroduceMapper.updateByPrimaryKey(record);
    }
}
