package AOP.aspects;

import AOP.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoginAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом" +
                " getStudents");
    }

    //Поскольку данный Advice срабатывает после работы метода, то он может перехватить результат
    //работы метода.
    //Конечный результат мы получим только после работы  AfterReturning Advice
    //Перехват результата работы бизнес метода
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {

        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "mr." + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGarde();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGarde(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после метода" +
                " getStudents");
    }
}
