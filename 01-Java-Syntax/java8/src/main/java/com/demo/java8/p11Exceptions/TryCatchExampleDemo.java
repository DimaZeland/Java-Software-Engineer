package com.demo.java8.p11Exceptions;

// ����������� ������:

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

// ������� �����:
class TryCatchExampleDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ��������� ���������� ��� ������
        // ������������ ��������:
        String input;
        // ���������� ��� ������ ������ �����:
        int num;
        // ����������� ����������� ���� � ����� �����:
        input = showInputDialog(null,
                "������� �����", // ����� ��� ����� �����
                "�����",         // �������� ����
                QUESTION_MESSAGE // ��� ����
        );
        // ���� ��������������� ����:
        try {
            // ������� ������������� ����� � �����:
            num = parseInt(input);
            // ����������� ����������� ���� � �������:
            showMessageDialog(null,
                    // ������������ � ���� �����:
                    "����� " + (num - 1) + ", " + num + " � " + (num + 1),
                    "�����",             // �������� ����
                    INFORMATION_MESSAGE  // ��� ����
            );
            // ��������� ������ (��� �����������,
            // ���� � ����������� ����� �������� ������):
        } catch (Exception e) {
            // ����������� ����������� ����:
            showMessageDialog(null,
                    "���-�� ����� �� ���...", // ��������� � ����
                    "������",                 // �������� ����
                    ERROR_MESSAGE             // ��� ����
            );
        }
    }
}