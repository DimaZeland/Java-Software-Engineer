package com.demo.java8.p08UsingObjects;


// Суперкласс:
class Base1{
   // Текстовое поле:
   String name;
   // Конструктор с текстовым аргументом:
   Base1(String txt){
      name=txt;
   }
   // Конструктор создания копии:
   Base1(Base1 obj){
      name=obj.name;
   }
}
// Подкласс:
class MyClass1 extends Base1{
   // Целочисленное поле:
   int code;
   // Конструктор с текстовым и целочисленным полем:
   MyClass1(String txt,int n){
      // Вызов конструктора суперкласса:
      super(txt);
      // Присваивание значения целочисленному полю:
      code=n;
   }
   // Конструктор создания копии:
   MyClass1(MyClass1 obj){
      // Вызов конструктора суперкласса:
      super(obj);
      // Присваивание значения целочисленному полю:
      code=obj.code;
   }
   // Метод для отображения значений полей:
   void show(){
      // Значение текстового поля:
      System.out.println("Текстовое поле: "+name);
      // Значение целочисленного поля:
      System.out.println("Целочисленное поле: "+code);
   }
}
// Главный класс:
class CopyConstructorDemo{
   public static void main(String[] args){
      // Создание объекта с вызовом конструктора
      // с двумя аргументами:
      MyClass1 A=new MyClass1("Желтый",200);
      // Создание объекта с вызовом конструктора
      // создания копии:
      MyClass1 B=new MyClass1(A);
      // Изменение значений полей первого объекта:
      A.name="Красный";
      A.code=100;
      // Создание объекта с вызовом конструктора
      // создания копии (аргумент - анонимный объект):
      MyClass1 C=new MyClass1(new MyClass1("Зеленый",300));
      // Отображение значений полей:
      System.out.println("Объект A");
      A.show();
      System.out.println("Объект B");
      B.show();
      System.out.println("Объект C");
      C.show();
   }
}