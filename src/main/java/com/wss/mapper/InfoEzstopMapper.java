package com.wss.mapper;

import com.wss.pojo.InfoEzstop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface InfoEzstopMapper {
    int deleteByPrimaryKey(Integer ezstopId);

    int insert(InfoEzstop record);

    InfoEzstop selectByPrimaryKey(Integer ezstopId);

    List<InfoEzstop> selectAll();

    int updateByPrimaryKey(InfoEzstop record);
}