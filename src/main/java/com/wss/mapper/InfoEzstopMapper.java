package com.wss.mapper;

import com.wss.pojo.InfoEzstop;
import java.util.List;

public interface InfoEzstopMapper {
    int deleteByPrimaryKey(Integer ezstopId);

    int insert(InfoEzstop record);

    InfoEzstop selectByPrimaryKey(Integer ezstopId);

    List<InfoEzstop> selectAll();

    int updateByPrimaryKey(InfoEzstop record);
}