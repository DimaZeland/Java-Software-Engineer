package com.demo.java8.p10Lambda;
// Интерфейс:
interface MyNums{
   default void show(int n){
      System.out.println("Аргумент: "+n);
      System.out.println("Результат: "+get(n));
   }
   int get(int n);
}
class UsingAnonymousClassDemo{
   public static void main(String[] args){
      // Присваивание интерфейсной переменной ссылки
      // на объект анонимного класса:
      MyNums A=new MyNums(){
         // Описание метода из интерфейса:
         public int get(int n){
            int k,s=0;
            for(k=1;k<=n;k++){
               s+=k;
            }
            return s;
         }
      };
      System.out.println("Используем анонимный класс:");
      A.show(10);
      System.out.println("Проверка: "+A.get(10));
      MyNums B=A;
      System.out.println("Новый анонимный класс:");
      // Переменой значением присваивается ссылка
      // на объект нового анонимного класса:
      A=new MyNums(){
         // Описание метода из интерфейса:
         public int get(int n){
            return n*n;
         }
      };
      System.out.println("Вызов метода show() из A:");
      A.show(10);
      System.out.println("Вызов метода show() из B:");
      B.show(10);
   }
}