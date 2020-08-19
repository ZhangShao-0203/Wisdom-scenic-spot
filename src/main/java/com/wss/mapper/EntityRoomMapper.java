package com.wss.mapper;

import com.wss.pojo.EntityRoom;
import java.util.List;

public interface EntityRoomMapper {
    int insert(EntityRoom record);

    List<EntityRoom> selectAll();
}