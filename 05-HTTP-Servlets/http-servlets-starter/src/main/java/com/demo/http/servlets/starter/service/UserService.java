package com.demo.http.servlets.starter.service;

import com.demo.http.servlets.starter.dao.UserDao;
import com.demo.http.servlets.starter.dto.CreateUserDto;
import com.demo.http.servlets.starter.dto.UserDto;
import com.demo.http.servlets.starter.mapper.CreateUserMapper;
import com.demo.http.servlets.starter.mapper.UserMapper;
import com.demo.http.servlets.starter.exception.ValidationException;
import com.demo.http.servlets.starter.validator.CreateUserValidator;

import java.io.IOException;
import java.util.Optional;

public class UserService {

    private static final UserService INSTANCE = new UserService();
    private final CreateUserValidator createUserValidator = CreateUserValidator.getInstance();
    private final UserDao userDao = UserDao.getInstance();
    private final CreateUserMapper createUserMapper = CreateUserMapper.getInstance();
    private final ImageService imageService = ImageService.getInstance();
    private final UserMapper userMapper = UserMapper.getInstance();

    public Optional<UserDto> login(String username, String password) {
        return userDao.findByEmailAndPassword(username, password)
                .map(userMapper::mapFrom);
    }

    public Integer create(CreateUserDto userDto) {
        var validationResult = createUserValidator.isValid(userDto);
        if(!validationResult.isValid()) {
            throw new ValidationException(validationResult.getErrors());
        }
        var userEntity  = createUserMapper.mapFrom(userDto);
        try {
            imageService.upload(userEntity.getImage(), userDto.getImage().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        userDao.save(userEntity);
        return userEntity.getId();
    }

    public static UserService getInstance() {
        return INSTANCE;
    }

    private UserService() {
    }
}
