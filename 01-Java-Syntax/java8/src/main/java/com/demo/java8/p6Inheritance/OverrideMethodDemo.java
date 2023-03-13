package com.demo.java8.p6Inheritance;

// Суперкласс:
class Alpha3{
   // Текстовое поле:
   String name;
   // Метод для отображения значения текстового поля:
   void show(){
      System.out.println("Объект класса Alpha:");
      System.out.println("Поле name - "+name);
   }
   // Конструктор класса:
   Alpha3(String name){
      this.name=name;
   }
}
// Подкласс:
class Bravo3 extends Alpha3{
   // Целочисленное поле:
   int code;
   // Переопределение метода. Новой версией метода
   // отображаются значения двух полей:
   void show(){
      System.out.println("Объект класса Bravo:");
      System.out.println("Поле name - "+name);
      System.out.println("Поле code - "+code);
   }
   // Конструктор класса:
   Bravo3(String name,int code){
      // Вызов конструктора суперкласса:
      super(name);
      this.code=code;
   }
}
// Главный класс:
class OverrideMethodDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объекта суперкласса:
      Alpha3 objA=new Alpha3("objA");
      // Создание объекта подкласса:
      Bravo3 objB=new Bravo3("objB",123);
      // Вызов метода из объекта суперкласса:
      objA.show();
      // Вызов метода из объекта подкласса:
      objB.show();
   }
}