package com.demo.java8.p18Files;

// Импорт классов:
import java.io.*;
// Главный класс:
class FileReaderWriterDemo{
   // Главный метод:
   public static void main(String[] args){
      System.out.println("Начинается копирование файла");
      // Путь к директории:
      String path="d:/documents/";
      // Переменная для записи кодов считываемых символов:
      int sm;
      // Контролируемый код:
      try{
         // Объект файлового потока ввода:
         FileReader input=new FileReader(path+"MyFiles/MyText.txt");
         // Объект файлового потока вывода:
         FileWriter output=new FileWriter(path+"MyNewText.txt");
         // Считывание кода символа из файла:
         sm=input.read();
         // Считывание символов из одного файла
         // и запись в другой файл:
         while(sm!=-1){ // Пока не достигнут конец файла
            // Запись символа в файл:
            output.write(Character.toUpperCase((char)sm));
            // Считывание кода символа из файла:
            sm=input.read();
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