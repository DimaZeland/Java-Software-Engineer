package com.demo.java8.p02BasicTypes;

import javax.swing.JOptionPane;

class InputDoubleVariablesDemo {
    public static void main(String[] args) {
        // �������� ����������:
        double mass, height, bmi;
        // ���������� ��� ������ �������� � ���� �����:
        String result;
        // ���������� �������� �� ���� �����:
        result = JOptionPane.showInputDialog("��� ���� � ������:");
        // �������������� ������ � �����:
        height = Double.parseDouble(result);
        // ���������� �������� �� ���� �����:
        result = JOptionPane.showInputDialog("��� ��� � �����������:");
        // �������������� ������ � �����:
        mass = Double.parseDouble(result);
        // ���������� ������� ����� ����:
        bmi = mass / height / height;
        // ���������� ����������� ��������:
        bmi = Math.round(bmi * 100) / 100.0;
        // ����������� ���� � ����������:
        JOptionPane.showMessageDialog(null, "������ ����� ����: " + bmi);
    }
}