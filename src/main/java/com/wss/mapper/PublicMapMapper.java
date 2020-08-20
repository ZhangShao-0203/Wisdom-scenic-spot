package com.wss.mapper;

import com.wss.pojo.PublicMap;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

import java.util.List;
@Mapper
@Controller
public interface PublicMapMapper {
    int deleteByPrimaryKey(Integer mapId);

    int insert(PublicMap record);

    PublicMap selectByPrimaryKey(Integer mapId);

    List<PublicMap> selectAll(String seek);

    int updateByPrimaryKey(PublicMap record);
}