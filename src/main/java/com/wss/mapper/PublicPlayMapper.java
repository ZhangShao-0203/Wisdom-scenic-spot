package com.wss.mapper;

import com.wss.pojo.PublicPlay;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

import java.util.List;
@Mapper
@Controller
public interface PublicPlayMapper {
    int deleteByPrimaryKey(Integer playId);

    int insert(PublicPlay record);

    PublicPlay selectByPrimaryKey(Integer playId);

    List<PublicPlay> selectAll(String seek);

    int updateByPrimaryKey(PublicPlay record);
}