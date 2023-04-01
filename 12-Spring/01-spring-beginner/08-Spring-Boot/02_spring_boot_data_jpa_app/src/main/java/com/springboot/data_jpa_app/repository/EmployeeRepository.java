package com.springboot.data_jpa_app.repository;

import com.springboot.data_jpa_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
