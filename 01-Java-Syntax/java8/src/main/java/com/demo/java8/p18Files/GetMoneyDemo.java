package com.demo.java8.p18Files;

// Статический импорт:
import static javax.swing.JOptionPane.*;
// Главный класс:
class GetMoneyDemo{
   // Главный метод:
   public static void main(String[] args){
      // Имя вкладчика:
      String name;
      // Начальная сумма вклада:
      double m;
      // Процентная ставка:
      double r;
      // Время размещения вклада:
      int t;
      // Итоговая сумма по вкладу:
      double val;
      // Контролируемый код:
      try{
         // Определение имени вкладчика:
         name=args[0]+" "+args[1];
         // Определение начальной суммы вклада:
         m=Double.parseDouble(args[2]);
         // Определение процентной ставки:
         r=Double.parseDouble(args[3]);
         // Определение интервала времени:
         t=Integer.parseInt(args[4]);
         // Вычисление итоговой суммы.
         // Начальное значение:
         val=m;
         // "Начисление процентов":
         for(int k=1;k<=t;k++){
            val*=(1+r/100);
         }
         // "Уточнение" результата:
         val=((int)(100*val))/100.0;
         // Формирование текста для отображения сообщения
         // в диалоговом окне:
         String txt="Имя:       "+name+"\n";
         txt+="Вклад:  "+m+"\n";
         txt+="Ставка:  "+r+"\n";
         txt+="Время:   "+t+"\n";
         txt+="Итог:       "+val;
         // Отображение окна с сообщением:
         showMessageDialog(null,
            txt, // Текст сообщения
            // Название окна:
            "Итоговая сумма по депозиту",
            // Тип окна:
            INFORMATION_MESSAGE
         );
      } // Обработка исключения:
      catch(Exception e){
         // Отображение сообщения:
         showMessageDialog(null,
            // Текст сообщения:
            "Неверно указаны параметры!\n"+e,
            // Название окна:
            "Ошибка",
            // Тип окна:
            ERROR_MESSAGE
         );
      }
   }
}