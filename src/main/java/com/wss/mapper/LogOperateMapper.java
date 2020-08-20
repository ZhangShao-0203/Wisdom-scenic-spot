package com.wss.mapper;

import com.wss.pojo.LogOperate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogOperateMapper {

    /*添加日志*/
    public int insertSyslog(LogOperate logOperate) throws Exception;

    /*查询日志*/
    public LogOperate querylogOperate(LogOperate logOperate) throws Exception;



}
