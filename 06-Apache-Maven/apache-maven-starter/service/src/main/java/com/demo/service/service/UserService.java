package com.demo.service.service;

import com.demo.database.dao.UserDao;
import com.demo.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(it -> new UserDto());
    }
}
