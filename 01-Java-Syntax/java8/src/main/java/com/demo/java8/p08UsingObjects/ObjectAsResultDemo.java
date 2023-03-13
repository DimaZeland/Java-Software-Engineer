package com.demo.java8.p08UsingObjects;


// Класс:
class MyClass3{
   // Закрытые поля:
   private int code;
   private String name;
   // Конструктор:
   MyClass3(int n,String s){
      System.out.println("Создание объекта:");
      // Присваивание значений полям и
      // отображение этих значений:
      set(n,s).show();
   }
   // Метод для присваивания значения целочисленному полю,
   // возвращающий результатом ссылку на объект:
   MyClass3 set(int n){
      // Присваивание значения целочисленному полю:
      code=n;
      // Результат метода:
      return this;
   }
   // Метод для присваивания значения текстовому полю,
   // возвращающий результатом ссылку на объект:
   MyClass3 set(String s){
      // Присваивание значения текстовому полю:
      name=s;
      // Результат метода:
      return this;
   }
   // Метод для присваивания значений полям,
   // возвращающий результатом ссылку на объект:
   MyClass3 set(int n,String s){
      // Присваивание значений полям и результат метода:
      return set(n).set(s);
   }
   // Метод для отображения значений полей:
   void show(){
      System.out.println("Поле code="+code);
      System.out.println("Поле name="+name);
      System.out.println("-----------------");
   }
}
// Главный класс:
class ObjectAsResultDemo{
   // Статический метод для создания объекта:
   static MyClass3 createObject(int n,String s){
      // Результат метода:
      return new MyClass3(n,s);
   }
   // Главный метод программы:
   public static void main(String[] args){
      // Создание объекта:
      MyClass3 obj=createObject(100,"alpha");
      // Изменение значения целочисленного поля и 
      // отображение значений полей объекта:
      obj.set(200).show();
      // Изменение значения текстового поля и 
      // отображение значений полей объекта:
      obj.set("bravo").show();
      // Отображение значений полей:
      obj.show();
      // Создание объекта, изменение значений его полей
      // и вызов метода для отображения значений полей:
      createObject(300,"charlie").set(400,"delta").show();
   }
}