package com.demo.java8.p14Event;

// Импорт классов:
import javax.swing.*;
import javax.swing.border.*;

// Класс для создания окна:
class MyFrame2 extends JFrame{
   // Метка:
   private JLabel L;
   // Текстовое поле:
   private JTextField T;
   // Конструктор:
   MyFrame2(){
      // Вызов конструктора суперкласса:
      super("Окно с текстовым полем");
      // Значения для размеров окна:
      int w=300,h=160;
      // Положение и размеры окна:
      setBounds(250,250,w,h);
      // Реакция на щелчок системной пиктограммы:
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      // Окно постоянных размеров:
      setResizable(false);
      // Отключение менеджера компоновки:
      setLayout(null);
      // Создание метки:
      L=new JLabel();
      // Положение и размеры метки:
      L.setBounds(10,10,w-25,30);
      // Выделение метки с помощью эффекта "вдавливания":
      L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
      // Создание текстового поля:
      T=new JTextField();
      // Положение и размеры поля:
      T.setBounds(L.getX(),50,L.getWidth(),30);
      // Ширина кнопок:
      int bw=(T.getWidth()-20)/2;
      // Создание первой кнопки:
      JButton appB=new JButton("Применить");
      // Положение и размеры первой кнопки:
      appB.setBounds(T.getX(),90,bw,30);
      // Отмена режима отображения фокуса
      // для первой кнопки:
      appB.setFocusPainted(false);
      // Обработчик события для первой кнопки:
      appB.addActionListener(e->L.setText(T.getText()));
      // Создание второй кнопки:
      JButton extB=new JButton("Закрыть");
      // Положение и размеры второй кнопки:
      extB.setBounds(appB.getX()+appB.getWidth()+20,appB.getY(),appB.getWidth(),appB.getHeight());
      // Отмена режима отображения фокуса
      // для второй кнопки:
      extB.setFocusPainted(false);
      // Обработчик события для второй кнопки:
      extB.addActionListener(e->System.exit(0));
      // Добавление в окно метки:
      add(L);
      // Добавление поля в окно:
      add(T);
      // Добавление первой кнопки в окно:
      add(appB);
      // Добавление второй кнопки в окно:
      add(extB);
      // Отображение окна:
      setVisible(true);
   }
}
// Главный класс:
class TextFieldDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание окна:
      new MyFrame2();
   }
}