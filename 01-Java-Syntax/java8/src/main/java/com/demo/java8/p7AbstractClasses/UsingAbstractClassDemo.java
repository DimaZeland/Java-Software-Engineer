package com.demo.java8.p7AbstractClasses;
// Абстрактный суперкласс:
abstract class ColoredFigure{
   // Текстовое поле (цвет):
   String color;
   // Целочисленное поле (размер):
   int size;
   // Конструктор:
   ColoredFigure(String clr,int s){
      // Присваивание значений полям:
      color=clr;
      size=s;
   }
   // Метод для отображения информации об объекте:
   void show(){
      // Цвет и название фигуры:
      System.out.println("Фигура: "+color+" "+getName());
      // Характерный размер:
      System.out.println("Характерный размер ("+getSizeName()+"): "+size);
      // Площадь:
      System.out.printf("Площадь: %.3f\n",getArea());
      // Импровизированная "линия" из "звездочек":
      String line="";
      for(int k=1;k<=30;k++){
         line+="*";
      }
      System.out.println(line);
   }
   // Метод результатом возвращает название для
   // параметра, определяющего характерный размер фигуры:
   String getSizeName(){
      return "сторона";
   }
   // Абстрактные методы:
   abstract String getName(); // Название фигуры
   abstract double getArea(); // Площадь фигуры
}
// Подкласс (фигура - треугольник):
class Triangle extends ColoredFigure{
   // Конструктор:
   Triangle(String clr,int s){
      // Вызов конструктора суперкласса:
      super(clr,s);
   }
   // Описание абстрактного метода из суперкласса,
   // возвращающего результатом название фигуры:
   String getName(){
      return "треугольник";
   }
   // Описание абстрактного метода из суперкласса,
   // возвращающего результатом площадь фигуры:
   double getArea(){
      double k=Math.sqrt(3)/4;
      return size*size*k;
   }
}
// Подкласс (фигура - квадрат):
class Square extends ColoredFigure{
    // Конструктор:
    Square(String clr,int s){
      // Вызов конструктора суперкласса:
      super(clr,s);
   }
   // Описание абстрактного метода из суперкласса,
   // возвращающего результатом название фигуры:
   String getName(){
      return "квадрат";
   }
   // Описание абстрактного метода из суперкласса,
   // возвращающего результатом площадь фигуры:
   double getArea(){
      double k=1;
      return size*size*k;
   }
}
// Подкласс (фигура - круг):
class Circle extends ColoredFigure{
   // Конструктор:
   Circle(String clr,int s){
   // Вызов конструктора суперкласса:
      super(clr,s);
   }
   // Описание абстрактного метода из суперкласса,
   // возвращающего результатом название фигуры:
   String getName(){
      return "круг";
   }
   // Описание абстрактного метода из суперкласса,
   // возвращающего результатом площадь фигуры:
   double getArea(){
      double k=Math.PI;
      return size*size*k;
   }
   // Переопределение метода, возвращающего результатом
   // название для параметра, определяющего характерный
   // размер фигуры:
   String getSizeName(){
      return "радиус";
   }
}
// Главный класс:
class UsingAbstractClassDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объектов:
      Triangle T=new Triangle("красный",2); // Треугольник
      Square S=new Square("черный",3);      // Квадрат
      Circle C=new Circle("желтый",1);      // Круг
      // Отображение информации об объектах через
      // объектные переменные подклассов:
      System.out.println("Использование объектных переменных подкласса");
      T.show();
      S.show();
      C.show();
      // Объектная переменная абстрактного суперкласса:
      ColoredFigure F;
      // Отображение информации об объектах через
      // объектную переменную абстрактного суперкласса:
      System.out.println("Использование объектной переменной абстрактного суперкласса");
      F=T;      // Треугольник
      F.show();
      F=S;      // Квадрат
      F.show();
      F=C;      // Круг
      F.show();
   }
}