package com.wss.mapper;

import com.wss.pojo.PublicMap;
import java.util.List;

public interface PublicMapMapper {
    int deleteByPrimaryKey(Integer mapId);

    int insert(PublicMap record);

    PublicMap selectByPrimaryKey(Integer mapId);

    List<PublicMap> selectAll();

    int updateByPrimaryKey(PublicMap record);
}