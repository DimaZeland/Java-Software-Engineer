package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();

        Session session = null;
        try {
            /**
             * Добавление
             */
                session = factory.getCurrentSession();

                Employee employee = new Employee("Misha", "Sidorov", "HR", 850);
                Detail detail = new Detail("London", "56358795221", "mashanya@gmail.com");

                //Чтобы в таблице была двухстороння связь необходимо сделать "двойнок присвоение"
                detail.setEmployee(employee);
                employee.setEmpDetail(detail);

                session.beginTransaction();

                session.save(detail);

                session.getTransaction().commit();
            session.close();

            session = factory.getCurrentSession();
            session.beginTransaction();

           // detail = session.get(Detail.class, 1);
            System.out.println(detail.getEmployee());
            session.delete(detail);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}

