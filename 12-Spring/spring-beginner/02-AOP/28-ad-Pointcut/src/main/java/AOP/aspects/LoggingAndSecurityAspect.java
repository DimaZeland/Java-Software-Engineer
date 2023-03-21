package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    //Скоращенный вариант записи pointcut'ов
    //ЕСли сделать данный метод public, то его можно будет использваоть и в других классах аспектах
    @Pointcut("execution(* get*(..))")
    private void allGetMethods(){};

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: Попытка получить книгу/журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав доступа");
    }
}
