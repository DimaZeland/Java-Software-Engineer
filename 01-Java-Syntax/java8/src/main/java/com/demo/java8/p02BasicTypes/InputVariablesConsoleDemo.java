package com.demo.java8.p02BasicTypes;

// Импортирование класса Scanner:
import java.util.Scanner;
class InputVariablesConsoleDemo{
   public static void main(String[] args){
      // Создание объекта input класса Scanner:
      Scanner input=new Scanner(System.in);
      // Текущий год:
      int now=2015;
      // Переменная для записи имени пользователя:
      String name;
      // Переменная для записи возраста:
      int age;
      // Переменная для записи значения роста (в метрах):
      double height;
      // Переменная для записи значения массы
      // (в килограммах):
      double mass;
      System.out.print("Ваше имя: ");
      // Считывание имени (текст):
      name=input.nextLine();
      System.out.print("Ваш возраст: ");
      // Считывание возраста (целое число):
      age=input.nextInt();
      System.out.print("Ваш рост (в метрах): ");
      // Считывание роста в метрах
      // (число в формате с плавающей точкой):
      height=input.nextDouble();
      System.out.print("Масса тела (в килограммах): ");
      // Считывание массы в килограммах
      // (число в формате с плавающей точкой):
      mass=input.nextDouble();
      // Вычисление индекса массы тела:
      double bmi=mass/height/height;
      // Отображение имени:
      System.out.println("Здравствуйте, "+name+"!");
      // Вычисление и отображение года рождения:
      System.out.println("Вы родились в "+(now-age)+" году.");
      // Отображение значения индекса массы тела:
      System.out.printf("Ваш индекс массы тела: %5.2f\n",bmi);
   }
}