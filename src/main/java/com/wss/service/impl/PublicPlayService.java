package com.wss.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wss.mapper.PublicPlayMapper;
import com.wss.pojo.PublicMap;
import com.wss.pojo.PublicPlay;
import com.wss.service.IPublicIntroduceService;
import com.wss.service.IPublicPlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicPlayService implements IPublicPlayService {
   @Autowired
    PublicPlayMapper publicPlayMapper;
    @Override
    public int deleteByPrimaryKey(Integer playId) {
        return publicPlayMapper.deleteByPrimaryKey(playId);
    }

    @Override
    public int insert(PublicPlay record) {
        return publicPlayMapper.insert(record);
    }

    @Override
    public PublicPlay selectByPrimaryKey(Integer playId) {
        return publicPlayMapper.selectByPrimaryKey(playId);
    }

    @Override
    public List<PublicPlay> selectAll(int start,int size,String seek) {
        PageHelper.startPage(start,size,"play_state asc,play_price asc");
        List<PublicPlay> publicPlays = publicPlayMapper.selectAll(seek);
        PageInfo pageInfo=new PageInfo(publicPlays);
        for (PublicPlay a:publicPlays){
            a.setPage(pageInfo.getPages());
        }
        return publicPlays;
    }

    @Override
    public int updateByPrimaryKey(PublicPlay record) {
        return publicPlayMapper.updateByPrimaryKey(record);
    }
}
