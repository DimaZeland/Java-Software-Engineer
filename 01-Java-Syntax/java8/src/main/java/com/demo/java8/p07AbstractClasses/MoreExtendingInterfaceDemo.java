package com.demo.java8.p07AbstractClasses;
// Первый интерфейс:
interface First3{
   // Описание метода:
   default void alpha(){
      System.out.println("Интерфейс First: метод alpha()");
   }
}
// Второй интерфейс:
interface Second3 extends First3{
   // Описание методов:
   default void alpha(){
      // Вызов версии метода из интерфейса First:
      First3.super.alpha();
      System.out.println("Интерфейс Bravo: метод alpha()");
   }
   default void bravo(){
      System.out.println("Интерфейс Bravo: метод bravo()");
   }
}
// Класс реализует интерфейс:
class MyClass3 implements Second3{
   // Описание метода:
   public void bravo(){
      // Вызов версии метода из интерфейса Second:
      Second3.super.bravo();
      System.out.println("Класс MyClass: метод bravo()");
   }
}
// Главный класс:
class MoreExtendingInterfaceDemo{
   public static void main(String[] args){
      // Создание объекта:
      MyClass3 obj=new MyClass3();
      // Вызов методов:
      obj.alpha();
      obj.bravo();
   }
}