package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //параметры (..) - любые параметра, любого типа
    //Особенно удобно когда метод перегружен по кол-ву / типу параметров
    //    @Before("execution(public void get*(..))")

    //Если в качестве параметра передаётся созданный нами класс, то
    //необходимо указать полное имя класса
    @Before("execution(public void get*(AOP.Book, ..))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка получить книгу");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
    }
}
