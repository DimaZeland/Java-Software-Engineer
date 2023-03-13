package com.demo.java8.p3Classes;

// Класс с закрытыми членами:
class MyClass4{
   // Закрытое статическое поле:
   private static int count=0;
   // Закрытые нестатические поля:
   private int number;
   private String name;
   // Конструктор без аргументов:
   MyClass4(String n){
      // Увеличение значения статического поля:
      count++;
      // Присваивание значений нестатическим полям:
      name=n;
      number=count;
      // Отображение сообщения:
      System.out.println("Создан объект с именем "+name);
   }
   // Метод для отображения сообщения:
   public void show(){
      System.out.println("Название объекта: "+name);
      System.out.println("Номер объекта: "+number);
      System.out.println("Количество объектов: "+count);
   }
   // Метод для присваивания значения закрытому
   // текстовому полю:
   public void set(String n){
      name=n;
   }
}
// Класс с главным методом программы:
class UsingPrivateMembersDemo{
   // Главный метод программы:
   public static void main(String[] args){
      // Создание объектов:
      MyClass4 objA=new MyClass4("Alpha");
      MyClass4 objB=new MyClass4("Bravo");
      MyClass4 objC=new MyClass4("Charlie");
      // Вызов метода для каждого из объектов:
      objA.show();
      objB.show();
      objC.show();
      // Изменение поля второго объекта:
      objB.set("Второй Объект");
      // Отображение значений полей объекта:
      objB.show();
   }
}