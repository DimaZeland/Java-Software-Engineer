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
    //именование методов лучше формировать по типу: тип аспекта + действие(метод) + Advice
    //В скобках - поинткат - метка когда должен выпалниться наш аспект метод

    //Для точненого указания метода
    //@Before("execution(public void AOP.UniLibrary.getBook())")

    //Обощенная модель для public void без параметров, где имя начинается с get
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
    }

    //В таком случает подойдет любой возвращаемый тип
    //Если не имеет значения модификатор доступа, то его можно пропустить
    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
    }
}
