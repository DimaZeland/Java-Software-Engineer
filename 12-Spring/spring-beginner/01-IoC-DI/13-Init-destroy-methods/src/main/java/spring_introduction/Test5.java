package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        //Открываем контекст - сработал init-method
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        //При scope - prototypies для каждого bean вызывается init метод.
        //Destroy метод при таком scope не вызывается. 

        //Закрыли контекст - сработал destroy method
        context.close();
    }
}
