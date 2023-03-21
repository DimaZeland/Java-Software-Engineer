package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("universityBean", University.class);
        university.addStudent();

        List<Student> studentList = university.getStudents();

        System.out.println(studentList);
        context.close();
    }
}
