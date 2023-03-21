package AOP.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoginAspect {

    //Данный тип Advice выбрасывается, если в методе бросается исключение
    //Вторым параметром (throwing="") мы можем получить информацию об исключении
    //Но она уже в любом случае пойдет в main
    @AfterThrowing(pointcut = "execution(* getStudents(..))", throwing = "exception")
    public void AfterThrowingGEtStudentsLoggingAdvice(Throwable exception) {
        System.out.println("AfterThrowingGEtStudentsLoggingAdvice: логируем выброс исключения: " + exception);
    }
}
