package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        //Создали объект SessionFactory

        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            //Удаление единичного объекта
            Employee emp = session.get(Employee.class, 4);
            session.delete(emp);

            session.getTransaction().commit();

            //Удаление нескольких объектов
            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete Employee where name = 'Alex'").executeUpdate();

            session.getTransaction().commit();
        }
    }
}
