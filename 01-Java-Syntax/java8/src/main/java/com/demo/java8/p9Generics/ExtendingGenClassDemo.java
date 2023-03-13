package com.demo.java8.p9Generics;
// Обобщенный класс:
class Base<X>{
   // Обобщенное поле:
   X data;
   // Конструктор:
   Base(X data){
      this.data=data;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println(data);
   }
}
// Подкласс на основе обобщенного класса с целочисленным
// типом вместо обобщенного:
class Alpha1 extends Base<Integer>{
   // Конструктор:
   Alpha1(Integer n){
      // Вызов конструктора суперкласса:
      super(n);
   }
   // Переопределение метода:
   void show(){
      System.out.print("Целочисленное поле: ");
      // Вызов версии метода из суперкласса:
      super.show();
   }
}
// Подкласс на основе обобщенного класса с текстовым
// типом вместо обобщенного:
class Bravo1 extends Base<String>{
   // Конструктор:
   Bravo1(String txt){
      // Вызов конструктора суперкласса:
      super(txt);
   }
   // Переопределение метода:
   void show(){
      System.out.print("Текстовое поле: ");
      // Вызов версии метода из суперкласса:
      super.show();
   }
}
// Подкласс на основе обобщенного класса с символьным
// типом вместо обобщенного:
class Charlie1 extends Base<Character>{
   // Конструктор:
   Charlie1(Character s){
      // Вызов конструктора суперкласса:
      super(s);
   }
   // Переопределение метода:
   void show(){
      System.out.print("Символьное поле: ");
      // Вызов версии метода из суперкласса:
      super.show();
   }
}
// Главный класс:
class ExtendingGenClassDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объектов:
      Alpha1 A=new Alpha1(123);
      Bravo1 B=new Bravo1("объект B");
      Charlie1 C=new Charlie1('C');
      // Вызов метода show() из разных объектов:
      A.show();
      B.show();
      C.show();
   }
}