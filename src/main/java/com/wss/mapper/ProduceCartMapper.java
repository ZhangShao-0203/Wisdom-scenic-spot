package com.wss.mapper;

import com.wss.pojo.ProduceCart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProduceCartMapper {
    int insert(ProduceCart produceCart);

    List<ProduceCart> selByIds(int[] ids_int);
}
