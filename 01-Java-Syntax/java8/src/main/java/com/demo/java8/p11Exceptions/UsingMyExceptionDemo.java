package com.demo.java8.p11Exceptions;

// Класс контролируемого исключения создается
// наследованием класса Exception:
class MyException extends Exception{
   // Закрытое числовое поле:
   private int code;
   // Конструктор:
   MyException(int n){
      super();
      code=n;
   }
   // Переопределение метода toString():
   public String toString(){
      String txt="Исключение класса MyException\n";
      txt+="Код ошибки: "+code+"\n";
      txt+="------------------------------";
      return txt;
   }
}
// Класс неконтролируемого исключения создается
// наследованием класса RuntimeException:
class MyMistake extends RuntimeException{
   // Закрытое числовое поле:
   private int code;
   // Конструктор:
   MyMistake(int n){
      super();
      code=n;
   }
   // Переопределение метода toString():
   public String toString(){
      String txt="Исключение класса MyMistake\n";
      txt+="Код ошибки: "+code+"\n";
      txt+="******************************";
      return txt;
   }
}
// Главный класс:
class UsingMyExceptionDemo{
   // Статический метод выбрасывает контролируемое
   // исключение класса MyException:
   static void alpha(int n) throws MyException{
      throw new MyException(n);
   }
   // Статический метод выбрасывает неконтролируемое
   // исключение класса MyMistake:
   static void bravo(int n){
      throw new MyMistake(n);
   }
   // Главный метод:
   public static void main(String[] args){
      // Контролируемый код (внешний блок):
      try{
         // Контролируемый код (внутренний блок):
         try{
            // Метод выбрасывает исключение MyException:
            alpha(123);
         }
         // Обработка исключения класса MyException:
         catch(MyException e){
            System.out.println(e);
            bravo(321);
         }
      }
      // Обработка исключения класса MyMistake:
      catch(MyMistake e){
         System.out.println(e);
      }
   }
}