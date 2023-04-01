package com.spring.boot.app.dao;

import com.spring.boot.app.entity.Employee;

import java.util.List;


public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
