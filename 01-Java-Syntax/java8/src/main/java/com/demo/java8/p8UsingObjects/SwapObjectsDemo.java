package com.demo.java8.p8UsingObjects;


class MyClass5{
   int number;
   MyClass5(int n){
      number=n;
   }
}
class SwapObjectsDemo{
   static void swap(MyClass5 A,MyClass5 B){
      System.out.println("Выполняется метод swap()");
      System.out.println("Объект A: "+A.number);
      System.out.println("Объект B: "+B.number);
      // Аргументы "обмениваются" значениями:
      MyClass5 X=B;
      B=A;
      A=X;
      System.out.println("Значения аргументов изменены");
      System.out.println("Объект A: "+A.number);
      System.out.println("Объект B: "+B.number);
      System.out.println("Завершено выполнение метода swap()");
   }
   public static void main(String[] args){
      MyClass5 A=new MyClass5(100);
      MyClass5 B=new MyClass5(200);
      System.out.println("До вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
      swap(A,B);
      System.out.println("После вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
   }
}