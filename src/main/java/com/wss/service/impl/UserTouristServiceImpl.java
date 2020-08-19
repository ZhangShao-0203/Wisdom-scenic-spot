package com.wss.service.impl;

import com.wss.mapper.UserTouristMapper;
import com.wss.pojo.UserTourist;
import com.wss.service.IUserTouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTouristServiceImpl implements IUserTouristService {

    @Autowired
    private UserTouristMapper userTouristMapper;
    @Override
    public int deleteByPrimaryKey(Integer touristId) {
        return userTouristMapper.deleteByPrimaryKey(touristId);
    }

    @Override
    public int insert(UserTourist record) {
        return userTouristMapper.insert(record);
    }

    @Override
    public UserTourist selectByPrimaryKey(Integer touristId) {
        return userTouristMapper.selectByPrimaryKey(touristId);
    }

    @Override
    public List<UserTourist> selectAll() {
        return userTouristMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(UserTourist record) {
        return userTouristMapper.updateByPrimaryKey(record);
    }
}
