package com.wss.service;

import com.wss.pojo.PublicIntroduce;

import java.util.List;

public interface IPublicIntroduceService {
    //  删除
    int deleteByPrimaryKey(Integer introduceId);
    //  插入
    int insert(PublicIntroduce record);
    //    根据id查询
    PublicIntroduce selectByPrimaryKey(Integer introduceId);
    //    查询所有,分页,条件查询,模糊搜索
    List<PublicIntroduce> selectAll();
    //    根据id更改
    int updateByPrimaryKey(PublicIntroduce record);
}
