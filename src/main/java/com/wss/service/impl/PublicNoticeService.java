package com.wss.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wss.mapper.PublicNoticeMapper;
import com.wss.pojo.PublicNotice;
import com.wss.service.IPublicNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PublicNoticeService implements IPublicNoticeService {
    @Autowired
    PublicNoticeMapper publicNoticeMapper;
    @Override
    public int deleteByPrimaryKey(Integer noticeId) {
        return publicNoticeMapper.deleteByPrimaryKey(noticeId);
    }

    @Override
    public int insert(PublicNotice record) {
        return publicNoticeMapper.insert(record);
    }

    @Override
    public PublicNotice selectByPrimaryKey(Integer noticeId) {
        return publicNoticeMapper.selectByPrimaryKey(noticeId);
    }

    @Override
    public List<PublicNotice> selectAll(int start,int size,String seek) {
        PageHelper.startPage(start,size,"notice_rank asc,notice_time desc");
        List<PublicNotice> publicNotices = publicNoticeMapper.selectAll(seek);
        PageInfo pageInfo=new PageInfo(publicNotices);
        for (PublicNotice a:publicNotices){
            a.setPage(pageInfo.getPages());
        }
        return publicNotices;
    }

    @Override
    public int updateByPrimaryKey(PublicNotice record) {
        return publicNoticeMapper.updateByPrimaryKey(record);
    }
}
