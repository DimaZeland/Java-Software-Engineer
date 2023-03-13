package com.demo.java8.p1SimpleExample;
// Импортируется класс JOptionPane:
import javax.swing.JOptionPane;
// Описание класса ShowMeNewWindowDemo:
class ShowMeNewWindowDemo{
   // Описание главного метода программы:
   public static void main(String[] args){
      // Текст для названия окна:
      String title="Сообщение";
      // Текст сообщения:
      String text="Продолжаем изучать Java";
      // Отображение диалогового окна с сообщением:
      JOptionPane.showMessageDialog(null,text,title,JOptionPane.WARNING_MESSAGE);
   } // Завершение описания метода
}    // Завершение описания класса