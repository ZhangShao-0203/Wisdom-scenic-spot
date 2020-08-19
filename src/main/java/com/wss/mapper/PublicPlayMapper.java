package com.wss.mapper;

import com.wss.pojo.PublicPlay;
import java.util.List;

public interface PublicPlayMapper {
    int deleteByPrimaryKey(Integer playId);

    int insert(PublicPlay record);

    PublicPlay selectByPrimaryKey(Integer playId);

    List<PublicPlay> selectAll();

    int updateByPrimaryKey(PublicPlay record);
}