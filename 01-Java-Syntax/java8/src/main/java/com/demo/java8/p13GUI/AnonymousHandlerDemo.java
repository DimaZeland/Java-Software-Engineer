package com.demo.java8.p13GUI;

// ������ �������:

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ����� ��� �������� ����:
class MyFrame extends JFrame {
    // �����������:
    MyFrame(String name) {
        // ����� ������������ �����������:
        super(name);
        // ��������� � ������� ����:
        setBounds(250, 250, 300, 200);
        // ���� ���������� ��������:
        setResizable(false);
        // ������� �� ������ ��������� �����������:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // ���������� ��������� ����������:
        setLayout(null);
        // �������� ������� �����:
        JLabel lbl = new JLabel("����� ������ �����", JLabel.CENTER);
        // ��������� � ������� �����:
        lbl.setBounds(10, 30, 280, 50);
        // ����� ���� ��� ������ �����:
        lbl.setForeground(Color.BLUE);
        // ����� ������ �����:
        lbl.setBorder(BorderFactory.createEtchedBorder());
        // ���������� ����� � ����:
        add(lbl);
        // �������� ������� ������:
        JButton btn = new JButton("������� ����");
        // ��������� � ������� ������:
        btn.setBounds(50, 120, 200, 30);
        // ���������� ����� ����������� ����� ������:
        btn.setFocusPainted(false);
        // ����������� ���������� ����������� � ������:
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // ���������� ������ � ����:
        add(btn);
        // ����������� ���� �� ������:
        setVisible(true);
    }
}

// ������� �����:
class AnonymousHandlerDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ������� ����:
        new MyFrame("��������� ����������");
    }
}