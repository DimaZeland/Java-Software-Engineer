package com.demo.java8.p12Multithreading;
// Подкласс класса Thread:
class MyThread1 extends Thread{
   // Переопределение метода run():
   public void run(){
      for(int i=1;i<=5;i++){
         System.out.println("Дочерний поток:\t"+i);
         try{
            Thread.sleep(4500);
         }
         catch(InterruptedException e){
            System.out.println("Прерывание дочернего потока");
         }
      }
   }
}
// Главный класс:
class ExtendingThreadDemo{
   public static void main(String[] args) throws InterruptedException{
      System.out.println("Начинается выполнение программы");
      // Создание объекта класса MyThread1:
      MyThread1 t=new MyThread1();
      System.out.println("Запускается дочерний поток");
      // Запуск дочернего потока:
      t.start();
      for(int k=0;k<=5;k++){
         System.out.println("Главный поток:\t"+(char)('A'+k));
         Thread.sleep(2000);
      }
      if(t.isAlive()){
         t.join();
      }
      System.out.println("Выполнение программы завершено");
   }
}