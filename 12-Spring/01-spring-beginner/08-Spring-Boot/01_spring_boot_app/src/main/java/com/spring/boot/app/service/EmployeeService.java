package com.spring.boot.app.service;

import com.spring.boot.app.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    @Transactional
    void deleteEmployee(int id);

}
