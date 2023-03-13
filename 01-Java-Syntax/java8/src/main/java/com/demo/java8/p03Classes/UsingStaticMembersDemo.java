package com.demo.java8.p03Classes;

// Класс со статическими членами:
class MyClass5{
   // Статическое поле:
   static int count=0;
   // Конструктор без аргументов:
   MyClass5(){
      // Увеличение значения статического поля:
      count++;
      // Отображение сообщения:
      System.out.println("Создан объект номер "+count);
   }
   // Статический метод:
   static void show(){
      System.out.println("Количество объектов: "+count);
   }
}
// Класс с главным методом программы:
class UsingStaticMembersDemo{
   // Главный метод программы:
   public static void main(String[] args){
      // Вызов статического метода:
      MyClass5.show();
      // Создание объектов:
      MyClass5 objA=new MyClass5();
      MyClass5 objB=new MyClass5();
      MyClass5 objC=new MyClass5();
      // Вызов статического метода через ссылку на класс:
      MyClass5.show();
      // Вызов статического метода через ссылку на объект:
      objC.show();
      objB.show();
   }
}