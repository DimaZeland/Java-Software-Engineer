package com.demo.java8.p7AbstractClasses;

// Интерфейс с методом, имеющим код по умолчанию:
interface Base1{
   // Метод с кодом по умолчанию:
   default void show(String txt){
      System.out.println("Интерфейс Base: "+txt);
   }
   // Объявление метода:
   void hello();
}
// Класс реализует интерфейс Base:
class Alpha implements Base1{
   // Описание обычного метода:
   public void hello(){
      System.out.println("Объект класса Alpha");
   }
   // Описание метода с кодом по умолчанию:
   public void show(String txt){
      System.out.println("Класс Alpha: "+txt);
   }
}
// Класс реализует интерфейс Base:
class Bravo implements Base1{
   // Описание обычного метода:
   public void hello(){
      System.out.println("Объект класса Bravo");
   }
}
// Главный класс:
class UsingDefaultMethodsDemo{
   public static void main(String[] args){
      // Интерфейсная переменная:
      Base1 ref;
      // Объект класса Alpha:
      Alpha objA=new Alpha();
      // Вызов методов через объектную переменную:
      objA.hello();
      objA.show("объектная переменная objA");
      // Интерфейсной переменной присваивается ссылка
      // на объект класса Alpha:
      ref=objA;
      // Вызов метода через интерфейсную переменную:
      ref.show("интерфейсная переменная ref");
      // Объект класса Bravo:
      Bravo objB=new Bravo();
      // Вызов методов через объектную переменную:
      objB.hello();
      objB.show("объектная переменная objB");
      // Интерфейсной переменной присваивается ссылка
      // на объект класса Bravo:
      ref=objB;
      // Вызов метода через интерфейсную переменную:
      ref.show("интерфейсная переменная ref");
   }
}