package com.demo.java8.p02BasicTypes;

import javax.swing.JOptionPane;

class InputIntVariablesDemo {
    public static void main(String[] args) {
        // ������������� ����������:
        int age, year, birth;
        // ���������� ��� ������ �������� � ���� �����:
        String result;
        // ���������� �������� �� ���� �����:
        result = JOptionPane.showInputDialog("����� ������ ���?");
        // �������������� ������ � ����� �����:
        year = Integer.parseInt(result);
        // ���������� �������� �� ���� �����:
        result = JOptionPane.showInputDialog("������� ��� ���?");
        // �������������� ������ � ����� �����:
        age = Integer.parseInt(result);
        // ���������� ���� ��������:
        birth = year - age;
        // ����������� ���� � ����������:
        JOptionPane.showMessageDialog(null, "�� �������� � " + birth + " ����!");
    }
}