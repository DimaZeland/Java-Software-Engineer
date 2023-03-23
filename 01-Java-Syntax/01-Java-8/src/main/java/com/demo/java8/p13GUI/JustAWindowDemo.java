package com.demo.java8.p13GUI;

// ������ ������ JFrame:

import javax.swing.JFrame;

// ������� �����:
class JustAWindowDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ������� ����:
        JFrame wnd = new JFrame("������� ����");
        // ������� ����:
        wnd.setSize(300, 200);
        // ��������� ���� �� ������:
        wnd.setLocation(250, 250);
        // ���� ���������� ��������:
        wnd.setResizable(false);
        // ������� �� ������ ��������� �����������:
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ����������� ���� �� ������:
        wnd.setVisible(true);
    }
}