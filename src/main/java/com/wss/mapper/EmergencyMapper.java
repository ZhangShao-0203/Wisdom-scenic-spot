package com.wss.mapper;

import com.wss.pojo.Emergency;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmergencyMapper {

    //计算所有紧急情况总条数
    int getCountOfAll() throws Exception;

    //倒序查看所有紧急情况(size:每页展示多少条)
    List<Emergency> queryAllEmergencies() throws Exception;

    //倒序查询有结果记录的紧急情况
    List<Emergency> queryEmergenciesWithResult() throws Exception;

    //查询单个紧急情况
    Emergency queryEmergencyById(int emergencyId) throws Exception;

    //添加紧急情况
    int addEmergency(Emergency emergency) throws Exception;

    //删除紧急情况
    int deleteEmergency(int EmergencyId) throws Exception;

    //更新紧急情况
    int updateEmeregency(Emergency emergency) throws Exception;
}
