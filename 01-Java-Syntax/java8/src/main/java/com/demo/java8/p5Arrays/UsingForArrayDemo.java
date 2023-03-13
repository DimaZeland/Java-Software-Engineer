package com.demo.java8.p5Arrays;

// Импорт классов:
import javax.swing.JOptionPane;
import java.util.Random;
// Класс с главным методом программы:
class UsingForArrayDemo{
   // Главный метод программы:
   public static void main(String[] args){
      // Размер массива:
      int size=10;
      // Объект для генерирования случайных чисел:
      Random rnd=new Random();
      // Создание массива:
      int[] nums=new int[size];
      // Текст для отображения в диалоговом окне:
      String txt="Массив случайных чисел:\n| ";
      // Заполнение массива случайными числами:
      for(int k=0;k<nums.length;k++){
         // Присваивание значением элементу
         // случайного числа:
         nums[k]=rnd.nextInt(10)+1;
         // Добавление к тексту значения элемента:
         txt+=nums[k]+" | ";
      }
      // Дополнение текстового значения:
      txt+="\nПроверка:\n| ";
      // Отображение элементов с помощью
      // оператора цикла по коллекции:
      for(int s: nums){
         // Добавление в текст значения элемента:
         txt+=s+" | ";
      }
      // Отображение диалогового окна:
      JOptionPane.showMessageDialog(null,
         txt, // Текст сообщения в окне
         "Случайные числа", // Название окна
         JOptionPane.PLAIN_MESSAGE // Тип окна
      );
   }
}