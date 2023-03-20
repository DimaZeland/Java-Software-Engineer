package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Чтобы в классе сработала анотация Autowired класс должен
//сначала попасть в Spring container, а делается это при помощи
//аннотации Component
@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person() {
        System.out.println("Created Person without pet");
    }

    //При наличии более одного подходящего bean'а при помощи аннотации
    //@Qualifier("<bean>") может указать какой именно bean необходим для внедрении зависимости.
    @Autowired
    @Qualifier("catBean")
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

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
