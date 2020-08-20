package com.wss.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wss.mapper.PublicShowMapper;
import com.wss.pojo.PublicPlay;
import com.wss.pojo.PublicShow;
import com.wss.service.IPublicShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicShowService implements IPublicShowService {
    @Autowired
    PublicShowMapper publicShowMapper;
    @Override
    public int deleteByPrimaryKey(Integer showId) {
        return publicShowMapper.deleteByPrimaryKey(showId);
    }

    @Override
    public int insert(PublicShow record) {
        return publicShowMapper.insert(record);
    }

    @Override
    public PublicShow selectByPrimaryKey(Integer showId) {
        return publicShowMapper.selectByPrimaryKey(showId);
    }

    @Override
    public List<PublicShow> selectAll(int start,int size,String seek) {
        PageHelper.startPage(start,size,"show_state asc,show_time desc");
        List<PublicShow> publicShows = publicShowMapper.selectAll(seek);
        PageInfo pageInfo=new PageInfo(publicShows);
        for (PublicShow a:publicShows){
            a.setPage(pageInfo.getPages());
        }
        return publicShows;
    }

    @Override
    public int updateByPrimaryKey(PublicShow record) {
        return publicShowMapper.updateByPrimaryKey(record);
    }
}
