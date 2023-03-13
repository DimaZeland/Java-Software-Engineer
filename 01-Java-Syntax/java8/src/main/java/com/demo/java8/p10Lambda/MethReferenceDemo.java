package com.demo.java8.p10Lambda;
// Класс с полем и методами:
class MyClass2{
   private int number;
   MyClass2(int n){
      number=n;
   }
   void set(int n){
      number=n;
   }
   int get(){
      return number;
   }
}
// Первый функциональный интерфейс:
interface MyGetter{
   int myget(MyClass2 obj);
}
// Второй функциональный интерфейс:
interface MySetter{
   void myset(MyClass2 obj,int n);
}
// Главный класс:
class MethReferenceDemo{
   public static void main(String[] args){
      // Создается объект:
      MyClass2 obj=new MyClass2(100);
      System.out.println("Создан объект с полем 100");
      // Используем ссылки на методы:
      MyGetter A=MyClass2::get;
      MySetter B=MyClass2::set;
      System.out.println("Переменная A: "+A.myget(obj));
      System.out.println("Переменная obj: "+obj.get());
      obj.set(200);
      System.out.println("Полю присвоено значение 200");
      System.out.println("Переменная A: "+A.myget(obj));
      B.myset(obj,300);
      System.out.println("Выполнена команда B.myset(obj,300)");
      System.out.println("Переменная A: "+A.myget(obj));
      System.out.println("Переменная obj: "+obj.get());
      // Создается новый объект:
      obj=new MyClass2(400);
      System.out.println("Создан объект с полем 400");
      System.out.println("Переменная A: "+A.myget(obj));
      System.out.println("Переменная obj: "+obj.get());
      B.myset(obj,500);
      System.out.println("Выполнена команда B.myset(obj,500)");
      System.out.println("Переменная A: "+A.myget(obj));
      System.out.println("Переменная obj: "+obj.get());
   }
}