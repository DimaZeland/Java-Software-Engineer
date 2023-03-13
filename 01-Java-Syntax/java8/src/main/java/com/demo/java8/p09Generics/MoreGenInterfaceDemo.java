package com.demo.java8.p09Generics;

// Обобщенный интерфейс:
interface MyMethods3<X>{
   X get();
   void set(X arg);
}
// Создание первого класса на основе
// обобщенного интерфейса:
class Alpha3 implements MyMethods3<Integer>{
   // Закрытое поле целочисленного типа:
   private Integer value;
   // Описание методов из интерфейса:
   public Integer get(){
      return value;
   }
   public void set(Integer arg){
      value=arg;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println("Целочисленное поле: "+get());
   }
   // Конструктор:
   Alpha3(Integer arg){
      value=arg;
   }
}
// Создание второго класса на основе
// обобщенного интерфейса:
class Bravo3 implements MyMethods3<Character>{
   // Закрытое поле символьного типа:
   private Character value;
   // Описание методов из интерфейса:
   public Character get(){
      return value;
   }
   public void set(Character arg){
      value=arg;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println("Символьное поле: "+get());
   }
   // Конструктор:
   Bravo3(Character arg){
      value=arg;
   }
}
// Главный класс:
class MoreGenInterfaceDemo{
   // Главный метод:
   public static void main(String[] args){
      // Интерфейсная переменная:
      MyMethods3 ref;
      // Создание объектов:
      Alpha3 A=new Alpha3(123);
      Bravo3 B=new Bravo3('A');
      // Вызов метода из объекта класса:
      A.show();
      // Интерфейсной переменной присваивается значение:
      ref=A;
      // Вызов метода через интерфейсную переменную:
      ref.set(321);
      // Вызов методов из объектов класса:
      A.show();
      B.show();
      // Интерфейсной переменной присваивается значение:
      ref=B;
      // Вызов метода через интерфейсную переменную:
      ref.set('B');
      // Вызов метода из объекта класса:
      B.show();
   }
}