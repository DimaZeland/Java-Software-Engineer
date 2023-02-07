package com.dmdev;

import com.dmdev.entity.Birthday;
import com.dmdev.entity.Company;
import com.dmdev.entity.PersonalInfo;
import com.dmdev.entity.User;
import com.dmdev.util.HibernateUtil;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.time.LocalDate;

@Slf4j // позволяет не указывать private static final Logger log = LoggerFactory.getLogger(HibernateRunner.class); // org.slf4j.Logger позволяет добавить любой логгер,
public class HibernateRunner {
    // нужно создавать каждый логгер в отдельном классе
    public static void main(String[] args) throws SQLException {
        Company company = Company.builder()
                .name("Amazon")
                .build();
        User user = User.builder()
                .username("ivan@gmail1.com")
                .personalInfo(PersonalInfo.builder()
                        .lastname("Petrov")
                        .firstname("Petr")
                        .birthDate(new Birthday(LocalDate.of(2000, 1, 2)))
                        .build())
                .company(company)
                .build();

        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory()) {
            Session session1 = sessionFactory.openSession();
            try (session1) {
                Transaction transaction = session1.beginTransaction();

                session1.getTransaction().commit();
            }
        }
    }












}