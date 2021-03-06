package com.wss.service.impl;

import com.wss.mapper.LogOperateMapper;
import com.wss.pojo.LogOperate;
import com.wss.pojo.UserAdmin;
import com.wss.service.ILogSysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogSysLogService implements ILogSysLogService {
    @Autowired
    private LogOperateMapper logSysLogMapper;
    @Override
    public int insert(LogOperate logOperate) throws Exception {
        return logSysLogMapper.insertSyslog(logOperate);
    }

    @Override
    public LogOperate querylogOperate(LogOperate logOperate) throws Exception {
        return logSysLogMapper.querylogOperate(logOperate);
    }

    @Override
    public UserAdmin queryAdmin(int adminId) throws Exception {
        return logSysLogMapper.queryAdmin(adminId);
    }

    @Override
    public int deleteLogOperate(LogOperate logOperate) throws Exception {
        return logSysLogMapper.deleteLogOperate(logOperate);
    }
}
