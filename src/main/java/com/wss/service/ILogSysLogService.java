package com.wss.service;

import com.wss.pojo.LogOperate;
import com.wss.pojo.UserAdmin;

public interface ILogSysLogService {
    /*添加*/
    public int insert(LogOperate logOperate) throws Exception;

    /*查询日志*/
    public LogOperate querylogOperate(LogOperate logOperate) throws Exception;

    /*查询管理员*/
    public UserAdmin queryAdmin(int adminId) throws Exception;

    /*删除日志*/
    public int deleteLogOperate(LogOperate logOperate) throws Exception;
}
