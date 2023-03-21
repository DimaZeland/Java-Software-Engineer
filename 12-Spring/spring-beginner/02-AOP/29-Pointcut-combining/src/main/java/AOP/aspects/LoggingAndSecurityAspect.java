package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(* AOP.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {}

    @Pointcut("execution(public void AOP.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    //Pointcut который подходит для всех методов, кроме returnMagazineFromUniLibrary()
    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log#10");
    }







    @Pointcut("execution(* AOP.UniLibrary.get*(..))")
    private void allGetMethodsFromUniLibrary(){}

    @Pointcut("execution(* AOP.UniLibrary.return*(..))")
    private void allReturnMethodsFromUniLibrary(){}

    //Pointcut можно комбинировать с помощью логических оперторов:
    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnsMethodsFromUniLibrary(){}


    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log#1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
    }

    @Before("allGetAndReturnsMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log#3");
    }


}
