package com.spring.mvc;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

@Component
public class Employee {
    //Валидация по кол-ву символом @Size
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;

    //Требует, чтобы поле было не пустым и не Null
    //@NotEmpty(message = "surname is required filed")
    //все тоже самое, что и @NotEmpty, но так же не дает заполнить пробелами
    @NotBlank(message = "surname is required filed")
    private String surname;
    private Integer salary;
    private String department;
    private String carBrand;
    private String[] languages;

    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private Map<String, String> languageMap;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMV", "BMV");
        carBrands.put("Audi", "Audi");
        carBrands.put("Merceders-Benz", "MB");

        languageMap = new HashMap<>();
        languageMap.put("English", "EN");
        languageMap.put("French", "FR");
        languageMap.put("Deutch", "De");
    }

    public Employee(String name, String surname, Integer salary, String department, String carBrand) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        this.carBrand = carBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }


    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageMap() {
        return languageMap;
    }

    public void setLanguageMap(Map<String, String> languageMap) {
        this.languageMap = languageMap;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
