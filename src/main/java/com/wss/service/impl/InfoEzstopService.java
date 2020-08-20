package com.wss.service.impl;

import com.wss.mapper.InfoEzstopMapper;
import com.wss.pojo.InfoEzstop;
import com.wss.service.IInfoEzstopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoEzstopService implements IInfoEzstopService {

    @Autowired
    private InfoEzstopMapper infoEzstopMapper;

    @Override
    public int AddInfoEzstop(InfoEzstop infoEzstop) {
        return infoEzstopMapper.insert(infoEzstop);
    }

    @Override
    public int UpdateInfoEzstop(InfoEzstop infoEzstop) {
        return infoEzstopMapper.updateByPrimaryKey(infoEzstop);
    }
}
