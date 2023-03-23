package AOP;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    //Пусть у нас его сквозная логика связанная с этим методом, но
    //к нему ничего писать не надо
    public void getBook() {
        System.out.println("Мы берем книгу");
    }
}
