package com.springboot.data_jpa_app.service;

import com.springboot.data_jpa_app.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    @Transactional
    void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);

}
