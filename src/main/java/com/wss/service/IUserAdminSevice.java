package com.wss.service;

import com.wss.pojo.UserAdmin;

public interface IUserAdminSevice {

    UserAdmin selectByPrimaryKey(Integer adminId);
}
