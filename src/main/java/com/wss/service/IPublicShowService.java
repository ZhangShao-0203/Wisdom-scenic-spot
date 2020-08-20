package com.wss.service;

import com.wss.pojo.PublicShow;

import java.util.List;

public interface IPublicShowService {
    int deleteByPrimaryKey(Integer showId);

    int insert(PublicShow record);

    PublicShow selectByPrimaryKey(Integer showId);

    List<PublicShow> selectAll(int start,int size,String seek);

    int updateByPrimaryKey(PublicShow record);
}
