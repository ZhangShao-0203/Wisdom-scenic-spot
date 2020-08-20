package com.wss.service;

import com.wss.pojo.PublicPlay;

import java.util.List;

public interface IPublicPlayService {
    int deleteByPrimaryKey(Integer playId);

    int insert(PublicPlay record);

    PublicPlay selectByPrimaryKey(Integer playId);

    List<PublicPlay> selectAll(int start,int size,String seek);

    int updateByPrimaryKey(PublicPlay record);
}
