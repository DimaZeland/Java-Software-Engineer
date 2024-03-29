package hibernate_test2.entity;

import javax.persistence.*;

//Аннотация @Entity говорит о том, что данный класс будет иметь отображение (будет таблицей) в БД
//В аннотации @Table указываем, что данный класс является таблицей и указываем имя таблицы
@Entity
@Table(name = "employees")
public class Employee {

    //при помощи аннотации @Column необходимо указать к какому столбцу таблицы будет
    //относиться текущее поле
    //@Аннотация id говорит о том, что столбец связанный с данным полем является primary key
    //Аннотация @GeneratedValue задает стратегию генерации id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //IDENTITY - увеличение по правилам в БД
    //SEQUENCE - полагается на sequence БД (но в MySql его нет)
    //TABLE (устаревшее) - что-то с еще одной таблицей :)
    //AUTO (дефолтный) - выбор будет выполнен в зависимости от
    //типа БД

    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private int salary;

    //Связываем таблицы между собой отношением One-to-One
    //Указываем FK связывающий между собой таблицы
    //Так же указываем какие cascade операции могут быть выполнены
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Detail empDetail;

    //Обязательно необходимо созадть конструктор без параметров
    public Employee() {
    }

    //Доп. конструктор, просто чтобы был
    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    //Так же необходимы геттеры и сеттеры для каждого из полей
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }
}
