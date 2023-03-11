package com.demo.dto;

import com.demo.entity.PersonalInfo;
import com.demo.entity.Role;
import com.demo.validation.UpdateCheck;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public record UserCreateDto(
        @Valid
        PersonalInfo personalInfo,
        @NotNull
        String username,
        String info,
        @NotNull(groups = UpdateCheck.class)
        Role role,
        //                            @ValidCompany
        Integer companyId) {
}