package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of") // статический метод инициализации с методом of
@Embeddable
public class LocaleInfo {

    private String lang;
    private String description;
}