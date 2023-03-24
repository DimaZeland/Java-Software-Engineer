package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        //Создали объект SessionFactory

        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory()) {
            //Затем от данного объекта необходимо создать сессию,
            //где Session - обертка вокруг подключения к базе с помошью JDBC
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            //Получение всех записей из БД (нужно указывать не имя БД, а имя класса, которого связанного с БД)
//            List<Employee> emps = session.createQuery("from Employee").getResultList();

            List<Employee> emps = session.createQuery("from Employee where name = 'Alex' AND salary > 700").getResultList();
            for (Employee e : emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();
        }
    }
}
