package com.demo.java8.p9Generics;

// Обобщенный класс:
class MyClass7<T>{
   // Поле обобщенного типа:
   T value;
   // Конструктор:
   MyClass7(T val){
      value=val;
   }
}
// Главный класс:
class UsingWildcardDemo{
   // Статический обобщенный метод
   // (используется параметр обобщенного типа):
   static <T> void show(MyClass7<T> obj){
      System.out.println("Вызов метода show():");
      // Отображение значения поля:
      System.out.println(obj.value);
   }
   // Статический метод, в котором используется
   // обобщенная подстановка:
   static void display(MyClass7<?> obj){
      System.out.println("Вызов метода display():");
      // Отображение значения поля:
      System.out.println(obj.value);
   }
   // Главный метод:
   public static void main(String[] args){
      // При создании объекта явно указано значение
      // для обобщенного типа:
      MyClass7<Integer> A=new MyClass7<>(100);
      // При создании объекта не указано значение
      // для обобщенного типа:
      MyClass7 B=new MyClass7<>('B');
      // При создании объекта использована
      // обобщенная подстановка:
      MyClass7<?> C=new MyClass7<>("Объект С");
      // Примеры вызова методов show() и display()
      // с разными аргументами:
      show(A);
      display(A);
      show(B);
      display(B);
      show(C);
      display(C);
   }
}