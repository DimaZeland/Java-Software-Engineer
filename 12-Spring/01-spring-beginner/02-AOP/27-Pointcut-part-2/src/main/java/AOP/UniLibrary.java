package AOP;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary {

    //Пусть у нас его сквозная логика связанная с этим методом, но
    //к нему ничего писать не надо
    public void getBook(String bookName) {
        System.out.println("UniLibrary: Мы берем книгу: " + bookName);
    }

    public void getBook(Book book) {
        System.out.println("UniLibrary: Мы берем книгу: " + book.getName());
    }

    public void getMagazine(int number) {
        System.out.println("UniLibrary: Мы берем журнал №" + number);
    }

    public boolean returnBook() {
        System.out.println("UniLibrary: Мы возвращаем книгу");

        return true;
    }
}
