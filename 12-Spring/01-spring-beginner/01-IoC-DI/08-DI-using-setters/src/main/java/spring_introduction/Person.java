package spring_introduction;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Created Person without pet");
    }

    public void setPet(Pet pet) {
        System.out.println("class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }
}
