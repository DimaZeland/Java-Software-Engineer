package com.demo.java8.p08UsingObjects;

// Класс для создания объектов:
class MyClass4{
   // Целочисленное поле:
   int number;
   // Конструктор:
   MyClass4(int n){
      number=n;
   }
}
// Класс со статическим методом swap() и главным
// методом программы:
class SwapFieldsDemo{
   // Статический метод с двумя аргументами, являющимися
   // объектами класса MyClass4:
   static void swap(MyClass4 A,MyClass4 B){
      System.out.println("Выполняется метод swap()");
      // Значения поля number объектов, переданных
      // аргументами методу:
      System.out.println("Объект A: "+A.number);
      System.out.println("Объект B: "+B.number);
      // Объекты "обмениваются" значениями полей:
      int number=B.number;
      B.number=A.number;
      A.number=number;
      // Значения поля number объектов, переданных
      // аргументами методу swap()
      // (после "обмена" значениями полей):
      System.out.println("Значения полей изменены");
      System.out.println("Объект A: "+A.number);
      System.out.println("Объект B: "+B.number);
      System.out.println("Завершено выполнение метода swap()");
   }
   // Главный метод программы:
   public static void main(String[] args){
      // Создание объектов:
      MyClass4 A=new MyClass4(100);
      MyClass4 B=new MyClass4(200);
      // Значения поля number объектов A и B до
      // вызова метода swap():
      System.out.println("До вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
      // Вызов метода swap():
      swap(A,B);
      // Значения поля number объектов A и B после
      // вызова метода swap():
      System.out.println("После вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
   }
}