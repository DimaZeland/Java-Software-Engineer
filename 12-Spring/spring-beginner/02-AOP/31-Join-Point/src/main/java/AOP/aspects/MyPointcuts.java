package AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

//Еслинам необходим жесктий порядок в вызове аспектов, то их
//необходимо разделить на классы и потом задать им порядок
public class MyPointcuts {
    //используем pointcut сразу на 2 аспект класса
    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {
    }
}
