package com.demo.java8.p05Arrays;

import javax.swing.JOptionPane;
class UsingArrayDemo{
   public static void main(String[] args){
      // Текстовые переменные для записи значения в поле
      // ввода и названия для диалоговых окон:
      String input,title="Биномиальные коэффициенты";
      // Отображение окна с полем ввода:
      input=JOptionPane.showInputDialog(null,
         // Надпись над полем ввода:
         "Укажите значение нижнего индекса",
         // Название окна:
         title,
         // Тип пиктограммы:
         JOptionPane.QUESTION_MESSAGE
      );
      // Если пользователь отменил ввод:
      if(input==null){
         // Завершение выполнения программы:
         System.exit(0);
      }
      // Переменная для записи значения нижнего индекса:
      int n;
      // Определение числового значения на основе текста:
      n=Integer.parseInt(input);
      // Проверка корректности числового значения:
      if(n<0){ // Если введено некорректное значение
         // Отображение диалогового окна:
         JOptionPane.showMessageDialog(null,
            // Текст сообщения:
            "Указан неверный параметр!",
            // Название окна:
            title,
            // Тип пиктограммы:
            JOptionPane.ERROR_MESSAGE
         );
         // Завершение выполнения программы:
         System.exit(0);
      }
      // Создание массива:
      int[] binoms=new int[n+1];
      // Значение первого элемента массива:
      binoms[0]=1;
      // Текст для отображения в диалоговом окне:
      String txt="Содержимое массива:\n| "+binoms[0]+" |";
      // Вычисление значений элементов массива:
      for(int m=1;m<binoms.length;m++){
         // Значение элемента:
         binoms[m]=binoms[m-1]*(n-m+1)/m;
         // В текст дописывается значение элемента:
         txt+=" "+binoms[m]+" |";
      }
      // Отображение диалогового окна:
      JOptionPane.showMessageDialog(null,
         // Текст сообщения:
         txt,
         // Название окна:
         title,
         // Тип пиктограммы:
         JOptionPane.INFORMATION_MESSAGE
      );
   }
}