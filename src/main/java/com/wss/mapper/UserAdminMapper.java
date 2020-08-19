package com.wss.mapper;

import com.wss.pojo.UserAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserAdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(UserAdmin record);

    //管理员登录
    UserAdmin selectByPrimaryKey(Integer adminId);

    List<UserAdmin> selectAll();

    int updateByPrimaryKey(UserAdmin record);
}