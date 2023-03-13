package com.demo.java8.p07AbstractClasses;
// Интерфейс:
interface MyInterface{
   // Статическая константа:
   int NUMBER=100;
   // Объявление методов:
   int getNumber(double x);
   char getSymbol(int n);
}
// Класс реализует интерфейс:
class MyClass4 implements MyInterface{
   // Описание методов:
   public int getNumber(double x){
      return (int)x;
   }
   public char getSymbol(int n){
      return (char)('A'+n);
   }
}
// Главный класс:
class UsingInterfaceDemo{
   public static void main(String[] args){
      MyClass4 obj=new MyClass4();
      System.out.println("Статическая константа: "+MyClass4.NUMBER);
      System.out.println("Целое число: "+obj.getNumber(12.5));
      System.out.println("Символ: "+obj.getSymbol(3));
   }
}