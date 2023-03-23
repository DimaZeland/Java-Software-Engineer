package com.demo.java8.p03Classes;

import javax.swing.JOptionPane;

// �������� ������:
class MyClass3 {
    // ���� ������:
    int number;
    char symbol;

    // ����� ��� ������������ �������� �����:
    void set(int n, char s) {
        number = n;
        symbol = s;
    }

    // ������� ������������ ��������� ������
    // � ��������� �������:
    String getInfo() {
        // �����, ������� ������������
        // ����������� ������:
        String text = "�����:  " + number + "\n";
        text += "������:  " + symbol;
        // ��������� ������:
        return text;
    }
}

// �������� ������ � ������� ������� ���������:
class UsingObjectWithMethodsDemo {
    // ������� ����� ���������:
    public static void main(String[] args) {
        // �������� ������� �������:
        MyClass3 objA = new MyClass3();
        // �������� ������� �������:
        MyClass3 objB = new MyClass3();
        // ������������ �������� ����� ������� �������:
        objA.set(100, 'A');
        // ������������ �������� ����� ������� �������:
        objB.set(200, 'B');
        // ����������� ������� ����������� ����:
        JOptionPane.showMessageDialog(null,
                objA.getInfo(),  // ������������ �����
                "������ ������", // ��������� ����
                JOptionPane.INFORMATION_MESSAGE); // ��� ����
        // ����������� ������� ����������� ����:
        JOptionPane.showMessageDialog(null,
                objB.getInfo(),  // ������������ �����
                "������ ������", // ��������� ����
                JOptionPane.INFORMATION_MESSAGE); // ��� ����
    }
}