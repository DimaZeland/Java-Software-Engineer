package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
//        ApllicationContext может читать сразу несколько конфиг файлов.
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext2.xml", "applicationContext.xml");

        //При scope по умолчанию все бины создаются автоматически в неявном виде.
        //Жизненый цикл бина начинается сразу с прочтением конфиг файла.
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        //При singleton создает один объект и дальше "шарятся" ссылки на него.
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

        //Какое последнее имя дали объекту по ссылке, такое и останется :)
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        context.close();
    }
}
