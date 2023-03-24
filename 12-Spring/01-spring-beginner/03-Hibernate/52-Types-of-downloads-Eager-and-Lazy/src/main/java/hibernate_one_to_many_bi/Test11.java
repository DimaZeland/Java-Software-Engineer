package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test11 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
             Session session = factory.getCurrentSession()) {
            Department department = new Department("Sales", 800, 1500);

            Employee emp1 = new Employee("Zaur", "Tregulov", 800);
            Employee emp2 = new Employee("Elena", "Smirnova", 1200);
            Employee emp3 = new Employee("Vladislav", "Sapozhnikov", 1500);

            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);
            department.addEmployeeToDepartment(emp3);

            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
        }
    }
}

