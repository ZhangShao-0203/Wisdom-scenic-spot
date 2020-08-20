package com.wss.service;


import com.wss.pojo.Emergency;

import java.util.List;

public interface EmergencyService {

    //倒序查看所有紧急情况(size:每页展示多少条)
    List<Emergency> queryAllEmergencies() throws Exception;

    //倒叙查看所有有结果的紧急情况
    List<Emergency> queryEmergenciesWithResult() throws Exception;

    //查询单个紧急情况
    Emergency queryEmergencyById(int emergencyId) throws Exception;

    //添加紧急情况
    int addEmergency(Emergency emergency) throws Exception;

    //删除紧急情况
    int deleteEmergency(int emergencyId) throws Exception;

    //更新紧急情况
    int updateEmergency(Emergency emergency) throws Exception;
}
