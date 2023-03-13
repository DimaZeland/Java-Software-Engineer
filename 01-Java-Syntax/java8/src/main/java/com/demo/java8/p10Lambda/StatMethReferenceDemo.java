package com.demo.java8.p10Lambda;

// Класс со статическими методами:
class MyClass5{
   // Методом отображается сообщение:
   static void show(){
      System.out.println("Метод класса MyClass5");
   }
   // Методом вычисляется сумма чисел:
   static int sum(int n){
      int k,s=0;
      for(k=1;k<=n;k++){
         s+=k;
      }
      return s;
   }
}
// Первый интерфейс:
interface MyShow{
   void myshow();
}
// Второй интерфейс:
interface MySum{
   int mysum(int n);
}
// Третий интерфейс:
interface MyPrinter{
   void myprint(Object t);
}
// Главный класс:
class StatMethReferenceDemo{
   // Главный метод:
   public static void main(String[] args){
      // Использование ссылок на статические методы:
      MyShow A=MyClass5::show;
      MySum B=MyClass5::sum;
      MyPrinter P=System.out::println;
      // Вызов методов из интерфейсных переменных:
      A.myshow();
      P.myprint("Сумма чисел: "+B.mysum(10));
   }
}