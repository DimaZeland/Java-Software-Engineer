package com.demo.java8.p07AbstractClasses;

// Интерфейс:
interface Base2{
   // Объявление метода:
   void show();
}
// Класс реализует интерфейс Base:
class Alpha2 implements Base2{
   // Текстовое поле:
   String word;
   // Конструктор:
   Alpha2(String txt){
      word=txt;
   }
   // Описание метода из интерфейса:
   public void show(){
      System.out.println("Объект класса Alpha");
      System.out.println("Текстовое поле: "+word);
   }
}
// Класс реализует интерфейс Base:
class Bravo2 implements Base2{
   // Целочисленное поле:
   int number;
   // Конструктор:
   Bravo2(int n){
      number=n;
   }
   // Описание метода из интерфейса:
   public void show(){
      System.out.println("Объект класса Bravo");
      System.out.println("Целочисленное поле: "+number);
   }
}
// Главный класс:
class UsingInterfaceVarsDemo{
   public static void main(String[] args){
      // Интерфейсная переменная:
      Base2 ref;
      // Объект класса Alpha:
      ref=new Alpha2("текст");
      ref.show();
      // Объект класса Bravo:
      ref=new Bravo2(123);
      ref.show();
   }
}