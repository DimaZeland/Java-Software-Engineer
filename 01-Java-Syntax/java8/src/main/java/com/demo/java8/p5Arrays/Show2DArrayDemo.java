package com.demo.java8.p5Arrays;

class Show2DArrayDemo{
   // Статический метод для отображения
   // двумерного массива:
   static void show(int[][] nums){
      for(int i=0;i<nums.length;i++){
         for(int j=0;j<nums[i].length;j++){
            // Отображение значения элемента массива:
            System.out.print(nums[i][j]+" ");
         }
         // Переход к новой строке:
         System.out.println("");
      }
   }
   // Главный метод программы:
   public static void main(String[] args){
      // Массив из двух строк и трех столбцов:
      int[][] alpha={{1,2,3},{4,5,6}};
      // Массив со строками разной длины:
      int[][] bravo={{1,2,3},{4,5},{6,7,8,9}};
      // Отображение содержимого первого массива:
      System.out.println("Массив alpha:");
      show(alpha);
      // Отображение содержимого второго массива:
      System.out.println("Массив bravo:");
      show(bravo);
   }
}