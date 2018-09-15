package com.dev.app.persistence.dao;

import java.util.List;

import com.dev.app.persistence.bean.User;

public interface UserDao
{
    void insertUser(User user);
    User findUserById(Integer id);
    List<User> findAllUsers();
}


