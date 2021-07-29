package com.fc.base.jdbc.mybatis.dao;


import com.fc.base.jdbc.mybatis.entit.User;

import java.util.List;

public interface UserMapper {
    List<User> findUserById(List<Integer> ids);
    User findUserByName(String username);
}