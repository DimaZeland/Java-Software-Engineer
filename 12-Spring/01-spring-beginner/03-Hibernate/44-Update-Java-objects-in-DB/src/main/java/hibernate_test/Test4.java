package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        //Создали объект SessionFactory

        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            //Мы вытаскиваем объект из БД, делаем изменения
            Employee emp = session.get(Employee.class, 1);
            emp.setSalary(1500);

            //На коммите все изменения с объектом заносятся в таблицу (как в GIT)
            session.getTransaction().commit();

            //изменение сразу списку
            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Employee set salary = 2000 WHERE name = 'Alex'").executeUpdate();

            session.getTransaction().commit();
        }
    }
}
