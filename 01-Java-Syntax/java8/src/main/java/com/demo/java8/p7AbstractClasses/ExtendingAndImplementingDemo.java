package com.demo.java8.p7AbstractClasses;

// Первый интерфейс:
interface First{
   // Объявление метода:
   String getFirst();
   // Описание метода:
   default void show(){
      System.out.println("Интерфейс First: метод show()");
   }
}
// Второй интерфейс:
interface Second{
   // Объявление метода:
   String getSecond();
   // Описание метода:
   default void show(){
      System.out.println("Интерфейс Second: метод show()");
   }
}
// Суперкласс:
class Base{
   // Описание метода:
   String getBase(){
      return "Класс Base";
   }
   // Описание метода:
   void show(){
      System.out.println("Класс Base: метод show()");
   }
}
// Подкласс наследует суперкласс и реализует интерфейсы:
class MyClass extends Base implements First, Second{
   // Описание метода:
   public String getFirst(){
      return "Интерфейс First";
   }
   // Описание метода:
   public String getSecond(){
      return "Интерфейс Bravo";
   }
   // Описание метода:
   public void show(){
      System.out.println("Мы используем:");
      System.out.println(getFirst());
      System.out.println(getSecond());
      System.out.println(getBase());
      // Вызов версии метода из интерфейса First:
      First.super.show();
      // Вызов версии метода из интерфейса Second:
      Second.super.show();
      // Вызов версии метода из суперкласса Base:
      super.show();
   }
}
// Главный класс:
class ExtendingAndImplementingDemo{
   public static void main(String[] args){
      // Создание объекта подкласса:
      MyClass obj=new MyClass();
      // Вызов метода из объекта:
      obj.show();
   }
}