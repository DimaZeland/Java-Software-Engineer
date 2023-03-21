package AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    //При использованни данного Advice нам необхродимо самостоятельно вызывать таргет метод в Advice
    //при помощи ProceedingJoinPoint (через него можно так же как и через простой JoinPoint получить
    //сигнатуру метода)
    @Around("execution(public String AOP.UniLibrary.returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

        //Вызов самого таргет метода
        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        //изменение результата тагрет метода
        targetMethodResult = "Не война и мир";

        System.out.println("aroundReturnBookLoggingAdvice: Время работы returnBook = " + (end-begin) + " миллисекунд");
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");

        return targetMethodResult;
    }
}
