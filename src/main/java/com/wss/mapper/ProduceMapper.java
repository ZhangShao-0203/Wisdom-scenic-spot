package com.wss.mapper;

import com.wss.pojo.Produce;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProduceMapper {
    Produce selPriceById(int produceId);
}
