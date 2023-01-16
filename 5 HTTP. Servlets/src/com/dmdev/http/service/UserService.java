package com.dmdev.http.service;

import com.dmdev.http.dao.UserDao;
import com.dmdev.http.dto.CreateUserDto;
import com.dmdev.http.dto.UserDto;
import com.dmdev.http.entity.User;
import com.dmdev.http.exception.ValidationException;
import com.dmdev.http.mapper.CreateUserMapper;
import com.dmdev.http.mapper.UserMapper;
import com.dmdev.http.validator.CreateUserValidator;
import com.dmdev.http.validator.ValidationResult;

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
