package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Класс аспект.
//Аспект - содержит сквозщную логику
//Для использования аннотаций Aspect необходим пакет AspecJ weaver
@Component
@Aspect
public class LoggingAspect {

    //Advice метод.
//    именование методов лучше формировать по типу: тип аспекта + действие(метод) + Advice

    //В скобках - поинткат - метка когда должен выпалниться наш аспект метод
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
    }
}
