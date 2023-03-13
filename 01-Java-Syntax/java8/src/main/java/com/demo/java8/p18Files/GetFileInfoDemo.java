package com.demo.java8.p18Files;

// Импорт классов:
import java.io.*;
// Главный класс:
class GetFileInfoDemo{
   // Главный метод:
   public static void main(String[] args){
      // Путь к файлу:
      String path="d:\\documents\\MyData.pdf";
      // Отображение пути к файлу:
      System.out.println(path);
      // Создание объекта класса File:
      File F=new File(path);
      // Название файла:
      System.out.println("Имя файла: "+F.getName());
      // Родительская директория:
      System.out.println("Директория: "+F.getParent());
      // Содержимое родительской директории:
      File[] files=F.getParentFile().listFiles();
      System.out.println("Содержимое папки:");
      // Отображение названий файлов и директорий:
      for(int k=0;k<files.length;k++){
         System.out.print("\t"+files[k].getName());
         if(files[k].isFile()){
            System.out.println(" - файл");
         }
         else{
            System.out.println(" - директория");
         }
      }
      System.out.println("Создание новой директории и перемещение файла");
      // Создание объекта для новой директории:
      File D=new File(F.getParentFile(),".\\MyFiles");
      // Создание новой директории:
      D.mkdir();
      // Полный канонический путь к директории:
      try{ // Контролируемый код
         System.out.println("Создана директория "+D.getCanonicalPath());
      } // Обработка исключения:
      catch(IOException e){
         System.out.println("Ошибка: "+e);
      }
      // Перемещение файла:
      F.renameTo(new File(D,"MyCV.pdf"));
      // Проверка существования файла:
      System.out.print("Файл "+F.getAbsolutePath());
      if(F.exists()){ // Если файл существует
         System.out.println(" существует");
      }
      else{ // Если файл не существует
         System.out.println(" не существует");
      }
      // Путь к новой директории:
      System.out.println("В директории "+D.getPath()+" есть файлы:");
      // Массив файлов из новой директории:
      files=D.listFiles();
      // Названия файлов из новой директории:
      for(int k=0;k<files.length;k++){
         System.out.println(files[k].getName());
      }
   }
}