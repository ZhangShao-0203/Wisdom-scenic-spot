package com.wss.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wss.mapper.PublicIntroduceMapper;
import com.wss.pojo.PublicIntroduce;
import com.wss.pojo.PublicNotice;
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
    public List<PublicIntroduce> selectAll(int start,int size,String seek) {
        PageHelper.startPage(start,size,"introduce_id asc");
        List<PublicIntroduce> publicIntroduces = publicIntroduceMapper.selectAll(seek);
        PageInfo pageInfo=new PageInfo(publicIntroduces);
        for (PublicIntroduce a:publicIntroduces){
            a.setPage(pageInfo.getPages());
        }
        return publicIntroduces;
    }

    @Override
    public int updateByPrimaryKey(PublicIntroduce record) {
        return publicIntroduceMapper.updateByPrimaryKey(record);
    }
}
