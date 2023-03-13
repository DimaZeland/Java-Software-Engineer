package com.demo.java8.p9Generics;

// Суперкласс:
class Base2{
   // Текстовое поле:
   String name;
   // Конструктор:
   Base2(String txt){
      name=txt;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println("Текстовое поле: "+name);
   }
}
// Подкласс суперкласса Base2:
class Alpha2 extends Base2{
   // Целочисленное поле:
   int number;
   // Конструктор:
   Alpha2(String txt,int n){
      // Вызов конструктора суперкласса:
      super(txt);
      // Присваивание значения целочисленному полю:
      number=n;
   }
   // Переопределение метода:
   void show(){
      // Вызов версии метода из суперкласса:
      super.show();
      // Отображение значения целочисленного поля:
      System.out.println("Целочисленное поле: "+number);
   }
}
// Подкласс суперкласса Alpha2:
class Bravo2 extends Alpha2{
   // Символьное поле:
   char symbol;
   // Конструктор:
   Bravo2(String txt,int n,char s){
      // Вызов конструктора суперкласса:
      super(txt,n);
      // Присваивание значения символьному полю:
      symbol=s;
   }
   // Переопределение метода:
   void show(){
      // Вызов версии метода из суперкласса:
      super.show();
      // Отображение значения символьного поля:
      System.out.println("Символьное поле: "+symbol);
   }
}
// Обобщенный класс:
class MyClass2<X extends Base2>{
   // Поле обобщенного типа:
   X obj;
   // Конструктор:
   MyClass2(X obj){
      // Значение поля:
      this.obj=obj;
   }
   // Метод обобщенного класса:
   void show(){
      System.out.println("Объект класса MyClass2");
      // Вызов метода из поля обобщенного типа:
      obj.show();
   }
}
// Главный класс:
class GenTypeExtendingDemo{
   // Главный метод:
   public static void main(String[] args){
      // Объекты создаются на основе обобщенного класса:
      MyClass2<Alpha2> A=new MyClass2<>(new Alpha2("Alpha2",123));
      MyClass2<Bravo2> B=new MyClass2<>(new Bravo2("Bravo2",321,'B'));
      // Вызов метода show() из объектов:
      A.show();
      B.show();
   }
}