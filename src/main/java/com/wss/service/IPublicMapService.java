package com.wss.service;

import com.wss.pojo.PublicMap;

import java.util.List;

public interface IPublicMapService {
    int deleteByPrimaryKey(Integer mapId);

    int insert(PublicMap record);

    PublicMap selectByPrimaryKey(Integer mapId);

    List<PublicMap> selectAll(int start,int size,String seek);

    int updateByPrimaryKey(PublicMap record);
}
