package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Чтобы в классе сработала анотация Autowired класс должен
//сначала попасть в Spring container, а делается это при помощи
//аннотации Component
@Component("personBean")
public class Person {
    private Pet pet;

    //При помощи анотации @Value можно "захардкодить значения полей"
    //Можно написать значения сразу в аннотации, а можно через properties файла
    @Value("${person.surname}")
    private String surname;
    @Value("19")
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

    public int getAge() {
        return age;
    }
}
