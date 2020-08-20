package com.wss.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wss.mapper.PublicMapMapper;
import com.wss.pojo.PublicMap;
import com.wss.pojo.PublicNotice;
import com.wss.service.IPublicMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicMapService implements IPublicMapService{
    @Autowired
    PublicMapMapper publicMapMapper;
    @Override
    public int deleteByPrimaryKey(Integer mapId) {
        return publicMapMapper.deleteByPrimaryKey(mapId);
    }

    @Override
    public int insert(PublicMap record) {
        return publicMapMapper.insert(record);
    }

    @Override
    public PublicMap selectByPrimaryKey(Integer mapId) {
        return publicMapMapper.selectByPrimaryKey(mapId);
    }

    @Override
    public List<PublicMap> selectAll(int start, int size, String seek) {
        PageHelper.startPage(start,size,"play_state asc,play_price asc");
        List<PublicMap> publicMaps = publicMapMapper.selectAll(seek);
        PageInfo pageInfo=new PageInfo(publicMaps);
        for (PublicMap a:publicMaps){
            a.setPage(pageInfo.getPages());
        }
        return publicMaps;
    }

    @Override
    public int updateByPrimaryKey(PublicMap record) {
        return publicMapMapper.updateByPrimaryKey(record);
    }
}
