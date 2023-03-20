package spring_introduction;

public class Person {
    private Pet pet;

    //Одним из способов задани зависимостей может служить конструктор
    //с параметрами
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }
}
