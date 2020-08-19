package com.wss.mapper;

import com.wss.pojo.ProduceCart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProduceCartMapper {
    int insert(ProduceCart produceCart);
}
