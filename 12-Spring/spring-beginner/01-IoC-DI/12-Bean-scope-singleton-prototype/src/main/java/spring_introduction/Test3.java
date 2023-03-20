package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        //Вызовы set происходят при помощи Spring контейнера
        System.out.println("Person surname: " + person.getSurname());
        System.out.println("Person age: " + person.getAge());

        context.close();
    }
}
