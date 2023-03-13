package com.demo.java8.p06Inheritance;

// Суперкласс:
class Alpha6{
   // Закрытое поле:
   private int code;
   // Открытый метод для присваивания значения
   // закрытому полю:
   public void set(int code){
      this.code=code;
   }
   // Открытый метод для отображения значения
   // закрытого поля:
   public void show(){
      System.out.println("Поле code: "+code);
   }
   // Конструктор класса:
   Alpha6(int code){
      set(code);
   }
}
// Подкласс:
class Bravo6 extends Alpha6{
   // Конструктор подкласса:
   Bravo6(int code){
      // Вызов конструктора суперкласса:
      super(code);
   }
}
// Класс с главным методом программы:
class UsingPrivatesDemo{
   public static void main(String[] args){
      // Создание объекта подкласса:
      Bravo6 obj=new Bravo6(100);
      // Проверка значения поля:
      obj.show();
      // Присваивание значения полю:
      obj.set(200);
      // Отображение значения поля:
      obj.show();
   }
}