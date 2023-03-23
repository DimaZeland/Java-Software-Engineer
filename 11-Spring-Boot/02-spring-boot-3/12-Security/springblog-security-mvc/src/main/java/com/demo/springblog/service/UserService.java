package com.demo.springblog.service;

import com.demo.springblog.domain.User;
import com.demo.springblog.dto.UserForm;
import com.demo.springblog.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void registerUser(UserForm userForm) {
        User user = userForm.toUser(userForm);
        user.setPassword(passwordEncoder.encode(userForm.getPassword()));
        userRepository.save(user);
    }
}
