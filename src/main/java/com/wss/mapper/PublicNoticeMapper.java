package com.wss.mapper;

import com.wss.pojo.PublicNotice;
import java.util.List;

public interface PublicNoticeMapper {
    int deleteByPrimaryKey(Integer noticeId);

    int insert(PublicNotice record);

    PublicNotice selectByPrimaryKey(Integer noticeId);

    List<PublicNotice> selectAll();

    int updateByPrimaryKey(PublicNotice record);
}