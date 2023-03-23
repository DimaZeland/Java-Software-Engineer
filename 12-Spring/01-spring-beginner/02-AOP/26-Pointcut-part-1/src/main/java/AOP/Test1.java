package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        //Вызов метода, к которому прикреплен Advice метод
        uniLibrary.getBook();
        uniLibrary.returnBook();

        //Так же вызовет advice beforeGetBookAdvice при
        //@Before("execution(public void get*())")
        uniLibrary.getMagazine();


        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();


        context.close();
    }
}
