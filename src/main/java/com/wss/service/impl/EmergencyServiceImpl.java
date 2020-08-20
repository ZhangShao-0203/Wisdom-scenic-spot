package com.wss.service.impl;

import com.wss.mapper.EmergencyMapper;
import com.wss.pojo.Emergency;
import com.wss.service.EmergencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergencyServiceImpl implements EmergencyService {

    @Autowired
    private EmergencyMapper emergencyMapper;

    @Override
    public List<Emergency> queryAllEmergencies() throws Exception {
        return emergencyMapper.queryAllEmergencies();
    }

    @Override
    public List<Emergency> queryEmergenciesWithResult() throws Exception {
        return emergencyMapper.queryEmergenciesWithResult();
    }


    @Override
    public Emergency queryEmergencyById(int emergencyId) throws Exception {
        return emergencyMapper.queryEmergencyById(emergencyId);
    }

    @Override
    public int addEmergency(Emergency emergency) throws Exception {
        return emergencyMapper.addEmergency(emergency);
    }

    @Override
    public int deleteEmergency(int emergencyId) throws Exception {
        return emergencyMapper.deleteEmergency(emergencyId);
    }

    @Override
    public int updateEmergency(Emergency emergency) throws Exception {
        return emergencyMapper.updateEmeregency(emergency);
    }
}
