package AOP;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary {

    //Пусть у нас его сквозная логика связанная с этим методом, но
    //к нему ничего писать не надо
    public void getBook() {
        System.out.println("UniLibrary: Мы берем книгу");
    }

    public void getMagazine() {
        System.out.println("UniLibrary: Мы берем журнал");
    }

    public boolean returnBook() {
        System.out.println("UniLibrary: Мы возвращаем книгу");

        return true;
    }
}
