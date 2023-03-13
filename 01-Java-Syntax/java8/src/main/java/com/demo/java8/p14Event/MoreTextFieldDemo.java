package com.demo.java8.p14Event;

// Импорт классов:
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
// Класс для создания окна реализует
// интерфейсы ActionListener и MouseListener:
class MyFrame1 extends JFrame implements ActionListener,MouseListener{
   // Метка:
   private JLabel L;
   // Текстовое поле:
   private JTextField T;
   // Название кнопок:
   private String apply="Применить";
   private String exit="Закрыть";
   // Метод для обработки щелчка на кнопке:
   public void actionPerformed(ActionEvent e){
      // Определение названия кнопки, на которой
      // произошло событие:
      String txt=e.getActionCommand();
      // Если первая кнопка:
      if(txt.equals(apply)){
         // Присваивание текста из поля метке:
         L.setText(T.getText());
      } // Если вторая кнопка:
      else{
         // Завершение выполнения программы:
         System.exit(0);
      }
   }
   // Метод выполняется, когда курсор мыши покидает
   // область компонента:
   public void mouseExited(MouseEvent e){
      // Применение эффекта "вдавливания" к метке:
      L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
      // Применение выравнивания по левому краю
      // для текста в метке:
      L.setHorizontalAlignment(JLabel.LEFT);
   }
   // Метод вызывается, когда курсор оказывается над
   // областью компонента:
   public void mouseEntered(MouseEvent e){
      // Для метки применяется эффект "поднятия":
      L.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
      // Применение выравнивания по правому краю
      // для текста в метке:
      L.setHorizontalAlignment(JLabel.RIGHT);
   }
   // Методы из интерфейса MouseListener
   // с пустой реализацией:
   public void mouseReleased(MouseEvent e){}
   public void mousePressed(MouseEvent e){}
   public void mouseClicked(MouseEvent e){}
   // Конструктор:
   MyFrame1(){
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
      // Регистрация обработчика в метке:
      L.addMouseListener(this);
      // Создание текстового поля:
      T=new JTextField();
      // Положение и размеры поля:
      T.setBounds(L.getX(),50,L.getWidth(),30);
      // Ширина кнопок:
      int bw=(T.getWidth()-20)/2;
      // Создание первой кнопки:
      JButton appB=new JButton(apply);
      // Положение и размеры первой кнопки:
      appB.setBounds(T.getX(),90,bw,30);
      // Отмена режима отображения фокуса
      // для первой кнопки:
      appB.setFocusPainted(false);
      // Регистрация объекта окна 
      // обработчиком события для первой кнопки:
      appB.addActionListener(this);
      // Создание второй кнопки:
      JButton extB=new JButton(exit);
      // Положение и размеры второй кнопки:
      extB.setBounds(appB.getX()+appB.getWidth()+20,appB.getY(),appB.getWidth(),appB.getHeight());
      // Отмена режима отображения фокуса
      // для второй кнопки:
      extB.setFocusPainted(false);
      // Регистрация объекта окна
      // обработчиком события для второй кнопки:
      extB.addActionListener(this);
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
class MoreTextFieldDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание окна:
      new MyFrame1();
   }
}