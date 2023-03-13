package com.demo.java8.p07AbstractClasses;

// Первый интерфейс:
interface First4{
   void hello();
}
// Второй интерфейс:
interface Second4{
   void hi();
}
// Класс реализует два интерфейса:
class MyClas implements First4, Second4{
   // Описание метода из первого интерфейса:
   public void hello(){
      System.out.println("Метод из интерфейса First");
   }
   // Описание метода из второго интерфейса:
   public void hi(){
      System.out.println("Метод из интерфейса Second");
   }
}
// Главный класс:
class UsingInterfacesDemo{
   public static void main(String[] args){
      // Создание объекта:
      MyClas obj=new MyClas();
      // Вызов методов из объекта:
      obj.hello();
      obj.hi();
   }
}