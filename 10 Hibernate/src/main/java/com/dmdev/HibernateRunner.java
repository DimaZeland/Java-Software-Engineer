package com.dmdev;

import com.dmdev.entity.User;
import com.dmdev.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

public class HibernateRunner {

    private static final Logger log = LoggerFactory.getLogger(HibernateRunner.class); // org.slf4j.Logger позволяет добавить любой логгер,
    // нужно создавать каждый логгер в отдельном классе
    public static void main(String[] args) throws SQLException {
        User user = User.builder()
                .username("ivan@gmail.com")
                .lastname("Ivanov")
                .firstname("Ivan")
                .build();
        log.info("User entity is in transient state, object: {}", user); // по правилу хорошего тона значение переменной вставлять не "+", а "через фигурные скобки"

        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory()) {
            Session session1 = sessionFactory.openSession();
            try (session1) {
                Transaction transaction = session1.beginTransaction();
                log.trace("Transaction is created, {}", transaction);

                session1.saveOrUpdate(user);
                log.trace("User is in persistent state: {}, session {}", user, session1);

                session1.getTransaction().commit();
            }
            log.warn("User is in detached state: {}, session is closed {}", user, session1);
        } catch (Exception exception) {
            log.error("Exception occurred", exception); // при передаче объектов Throwable есть метод без необходимости вставки фигурных скобок в строке
            throw exception;
        }
    }












}