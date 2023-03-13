package com.demo.java8.p18Files;

// Импорт классов:
import java.io.*;
// Главный класс:
class BufferedReaderWriterDemo{
   // Главный метод:
   public static void main(String[] args){
      System.out.println("Начинается копирование файла");
      // Путь к директории:
      String path="d:/documents/";
      // Текстовая переменная для записи
      // считываемых из файла строк:
      String str;
      // Контролируемый код:
      try{
         // Объект буферизированного потока ввода:
         BufferedReader input=new BufferedReader(new FileReader(path+"MyNewText.txt"));
         // Объект буферизированного потока вывода:
         BufferedWriter output=new BufferedWriter(new FileWriter(path+"MyFiles/MyVeryNewText.txt"));
         // Переменная - счетчик строк:
         int k=1;
         // Считывание строк из одного файла
         // и запись в другой файл:
         while((str=input.readLine())!=null){
            // Запись строки в файл:
            output.write("["+k+"] "+str.toLowerCase());
            // Переход к новой строке:
            output.newLine();
            // Новое значение переменной-счетчика:
            k++;
         }
         // Потоки закрываются:
         input.close();
         output.close();
      }
      // Обработка исключений:
      catch(FileNotFoundException e){
         System.out.println("Файл не найден: "+e);
      }
      catch(IOException e){
         System.out.println("Ошибка доступа к файлу: "+e);
      }
      System.out.println("Копирование файла завершено");
   }
}