package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//Описание конфиг файла через Java code, но вручную
@Configuration
public class MyConfig {

    //При синглетон - один объект
    //При проперти - несколько

    //Вне зависимости от написания конфигов механизм работы bean'ов всегда одинаков
    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    //Описывание bean'a с зависимостями
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
