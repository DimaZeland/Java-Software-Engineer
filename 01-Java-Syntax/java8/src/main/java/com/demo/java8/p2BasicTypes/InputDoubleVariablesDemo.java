package com.demo.java8.p2BasicTypes;

import javax.swing.JOptionPane;
class InputDoubleVariablesDemo{
   public static void main(String[] args){
      // Числовые переменные:
      double mass,height,bmi;
      // Переменная для записи значения в поле ввода:
      String result;
      // Считывание значения из поля ввода:
      result=JOptionPane.showInputDialog("Ваш рост в метрах:");
      // Преобразование текста в число:
      height=Double.parseDouble(result);
      // Считывание значения из поля ввода:
      result=JOptionPane.showInputDialog("Ваш вес в килограммах:");
      // Преобразование текста в число:
      mass=Double.parseDouble(result);
      // Вычисление индекса массы тела:
      bmi=mass/height/height;
      // Округление полученного значения:
      bmi=Math.round(bmi*100)/100.0;
      // Отображение окна с сообщением:
      JOptionPane.showMessageDialog(null,"Индекс массы тела: "+bmi);
   }
}