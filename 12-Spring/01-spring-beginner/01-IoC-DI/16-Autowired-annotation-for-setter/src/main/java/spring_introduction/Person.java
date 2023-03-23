package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Чтобы в классе сработала анотация Autowired класс должен
//сначала попасть в Spring container, а делается это при помощи
//аннотации Component
@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    Анотация Autowired автматически создает зависимости.
//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("class person: constructor(Pet pet)");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Created Person without pet");
    }

    //При использовании сеттора DI так же успешно срабатывает.
    //Такой подход имеет смысл когда есть условия в setter'е
    //Так же зависимости могут внедрять методы с любым именем, но тогда происходит путанница
    @Autowired
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
