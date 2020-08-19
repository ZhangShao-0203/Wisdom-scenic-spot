package com.wss.service.impl;

import com.wss.mapper.UserAdminMapper;
import com.wss.pojo.UserAdmin;
import com.wss.service.IUserAdminSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAdminSeviceImpl implements IUserAdminSevice {
    @Autowired
    private UserAdminMapper adminMapper;
    @Override
    public UserAdmin selectByPrimaryKey(Integer adminId) {
        return adminMapper.selectByPrimaryKey(adminId);
    }
}
