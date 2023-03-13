package com.demo.java8.p7AbstractClasses;

// Первый интерфейс:
interface First2{
   default void hello(){
      System.out.println("Метод из интерфейса First");
   }
}
// Второй интерфейс:
interface Second2{
   default void hello(){
      System.out.println("Метод из интерфейса Second");
   }
}
// Класс реализует два интерфейса:
class MyClass2 implements First2, Second2{
   // Описание метода:
   public void hello(){
      // Вызов версии метода из интерфейса First:
      First2.super.hello();
      // Вызов версии метода из интерфейса Second:
      Second2.super.hello();
   }
}
// Главный класс:
class MoreDefaultMethodsDemo{
   public static void main(String[] args){
      // Создание объекта:
      MyClass2 obj=new MyClass2();
      // Вызов метода:
      obj.hello();
   }
}