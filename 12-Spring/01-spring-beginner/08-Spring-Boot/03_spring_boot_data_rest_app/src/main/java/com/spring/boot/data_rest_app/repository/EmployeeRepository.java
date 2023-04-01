package com.spring.boot.data_rest_app.repository;

import com.spring.boot.data_rest_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
