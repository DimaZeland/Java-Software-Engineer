package com.demo.java8.p05Arrays;

class AssigningArraysDemo{
   // Статический метод для отображения
   // содержимого массива (аргумент метода):
   static void show(int[] nums){
      // Оператор цикла по коллекции:
      for(int s: nums){
         // Отображение значения элемента массива:
         System.out.print("| "+s+" ");
      }
      System.out.println("|");
   }
   // Главный метод программы:
   public static void main(String[] args){
      // Первый массив:
      int[] odd={1,3,5,7,9};
      // Второй массив:
      int[] even={2,4,8,10,12,14,16};
      System.out.println("Массив odd:");
      // Отображение содержимого первого массива:
      show(odd);
      System.out.println("Массив even:");
      // Отображение содержимого второго массива:
      show(even);
      System.out.println("Выполняется присваивание.");
      // Присваивание массивов:
      even=odd;
      // Изменение значения элемента массива:
      even[0]=-1;
      System.out.println("Массив odd:");
      // Отображение содержимого первого массива:
      show(odd);
      System.out.println("Массив even:");
      // Отображение содержимого второго массива:
      show(even);
   }
}