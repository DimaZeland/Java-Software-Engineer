package com.demo.java8.p2BasicTypes;

import javax.swing.JOptionPane;
class UsingVariablesDemo{
   public static void main(String[] args){
      // Целочисленная переменная:
      int number=123;
      // Действительная переменная:
      double x=32.1;
      // Символьная переменная:
      char symb='A';
      // Логическая переменная:
      boolean state=true;
      // Текстовая переменная для формирования
      // содержания сообщения:
      String text="Используемые переменные:\n";
      // Дописывается значение целочисленной переменной:
      text=text+"Целое число: "+number+"\n";
      // Дописывается значение числовой переменной:
      text=text+"Действительное число: "+x+"\n";
      // Дописывается значение символьной переменной:
      text=text+"Символ: "+symb+"\n";
      // Дописывается значение логической переменной:
      text=text+"Логическое значение: "+state;
      // Отображение сообщения:
      JOptionPane.showMessageDialog(null,text);
   }
}