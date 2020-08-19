package com.wss.mapper;

import com.wss.pojo.EntityTicket;
import java.util.List;

public interface EntityTicketMapper {
    int deleteByPrimaryKey(Integer tickeId);

    int insert(EntityTicket record);

    EntityTicket selectByPrimaryKey(Integer tickeId);

    List<EntityTicket> selectAll();

    int updateByPrimaryKey(EntityTicket record);
}