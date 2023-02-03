package com.dmdev;

import com.dmdev.entity.Role;
import com.dmdev.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.time.LocalDate;

public class HibernateRunner {

    public static void main(String[] args) throws SQLException {
//        BlockingDeque<Connection> pool = null;
//        Connection connection = pool.take();
//        SessionFactory (Hibernate аналог BlockingDeque<Connection> pool из JDBC)

//        Connection connection = DriverManager
//                .getConnection("db.url", "db.username", "db.password");
//        Session (Hibernate аналог Connection JDBC)
        Configuration configuration = new Configuration();
//        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy()); // имена полей в CamelCase будут привязыватся к столбцам таблицы в SnakeCase
//        configuration.addAnnotatedClass(User.class); // добавить сущность в конфигурацию "ConnectionPool"
        configuration.configure(); // аргументом нужно указать путь к hibernate.cfg.xml, по умолчанию src/main/resources/, hibernate.cfg.xml

        try (SessionFactory sessionFactory = configuration.buildSessionFactory(); // аналогично ConnectionPool должен существовать только 1 объект типа SessionFactory
             Session session = sessionFactory.openSession()) { // Session "обертка вокруг Connection", предоставляе больший функционал для управления Hibernate и его сущностями
            session.beginTransaction(); // начать транзакцию в рамках соединения с БД

            User user = User.builder()
                    .username("ivan1@gmail.com")
                    .firstname("Ivan")
                    .lastname("Ivanov")
                    .birthDate(LocalDate.of(2000, 1, 19))
                    .age(20)
                    .role(Role.ADMIN)
                    .build();
            session.persist(user); // сохранить пользователя в БД method save() deprecated in Hibernate 6
            session.getTransaction().commit(); // закрытьва транзакцию
        }
    }












}