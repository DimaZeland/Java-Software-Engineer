package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        /**
         * ДЛя получина bean из Spring контейнра нужно создать applicatinContext (конфиг)
         *
         * Создание контекста из XML.
         */
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Получение bean
        //Если бы мы указали Dog/Cat.class то в случае изменения конфига
        //пришлось бы менять и код. В случае с Pet.class такой необходимости нет.
        //Мы получаем объект имплементирющий интерфейс Pet
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        //Контекст необходимо закрывать.
        //Приложение не сработает пока не будет закрыт контекст.
        context.close();
    }
}
