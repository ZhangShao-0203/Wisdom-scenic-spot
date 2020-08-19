package com.wss.mapper;

import com.wss.pojo.PublicIntroduce;
import java.util.List;

public interface PublicIntroduceMapper {
    int deleteByPrimaryKey(Integer introduceId);

    int insert(PublicIntroduce record);

    PublicIntroduce selectByPrimaryKey(Integer introduceId);

    List<PublicIntroduce> selectAll();

    int updateByPrimaryKey(PublicIntroduce record);
}