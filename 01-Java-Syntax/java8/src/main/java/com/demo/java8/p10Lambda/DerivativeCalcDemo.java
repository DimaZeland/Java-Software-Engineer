package com.demo.java8.p10Lambda;
// Функциональный интерфейс:
interface MyFunction{
   // Метод с аргументом типа double возвращает
   // результатом значение типа double:
   double f(double x);
}
// Главный класс:
class DerivativeCalcDemo{
   // Статический метод для вычисления производной:
   static MyFunction Derivative(MyFunction ref){
      // Приращение по аргументу для вычисления
      // производной в точке:
      double dx=1e-5;
      // Результат метода - лямбда-выражения:
      return (double x)->{return (ref.f(x+dx)-ref.f(x))/dx;};
   }
   // Главный метод:
   public static void main(String[] args){
      // Производная для первой функции:
      MyFunction A=Derivative((double x)->{return x*(3-x);});
      // Производная для второй функции:
      MyFunction B=Derivative((double x)->{return x*Math.exp(-x);});
      // Проверка результатов вычислений:
      System.out.println("Производная для первой функции");
      System.out.println("Вычислено:\tТочно:");
      for(double t=0;t<=5;t++){
         System.out.printf("%8.5f\t%8.5f\n",A.f(t),(3-2*t));
      }
      System.out.println("Производная для второй функции");
      System.out.println("Вычислено:\tТочно:");
      for(double t=0;t<=5;t++){
         System.out.printf("%8.5f\t%8.5f\n",B.f(t),Math.exp(-t)*(1-t));
      }
   }
}