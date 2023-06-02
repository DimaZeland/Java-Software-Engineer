package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.model.User;

import java.util.List;

public class UserService {

    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}