package com.demo.java8.p9Generics;

// Обобщенный класс с одним параметром:
class Alpha5<X>{
   // Закрытое поле обобщенного типа:
   private X first;
   // Конструктор с аргументом обобщенного типа:
   Alpha5(X first){
      // Вызов метода с аргументом обобщенного типа:
      set(first);
   }
   // Метод с аргументом обобщенного типа
   // для присваивания значения полю:
   void set(X first){
      this.first=first;
   }
   // Метод возвращает результатом значение поля:
   X get(){
      return first;
   }
}
// Обобщенный класс с двумя параметрами:
class Bravo5<X,Y>{
   // Поле - объект обобщенного класса:
   Alpha5<X> obj;
   // Поле обобщенного типа:
   Y second;
   // Конструктор с двумя аргументами обобщенного типа:
   Bravo5(X first,Y second){
      // Создание объекта на основе обобщенного класса:
      obj=new Alpha5<X>(first);
      // Присваивание значения полю:
      this.second=second;
   }
   // Метод для отображения значений полей:
   void show(){
      System.out.println("Значения "+obj.get()+" и "+second);
   }
}
// Главный класс:
class UsingGenericsDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объекта на основе обобщенного класса:
      Bravo5<Integer,Character> A=new Bravo5<Integer,Character>(100,'A');
      // Отображение значений полей объекта:
      A.show();
      // Создание объекта на основе обобщенного класса:
      Bravo5<String,Double> B=new Bravo5<>("Bravo5",12.345);
      // Отображение значений полей объекта:
      B.show();
   }
}