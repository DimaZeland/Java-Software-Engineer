package com.demo.java8.p18Files;

// Статический импорт:
import static javax.swing.JOptionPane.*;
// Нестатический импорт:
import javax.swing.*;
import java.io.*;
// Главный класс:
public class FileChooserDemo{
   // Главный метод (выбрасывает контролируемое
   // исключение класса IOException):
   public static void main(String[] args) throws IOException{
      // Отображение окна подтверждения:
      int res=showConfirmDialog(null,
         "Готовы выбрать файл?", // Текст в окне
         "Работа с файлами", // Название окна
         YES_NO_OPTION, // Количество и тип кнопок
         QUESTION_MESSAGE // Тип пиктограммы
      );
      // Если не нажата кнопка подтверждения:
      if(res!=YES_OPTION){
         // Завершение выполнения программы:
         System.exit(0);
      }
      // Создание объекта класса JFileChooser:
      JFileChooser fch=new JFileChooser();
      // Отображение окна для выбора файла:
      res=fch.showOpenDialog(null);
      // Если не подтвержден выбор файла:
      if(res!=JFileChooser.APPROVE_OPTION){
         // Завершение выполнения программы:
         System.exit(0);
      }
      // Объект класса File, определяющий
      // файл, выбранный в окне выбора файлов:
      File F=fch.getSelectedFile();
      // Формирование текста для отображения в сообщении:
      String txt="Вы выбрали файл\n";
      txt+=F.getAbsolutePath(); // Путь к файлу
      txt+="\nХотите создать копию?";
      // Отображение окна подтверждения:
      res=showConfirmDialog(null,
         txt, // Текст сообщения
         "Файл выбран", // Название окна
         YES_NO_OPTION, // Количество и тип кнопок
         QUESTION_MESSAGE // Тип пиктограммы
      );
      // Если не нажата кнопка подтверждения:
      if(res!=YES_OPTION){
         // Завершение выполнения программы:
         System.exit(0);
      }
      // Отображение окна для сохранения файла:
      res=fch.showSaveDialog(null);
      // Если выбор не подтвержден:
      if(res!=JFileChooser.APPROVE_OPTION){
         // Завершение выполнения программы:
         System.exit(0);
      }
      // Создание объекта для байтового потока ввода
      // на основе копируемого файла:
      FileInputStream input=new FileInputStream(F);
      // Объекта класса File, определяющий файл,
      // в который выполняется копирование:
      F=fch.getSelectedFile();
      // Создание объекта для потока вывода на основе
      // файла, в который выполняется копирование:
      FileOutputStream output=new FileOutputStream(F);
      // Побайтовое копирование:
      while((res=input.read())!=-1){
         output.write(res);
      }
      // Закрываются потоки:
      input.close();
      output.close();
      // Отображение окна с сообщением о создании
      // копии файла:
      showMessageDialog(null,
         // Текст сообщения в окне:
         "Копия сохранена как\n"+F.getAbsolutePath(),
         // Название окна:
         "Создана копия файла",
         // Тип пиктограммы:
         INFORMATION_MESSAGE
      );
   }
}