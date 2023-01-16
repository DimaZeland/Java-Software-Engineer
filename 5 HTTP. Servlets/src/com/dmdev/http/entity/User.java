package com.dmdev.http.entity;

import com.dmdev.http.dto.AllArgsConstruct;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstruct
@Builder
public class User {
    private Integer id;
    private String name;
    private String image;
    private LocalDate birthday;
    private String email;
    private String password;
    private Role role;
    private Gender gender;

    public User(Integer id, String name, String image, LocalDate birthday, String email, String password, Role role, Gender gender) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.birthday = birthday;
        this.email = email;
        this.password = password;
        this.role = role;
        this.gender = gender;
    }
}
