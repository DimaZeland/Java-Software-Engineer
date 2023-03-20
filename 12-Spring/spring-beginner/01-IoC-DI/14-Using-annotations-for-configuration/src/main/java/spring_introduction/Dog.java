package spring_introduction;

public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow!");
    }

    private void init() {
        System.out.println("Class dog: init method");
    }

    private void destroy() {
        System.out.println("Class dog: destroy method");
    }
}
