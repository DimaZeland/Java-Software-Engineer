package com.demo.java8.p06Inheritance;

// Суперкласс:
class Alpha4{
   // Текстовое поле:
   String name;
   // Целочисленное поле:
   int code;
   // Конструктор с тремя аргументами:
   Alpha4(String name,int code){
      this.name=name;
      this.code=code;
      System.out.println("Класс Alpha4:");
      System.out.println("Поле name - "+this.name);
      System.out.println("Поле code - "+this.code);
   }
   // Конструктор с одним текстовым аргументом:
   Alpha4(String name){
      // Вызов конструктора с двумя аргументами:
      this(name,0);
   }
   // Конструктор с одним целочисленным аргументом:
   Alpha4(int code){
      // Вызов конструктора с двумя аргументами:
      this("Белый",code);
   }
   // Конструктор без аргументов:
   Alpha4(){
      this("Желтый",1);
   }
}
// Подкласс:
class Bravo4 extends Alpha4{
   // Символьное поле:
   char symbol;
   // Закрытый метод для отображения значения
   // символьного поля:
   private void show(){
      System.out.println("Класс Bravo4:");
      // Отображение значения символьного поля:
      System.out.println("Поле symbol - "+this.symbol);
      // Отображение "горизонтальной линии":
      for(int k=1;k<=18;k++){
         System.out.print("-");
      }
      System.out.println("");
   }
   // Конструктор с тремя аргументами:
   Bravo4(String name,int code,char symbol){
      // Вызов конструктора суперкласса
      // с двумя аргументами:
      super(name,code);
      // Присваивание символьному полю значения:
      this.symbol=symbol;
      // Вызов закрытого метода:
      show();
   }
   // Конструктор с одним символьным аргументом:
   Bravo4(char symbol){
      // Вызов конструктора суперкласса без аргументов:
      super();
      // Присваивание символьному полю значения:
      this.symbol=symbol;
      // Вызов закрытого метода:
      show();
   }
   // Конструктор с одним текстовым аргументом:
   Bravo4(String name){
      // Вызов конструктора суперкласса
      // с одним текстовым аргументом:
      super(name);
      // Присваивание символьному полю значения:
      this.symbol='A';
      // Вызов закрытого метода:
      show();
   }
   // Конструктор с одним целочисленным аргументом:
   Bravo4(int code){
      // Вызов конструктора суперкласса
      // с одним целочисленным аргументом:
      super(code);
      // Присваивание символьному полю значения:
      this.symbol='B';
      // Вызов закрытого метода:
      show();
   }
   // Конструктор без аргументов:
   Bravo4(){
      // Сначала неявно вызывается конструктор
      // суперкласса без аргументов.
      // Присваивание значения символьному полю:
      this.symbol='C';
      // Вызов закрытого метода:
      show();
   }
   // Конструктор с двумя аргументами:
   Bravo4(String name,int code){
      // Вызов конструктора подкласса с тремя аргументами:
      this(name,code,'D');
   }
}
// Класс с главным методом программы:
class SubclassConstructorDemo{
   public static void main(String[] args){
      // Объектная переменная подкласса:
      Bravo4 obj;
      // Розные способы создания объекта подкласса:
      obj=new Bravo4();
      obj=new Bravo4("Красный");
      obj=new Bravo4(100);
      obj=new Bravo4("Зеленый",200);
      obj=new Bravo4('Y');
      obj=new Bravo4("Синий",300,'Z');
   }
}