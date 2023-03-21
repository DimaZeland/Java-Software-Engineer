package AOP;

import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("SchoolLibrary: Мы берем книгу");
    }
}
