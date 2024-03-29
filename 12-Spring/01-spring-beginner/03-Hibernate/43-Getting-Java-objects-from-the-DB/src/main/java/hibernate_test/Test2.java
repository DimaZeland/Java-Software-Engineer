package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        //Создали объект SessionFactory

        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory()) {
            //Затем от данного объекта необходимо создать сессию,
            //где Session - обертка вокруг подключения к базе с помошью JDBC
            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Oleg", "Sidorov", "HR", 700);

            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            //Получение из БД по ID
            int myID = emp.getId();
            //необходимо открыть новую сессию, т.к. предыдущая уже закрыта
            session = factory.getCurrentSession();
            session.beginTransaction();
            //из строки в БД в объект
            Employee employee = session.get(Employee.class, myID);
            session.getTransaction().commit();

            System.out.println(employee);

        }
    }
}
