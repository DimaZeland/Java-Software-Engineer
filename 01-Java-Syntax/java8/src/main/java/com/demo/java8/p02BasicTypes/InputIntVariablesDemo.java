package com.demo.java8.p02BasicTypes;

import javax.swing.JOptionPane;
class InputIntVariablesDemo{
   public static void main(String[] args){
      // Целочисленные переменные:
      int age,year,birth;
      // Переменная для записи значения в поле ввода:
      String result;
      // Считывание значения из поля ввода:
      result=JOptionPane.showInputDialog("Какой сейчас год?");
      // Преобразование текста в целое число:
      year=Integer.parseInt(result);
      // Считывание значения из поля ввода:
      result=JOptionPane.showInputDialog("Сколько Вам лет?");
      // Преобразование текста в целое число:
      age=Integer.parseInt(result);
      // Вычисление года рождения:
      birth=year-age;
      // Отображение окна с сообщением:
      JOptionPane.showMessageDialog(null,"Вы родились в "+birth+" году!");
   }
}