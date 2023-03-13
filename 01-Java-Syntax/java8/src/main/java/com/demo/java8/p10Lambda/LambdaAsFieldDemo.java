package com.demo.java8.p10Lambda;
// Функциональный интерфейс:
interface MyInterface1{
   // Метод с целочисленным аргументом возвращает
   // целочисленный результат:
   int getNumber(int n);
}
// Класс с полем интерфейсного типа:
class MyClass1{
   // Закрытое поле интерфейсного типа:
   private MyInterface1 ref;
   // Конструктор:
   MyClass1(MyInterface1 mi){
      set(mi);
   }
   // Метод для присваивания значения полю:
   void set(MyInterface1 mi){
      ref=mi;
   }
   // Метод с целочисленным аргументом возвращает
   // результатом целое число:
   int get(int n){
      // Вызов метода из объекта, на которое ссылается
      // поле интерфейсного типа:
      return ref.getNumber(n);
   }
}
// Главный класс:
class LambdaAsFieldDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объекта класса с передачей аргументом
      // конструктору лямбда-выражения:
      MyClass1 obj=new MyClass1((int n)->{return n*n;});
      // Проверка результата:
      System.out.println("Аргумент:");
      for(int k=0;k<=5;k++){
         System.out.print(k+"\t");
      }
      System.out.println("\nАргумент в квадрате:");
      for(int k=0;k<=5;k++){
         System.out.print(obj.get(k)+"\t");
      }
      // Полю объекта присваивается новое значение:
      obj.set((int n)->{return n*n*n;});
      // Проверка результата:
      System.out.println("\nАргумент в кубе:");
      for(int k=0;k<=5;k++){
         System.out.print(obj.get(k)+"\t");
      }
      System.out.println("");
   }
}