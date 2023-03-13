package com.demo.java8.p10Lambda;
// Класс:
class MyClass{
   // Закрытое поле:
   private int number;
   // Конструктор:
   MyClass(int n){
      number=n;
   }
   // Открытые методы:
   void show(){
      System.out.println("Значение поля: "+number);
   }
   void set(int n){
      number=n;
   }
}
// Интерфейс:
interface MyInterface{
   MyClass create(int n);
}
// Главный класс:
class ConstructorReferenceDemo{
   // Главный метод:
   public static void main(String[] args){
      // Использование ссылки на конструктор:
      MyInterface ref=MyClass::new;
      // Создание объекта вызовом метода
      // из интерфейсной переменной:
      MyClass obj=ref.create(100);
      // Вызов методов объекта:
      obj.show();
      obj.set(200);
      obj.show();
   }
}