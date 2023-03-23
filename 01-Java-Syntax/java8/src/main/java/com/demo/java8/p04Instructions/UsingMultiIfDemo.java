package com.demo.java8.p04Instructions;

// ������ �������:

import javax.swing.*;

// ����� � ������� ������� ���������:
class UsingMultiIfDemo {
    // ������� ����� ���������:
    public static void main(String[] args) {
        // ��������� ���������� ��� �����������:
        ImageIcon img;
        // ��������� ���������� ��� ������
        // �������� ���������:
        String animal;
        // ��������� ���������� � ��������� ���������,
        // ������������ ���� � ����� � ������������:
        String file = "d:/resources/pictures/";
        // ��������� ���������� � ���������� ��������:
        String wolf = "����";
        String fox = "����";
        String bear = "�������";
        String raccoon = "����";
        // ���������� �������� ���������:
        animal = JOptionPane.showInputDialog(null,
                // ����� ��� ����� �����:
                wolf + ", " + fox + " ��� " + bear + "?",
                // �������� ����:
                "������� �������� ���������",
                // ��� �����������:
                JOptionPane.QUESTION_MESSAGE
        );
        // ��������� �������� ���������:
        if (animal == null) { // ���� ������������ ������� ����
            System.exit(0); // ���������� ���������� ���������
        }
        // ���� �������� "����":
        else if (animal.equalsIgnoreCase(wolf)) {
            file += "wolf.jpg";
            animal = wolf;
        }
        // ���� �������� "����":
        else if (animal.equalsIgnoreCase(fox)) {
            file += "fox.jpg";
            animal = fox;
        }
        // ���� �������� "�������":
        else if (animal.equalsIgnoreCase(bear)) {
            file += "bear.jpg";
            animal = bear;
        }
        // ����������� ��������:
        else {
            file += "raccoon.jpg";
            animal = raccoon;
        }
        // �������� ������� ��� �����������:
        img = new ImageIcon(file);
        // ����������� ����������� ����:
        JOptionPane.showMessageDialog(null,
                img,    // � ���� ������������ �����������
                animal, // �������� ����
                // ��� ����������� ����:
                JOptionPane.PLAIN_MESSAGE
        );
    }
}