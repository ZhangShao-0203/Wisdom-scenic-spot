package com.wss.service.impl;

import com.wss.pojo.UserAdmin;
import com.wss.service.IUserAdminSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAdminSeviceImpl implements IUserAdminSevice {
    @Autowired
    private IUserAdminSevice adminSevice;
    @Override
    public UserAdmin selectByPrimaryKey(Integer adminId) {
        return adminSevice.selectByPrimaryKey(adminId);
    }
}
