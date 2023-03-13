package com.demo.java8.p13GUI;

// ������ �������:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// ����� ��� �������� ����
// ��������� ��������� ActionListener:
class MyFrame4 extends JFrame implements ActionListener{
   // �������� ������ �� ���������� ActionListener:
   public void actionPerformed(ActionEvent e){
      System.exit(0);
   }
   // �����������:
   MyFrame4(String name){
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
      JPanel pnl=new JPanel();
      // ��������� � ������� ������:
      pnl.setBounds(5,5,285,110);
      // ����� ������ ������:
      pnl.setBorder(BorderFactory.createEtchedBorder());
      // ���������� ��������� ���������� ��� ������:
      pnl.setLayout(null);
      // ������ ����������� (��� ����������� � �����):
      ImageIcon img=new ImageIcon("d:/resources/pictures/giraffe.png");
      // ��������� �������� ��� ����������� � �����:
      String txt="<html>��� �����.<br>�� �������.<br>�� ��� �����.</html>";
      // �������� ������� ����� � ������������:
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
      // �������� ������� ������:
      JButton btn=new JButton("������� ����");
      // ��������� � ������� ������:
      btn.setBounds(50,120,200,30);
      // ���������� ����� ����������� ����� ������:
      btn.setFocusPainted(false);
      // ����������� � ������ ������������
      // ������� ����:
      btn.addActionListener(this);
      // �������� ������� ������:
      Font F=new Font(
         // �������� ������ ��� � ������:
         btn.getFont().getName(),
         // ����� - ������ ������:
         Font.BOLD|Font.ITALIC,
         // ������ ������ �� 2 ������ ��� � ������:
         btn.getFont().getSize()+2);
      // ���������� ������ � ����� � �������:
      txtLbl.setFont(F);
      // ���������� ����� �� ������:
      pnl.add(imgLbl);
      pnl.add(txtLbl);
      // ���������� ������ � ����:
      add(pnl);
      // ���������� ������ � ����:
      add(btn);
      // ����������� ���� �� ������:
      setVisible(true);
   }
}
// ������� �����:
class WindowAsHandlerDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ������� ����:
      new MyFrame4("���������� - ������ ����");
   }
}