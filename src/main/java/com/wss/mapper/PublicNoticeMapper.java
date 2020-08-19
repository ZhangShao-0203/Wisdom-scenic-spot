package com.wss.mapper;

import com.wss.pojo.PublicNotice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface PublicNoticeMapper {
//    删除
    int deleteByPrimaryKey(Integer noticeId);
//    添加
    int insert(PublicNotice record);
//    根据id查询
    PublicNotice selectByPrimaryKey(Integer noticeId);
//    查询全部或根据条件查询,分页
    List<PublicNotice> selectAll(String seek);
//    根据id更改内容
    int updateByPrimaryKey(PublicNotice record);
}