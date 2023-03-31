package com.spring.rest;

import com.spring.rest.configuration.MyConfig;
import com.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Клиент для приложения spring_course_rest
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = applicationContext.getBean("communication", Communication.class);

        //Получение списка работников и вывод в консоль
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee employeeById = communication.getEmployee(4);
        System.out.println(employeeById);

        Employee employee = new Employee("Sveta", "Sokolova", "IT", 670);
//
//        employee.setId(11);
//        employee.setSalary(1200);
//        employee.setDepartment("HR");

        communication.saveEmployee(employee);

//        communication.deleteEmployee(11);
    }
}
