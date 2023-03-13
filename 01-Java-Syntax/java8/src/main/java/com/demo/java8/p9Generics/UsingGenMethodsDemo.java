package com.demo.java8.p9Generics;

// Класс с обобщенным методом:
class MyClass6{
   // Текстовое поле:
   String name;
   // Обобщенный метод:
   <X> void show(X arg){
      System.out.println(name+": "+arg);
   }
   // Конструктор:
   MyClass6(String txt){
      name=txt;
   }
}
// Главный класс:
class UsingGenMethodsDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объектов:
      MyClass6 A=new MyClass6("Объект A");
      MyClass6 B=new MyClass6("Объект B");
      // Вызов обобщенных методов из разных объектов:
      A.show(123);
      A.show("Alpha");
      A.show('A');
      B.show(123);
      B.show("Bravo");
      B.show('B');
   }
}