package com.demo.springboot.starter.repository;

import com.demo.springboot.starter.entity.EmployeeEntity;
import com.demo.springboot.starter.dto.EmployeeFilter;

import java.util.List;

public interface EmployeeCustomRepository {

    List<EmployeeEntity> findByFilter(EmployeeFilter filter);
}