package com.demo.java8.p01SimpleExample;
// Импорт класса JOptionPane:
import javax.swing.JOptionPane;
// Описание класса:
class InputDialogDemo{
   // Главный метод:
   public static void main(String[] args){
      // Переменная для записи текста:
      String text;
      // Отображения диалогового окна с полем вода:
      text=JOptionPane.showInputDialog("Введите текст:");
      // Отображение диалогового окна с сообщением:
      JOptionPane.showMessageDialog(null,"Вы ввели такой текст:\n"+text);
   }
}