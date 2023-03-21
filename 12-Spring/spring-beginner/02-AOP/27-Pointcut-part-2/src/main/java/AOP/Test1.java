package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);

        Book book = context.getBean("bookBean", Book.class);

        uniLibrary.getBook("War and Not piece");
        uniLibrary.getBook(book);
        uniLibrary.returnBook();

        uniLibrary.getMagazine(13);

        context.close();
    }
}
