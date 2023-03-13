package com.demo.java8.p03Classes;

import javax.swing.JOptionPane;
// Описание класса:
class MyClass3{
   // Поля класса:
   int number;
   char symbol;
   // Метод для присваивания значений полям:
   void set(int n,char s){
      number=n;
      symbol=s;
   }
   // Методом возвращается текстовая строка
   // с описанием объекта:
   String getInfo(){
      // Текст, который возвращается
      // результатом метода:
      String text="Число:  "+number+"\n";
      text+="Символ:  "+symbol;
      // Результат метода:
      return text;
   }
}
// Описание класса с главным методом программы:
class UsingObjectWithMethodsDemo{
   // Главный метод программы:
   public static void main(String[] args){
      // Создание первого объекта:
      MyClass3 objA=new MyClass3();
      // Создание второго объекта:
      MyClass3 objB=new MyClass3();
      // Присваивание значений полям первого объекта:
      objA.set(100,'A');
      // Присваивание значений полям второго объекта:
      objB.set(200,'B');
      // Отображение первого диалогового окна:
      JOptionPane.showMessageDialog(null,
         objA.getInfo(),  // Отображаемый текст
         "Первый объект", // Заголовок окна
         JOptionPane.INFORMATION_MESSAGE); // Тип окна
      // Отображение второго диалогового окна:
      JOptionPane.showMessageDialog(null,
         objB.getInfo(),  // Отображаемый текст
         "Второй объект", // Заголовок окна
         JOptionPane.INFORMATION_MESSAGE); // Тип окна
   }
}