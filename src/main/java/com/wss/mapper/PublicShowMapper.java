package com.wss.mapper;

import com.wss.pojo.PublicShow;
import java.util.List;

public interface PublicShowMapper {
    int deleteByPrimaryKey(Integer showId);

    int insert(PublicShow record);

    PublicShow selectByPrimaryKey(Integer showId);

    List<PublicShow> selectAll();

    int updateByPrimaryKey(PublicShow record);
}