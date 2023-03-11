package com.demo.springboot.starter.repository;

import com.demo.springboot.starter.entity.EmployeeEntity;
import com.demo.springboot.starter.dto.EmployeeFilter;
import com.querydsl.jpa.impl.JPAQuery;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import java.util.List;

import static com.demo.springboot.starter.entity.QEmployeeEntity.employeeEntity;

@RequiredArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeCustomRepository {

    private final EntityManager entityManager;

    @Override
    public List<EmployeeEntity> findByFilter(EmployeeFilter filter) {
        return new JPAQuery<EmployeeEntity>(entityManager)
                .select(employeeEntity)
                .from(employeeEntity)
                .where(employeeEntity.firstName.containsIgnoreCase(filter.getFirstName()))
                .fetch();
    }
}