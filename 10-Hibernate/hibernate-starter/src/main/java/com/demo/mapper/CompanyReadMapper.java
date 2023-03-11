package com.demo.mapper;

import com.demo.dto.CompanyReadDto;
import com.demo.entity.Company;
import org.hibernate.Hibernate;

public class CompanyReadMapper implements Mapper<Company, CompanyReadDto> {

    @Override
    public CompanyReadDto mapFrom(Company object) {
        Hibernate.initialize(object.getLocales());
        return new CompanyReadDto(
                object.getId(),
                object.getName(),
                object.getLocales()
        );
    }
}