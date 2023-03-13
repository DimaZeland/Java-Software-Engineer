package com.demo.java8.p08UsingObjects;


// Интерфейс:
interface Base2{
   // Метод с кодом по умолчанию:
   default void show(){
      System.out.println("Интерфейс Base2");
   }
   // Объявление метода:
   void hello();
}
// Главный класс:
class MoreAnonymousClassDemo{
   public static void main(String[] args){
      // Создание объекта анонимного класса:
      Base2 obj=new Base2(){
         // Описание метода из интерфейса:
         public void hello(){
            System.out.println("Объект анонимного класса");
         }
      }; // Завершение инструкции создания объекта
         // анонимного класса
      // Вызов методов из объекта, созданного на основе
      // анонимного класса:
      obj.show();
      obj.hello();
      // Создание анонимного объекта анонимного класса
      // и вызов их этого объекта метода showAll(),
      // описанного в анонимном классе:
      new Base2(){
         // Описание метода из интерфейса:
         public void hello(){
            System.out.println("Анонимный объект");
         }
         // Описание нового метода:
         void showAll(){
            hello();
            show();
         }
      }.showAll(); // Вызов метода
   }
}