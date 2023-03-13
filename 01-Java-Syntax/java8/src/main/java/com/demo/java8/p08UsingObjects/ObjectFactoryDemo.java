package com.demo.java8.p08UsingObjects;


// Абстрактный суперкласс:
abstract class Base3{
   // Объявление абстрактного метода:
   abstract void show();
}
// Производные классы:
class Alpha extends Base3{
   void show(){
      System.out.println("Объект класса Alpha");
   }
}
class Bravo extends Base3{
   void show(){
      System.out.println("Объект класса Bravo");
   }
}
class Charlie extends Base3{
   void show(){
      System.out.println("Объект класса Charlie");
   }
}
// Главный класс:
class ObjectFactoryDemo{
   // Статический метод для создания объектов
   // разных классов:
   static Base3 createObject(int n){
      if(n==1) return new Alpha();
      if(n==2) return new Bravo();
      return new Charlie();
   }
   // Главный метод программы:
   public static void main(String[] args){
      // Объектная переменная абстрактного суперкласса:
      Base3 obj;
      for(int k=1;k<=3;k++){
         // Создание объекта:
         obj=createObject(k);
         // Вызов из объекта метода:
         obj.show();
      }
   }
}