package com.demo.dto;

import com.demo.entity.PersonalInfo;
import com.demo.entity.Role;

public record UserReadDto(Long id,
                          PersonalInfo personalInfo,
                          String username,
                          String info,
                          Role role,
                          CompanyReadDto company) {
}