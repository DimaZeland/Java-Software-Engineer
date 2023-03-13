package com.demo.java8.p13GUI;

// ������ �������:
import javax.swing.*;
import java.awt.event.*;
// ����� ������:
class MyButton extends JButton implements ActionListener{
   // �������� ������ �� ���������� ActionPerformed:
   public void actionPerformed(ActionEvent e){
      System.exit(0);
   }
   // �����������:
   MyButton(int x,int y,int w,int h){
      // ����� ������������ �����������:
      super("������� ����");
      // ��������� � ������� ������:
      setBounds(x,y,w,h);
      // ������ ����������� ����� ������:
      setFocusPainted(false);
      // ����������� ����������� � ������:
      addActionListener(this);
   }
}
// ����� ������:
class MyPanel extends JPanel{
   // �����������:
   MyPanel(String txt,ImageIcon img){
      // ����� ������������ �����������:
      super();
      // ��������� � ������� ������:
      setBounds(5,5,285,110);
      // ����� ������ ������:
      setBorder(BorderFactory.createEtchedBorder());
      // ���������� ��������� ����������:
      setLayout(null);
      // �������� ������� ��� ����� � ������������:
      JLabel imgLbl=new JLabel(img);
      // ��������� � ������� �����:
      imgLbl.setBounds(10,10,90,90);
      // ����� ������ �����:
      imgLbl.setBorder(BorderFactory.createEtchedBorder());
      // �������� ������� ��� ����� � �������:
      JLabel txtLbl=new JLabel(txt,JLabel.CENTER);
      // ��������� � ������� �����:
      txtLbl.setBounds(110,10,165,90);
      // ����� ������ �����:
      txtLbl.setBorder(BorderFactory.createEtchedBorder());
      // ���������� ����� �� ������:
      add(txtLbl);
      add(imgLbl);
   }
}
// ����� ��� ����:
class MyFrame1 extends JFrame{
   // �����������:
   MyFrame1(String name,String txt,ImageIcon img){
      // ����� ������������ �����������:
      super(name);
      // ��������� � ������� ����:
      setBounds(250,250,300,200);
      // ���� ���������� ��������:
      setResizable(false);
      // ������� �� ������ ��������� �����������:
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      // ���������� ��������� ���������� ��� ����:
      setLayout(null);
      // �������� ������� ������:
      MyPanel pnl=new MyPanel(txt,img);
      // �������� ������� ������:
      MyButton btn=new MyButton(50,120,200,30);
      // ���������� ������ � ����:
      add(pnl);
      // ���������� ������ � ����:
      add(btn);
      // ����������� ���� �� ������:
      setVisible(true);
   }
}
// ������� �����:
class ButtonAndHandlerDemo{
   // ������� �����:
   public static void main(String[] args){
      // ������ ��� �����������:
      ImageIcon img=new ImageIcon("d:/resources/pictures/giraffe.png");
      // ��������� ��������:
      String txt="<html>��� �����.<br>�� �������.<br>�� ��� �����.</html>";
      // �������� ������� ����:
      new MyFrame1("���������� - ������ ������",txt,img);
   }
}