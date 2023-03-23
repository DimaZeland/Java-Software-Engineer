package com.demo.java8.p03Classes;

import javax.swing.JOptionPane;

// �������� ������:
class MyClass2 {
    // ���� ������:
    int number;
    char symbol;
}

// �������� ������ � ������� ������� ���������:
class UsingObjectDemo {
    // ������� ����� ���������:
    public static void main(String[] args) {
        // �������� �������:
        MyClass2 obj = new MyClass2();
        // ������������ �������� ����� �������:
        obj.number = 100;
        obj.symbol = 'A';
        // ����� ��� ����������� � ���������� ����:
        String text = "�����:  " + obj.number + "\n";
        text += "������:  " + obj.symbol;
        // ����������� ����������� ����:
        JOptionPane.showMessageDialog(null, text);
    }
}