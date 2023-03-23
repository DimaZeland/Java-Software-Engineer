package com.demo.java8.p13GUI;

// ������ �������:

import javax.swing.*;
import java.awt.event.*;

// ����� ��� �������� ����:
class MyFrame5 extends JFrame {
    // �����������:
    MyFrame5() {
        // ����� ������������ �����������:
        super("���� � �������");
        // ��������� � ������� ����:
        setBounds(250, 250, 300, 200);
        // ���� ���������� ��������:
        setResizable(false);
        // ������� �� ������ ��������� �����������:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // ���������� ��������� ����������:
        setLayout(null);
        // �������� ������� �����:
        JLabel lbl = new JLabel("������ �� ������ �������� � �������� ����");
        // ��������� � ������� �����:
        lbl.setBounds(10, 30, 280, 50);
        // ���������� ����� � ����:
        add(lbl);
        // �������� ������� ������:
        JButton btn = new JButton("������� ����");
        // ��������� � ������� ������:
        btn.setBounds(50, 120, 200, 30);
        // �������� ������� ��� ����������� �������,
        // ������������� ��� ������ ������:
        MyHandler hnd = new MyHandler();
        // ����������� ����������� � ������:
        btn.addActionListener(hnd);
        // ���������� ������ � ����:
        add(btn);
        // ����������� ���� �� ������:
        setVisible(true);
    }
}

// ����� �����������:
class MyHandler implements ActionListener {
    // ����������� ������ �� ����������:
    public void actionPerformed(ActionEvent e) {
        // ���������� ���������� ���������:
        System.exit(0);
    }
}

// ������� �����:
class WindowWithButtonDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ������� ����:
        new MyFrame5();
    }
}