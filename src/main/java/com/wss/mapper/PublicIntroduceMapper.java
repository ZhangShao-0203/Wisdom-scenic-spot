package com.wss.mapper;

import com.wss.pojo.PublicIntroduce;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

import java.util.List;
@Mapper
@Controller
public interface PublicIntroduceMapper {
//  删除
    int deleteByPrimaryKey(Integer introduceId);
//  插入
    int insert(PublicIntroduce record);
//    根据id查询
    PublicIntroduce selectByPrimaryKey(Integer introduceId);
//    查询所有,分页,条件查询,模糊搜索
    List<PublicIntroduce> selectAll(String seek);
//    根据id更改
    int updateByPrimaryKey(PublicIntroduce record);
}