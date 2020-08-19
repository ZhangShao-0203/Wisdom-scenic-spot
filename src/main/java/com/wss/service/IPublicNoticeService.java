package com.wss.service;

import com.wss.pojo.PublicNotice;

import java.util.List;

public interface IPublicNoticeService {
    //    删除
    int deleteByPrimaryKey(Integer noticeId);
    //    添加
    int insert(PublicNotice record);
    //    根据id查询
    PublicNotice selectByPrimaryKey(Integer noticeId);
    //    查询所有,条件查询,分页
    List<PublicNotice> selectAll(int start,int size,String seek);
    //    根据id修改
    int updateByPrimaryKey(PublicNotice record);

}
