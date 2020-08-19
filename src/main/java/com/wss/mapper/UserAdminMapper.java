package com.wss.mapper;

import com.wss.pojo.UserAdmin;
import java.util.List;

public interface UserAdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(UserAdmin record);

    UserAdmin selectByPrimaryKey(Integer adminId);

    List<UserAdmin> selectAll();

    int updateByPrimaryKey(UserAdmin record);
}