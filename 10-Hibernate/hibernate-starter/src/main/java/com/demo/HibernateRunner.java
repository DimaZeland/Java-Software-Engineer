package com.demo;

import com.demo.dao.CompanyRepository;
import com.demo.dao.PaymentRepository;
import com.demo.dao.UserRepository;
import com.demo.dto.UserCreateDto;
import com.demo.entity.PersonalInfo;
import com.demo.interceptor.TransactionInterceptor;
import com.demo.mapper.CompanyReadMapper;
import com.demo.mapper.UserCreateMapper;
import com.demo.mapper.UserReadMapper;
import com.demo.service.UserService;
import com.demo.util.HibernateUtil;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.sql.SQLException;

@Slf4j
public class HibernateRunner {

    @Transactional
    public static void main(String[] args) throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory()) {
            var session = (Session) Proxy.newProxyInstance(SessionFactory.class.getClassLoader(), new Class[]{Session.class},
                    (proxy, method, args1) -> method.invoke(sessionFactory.getCurrentSession(), args1));
//            session.beginTransaction();

            var companyRepository = new CompanyRepository(session);

            var companyReadMapper = new CompanyReadMapper();
            var userReadMapper = new UserReadMapper(companyReadMapper);
            var userCreateMapper = new UserCreateMapper(companyRepository);

            var userRepository = new UserRepository(session);
            var paymentRepository = new PaymentRepository(session);
//            var userService = new UserService(userRepository, userReadMapper, userCreateMapper);
            var transactionInterceptor = new TransactionInterceptor(sessionFactory);

            var userService = new ByteBuddy()
                    .subclass(UserService.class)
                    .method(ElementMatchers.any())
                    .intercept(MethodDelegation.to(transactionInterceptor))
                    .make()
                    .load(UserService.class.getClassLoader())
                    .getLoaded()
                    .getDeclaredConstructor(UserRepository.class, UserReadMapper.class, UserCreateMapper.class)
                    .newInstance(userRepository, userReadMapper, userCreateMapper);

            userService.findById(1L).ifPresent(System.out::println);

            UserCreateDto userCreateDto = new UserCreateDto(
                    PersonalInfo.builder()
                            .firstname("Liza")
                            .lastname("Stepanova")
//                            .birthDate(LocalDate.now())
                            .build(),
                    "liza3@gmail.com",
                    null,
                    null,
//                    Role.USER,
                    1
            );
            userService.create(userCreateDto);

//            session.getTransaction().commit();
        }
    }


}