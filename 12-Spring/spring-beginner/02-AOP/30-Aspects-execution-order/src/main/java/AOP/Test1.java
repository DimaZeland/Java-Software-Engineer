package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);

        uniLibrary.getBook();
        uniLibrary.getMagazine();


        context.close();
    }
}
