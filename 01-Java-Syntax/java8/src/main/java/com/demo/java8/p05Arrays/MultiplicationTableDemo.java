package com.demo.java8.p05Arrays;

class MultiplicationTableDemo{
   public static void main(String[] args){
      // Размеры массива:
      int rows=9,cols=9;
      // Создание двумерного массива:
      int[][] table=new int[rows][cols];
      // Текстовое значение для отображения в окне вывода:
      String txt="\t|\t";
      for(int i=1;i<=cols;i++){
         txt+=i+"\t";
      }
      txt+="\n";
      for(int i=1;i<=10+8*cols;i++){
         txt+="-";
      }
      // Заполнение массива:
      for(int i=0;i<table.length;i++){
         // Дополнение текстового значения:
         txt+="\n"+(i+1)+"\t|\t";
         for(int j=0;j<table[i].length;j++){
            // Вычисление значения элемента массива:
            table[i][j]=(i+1)*(j+1);
            // Дополнение текстового значения:
            txt+=table[i][j]+"\t";
         }
      }
      // Отображение сообщения в окне вывода:
      System.out.println("Таблица умножения:");
      System.out.println(txt);
   }
}