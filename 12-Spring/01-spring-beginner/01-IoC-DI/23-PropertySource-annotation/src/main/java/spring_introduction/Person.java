package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//Чтобы в классе сработала анотация Autowired класс должен
//сначала попасть в Spring container, а делается это при помощи
//аннотации Component
//@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Person() {
        System.out.println("Created Person without pet");
    }

    //    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
