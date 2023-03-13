package com.demo.java8.p9Generics;

// Обобщенный класс с одним параметром типа:
class MyClass4<X>{
   // Поле обобщенного типа:
   X data;
   // Конструктор с аргументом обобщенного типа:
   MyClass4(X data){
      // Присваивание значения полю:
      this.data=data;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println("Значение поля: "+data);
   }
}
// Главный класс:
class UsingGenClassDemo{
   public static void main(String[] args){
      // Создание объекта на основе обобщенного класса.
      // Вместо обобщенного параметра используется
      // идентификатор Integer:
      MyClass4<Integer> A=new MyClass4<Integer>(100);
      // Создание объекта на основе обобщенного класса.
      // Вместо обобщенного параметра используется
      // идентификатор Character:
      MyClass4<Character> B=new MyClass4<Character>('B');
      // Создание объекта на основе обобщенного класса.
      // Вместо обобщенного параметра используется
      // идентификатор String:
      MyClass4<String> C=new MyClass4<String>("Зеленый");
      // Вызов метода show() из объектов, созданных
      // на основе обобщенного класса:
      A.show();
      B.show();
      C.show();
   }
}