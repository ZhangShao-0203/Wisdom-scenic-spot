package com.wss.service;

import com.wss.pojo.LogOperate;

public interface ILogSysLogService {
    /*添加*/
    public int insert(LogOperate logOperate) throws Exception;

    /*查询日志*/
    public LogOperate querylogOperate(LogOperate logOperate) throws Exception;
}
