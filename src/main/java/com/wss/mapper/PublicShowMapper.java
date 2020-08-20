package com.wss.mapper;

import com.wss.pojo.PublicShow;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

import java.util.List;
@Mapper
@Controller
public interface PublicShowMapper {
    int deleteByPrimaryKey(Integer showId);

    int insert(PublicShow record);

    PublicShow selectByPrimaryKey(Integer showId);

    List<PublicShow> selectAll(String seek);

    int updateByPrimaryKey(PublicShow record);
}