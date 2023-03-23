package com.demo.java8.p11Exceptions;

// ������ �������:

import java.util.*;

// ������� �����:
class NestedTryCatchDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ������ ������ Scanner (����� ��� ����������
        // ����������� �����):
        Scanner input = new Scanner(System.in);
        // ���������� �������:
        char[] symbs;
        // ���������� ��� ������ ������� �������
        // � ������� ��������:
        int size, index;
        // �������������� ��� (������� ����):
        try {
            // ����������� ���������:
            System.out.print("������� ������ �������: ");
            // ���������� ������� �������:
            size = input.nextInt();
            // �������� �������:
            symbs = new char[size];
            System.out.print("| ");
            // ���������� ������� ���������:
            for (int k = 0; k < size; k++) {
                // �������� ������� ������������� ��������:
                symbs[k] = (char) ('A' + k);
                // ������������ �������� ��������:
                System.out.print(symbs[k] + " | ");
            }
            // �������������� ��� (���������� ����):
            try {
                System.out.print("\n������� ������: ");
                // ���������� �������� �������:
                index = input.nextInt();
                // �������� ��������:
                System.out.println("������ - " + symbs[index]);
            }
            // ���� ������������ ���� ������������ ������:
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("������ �������� ���");
            }
            // ���� ����������� ������:
            finally {
                System.out.println("������ ������ �������");
            }
            System.out.println("��� ������� ������� �������� ��������");
        }
        // ���� ������� �� �����:
        catch (InputMismatchException e) {
            System.out.println("������: �� �� ����� �����");
        }
        // ���� ��� ������� ������ ������������� ������:
        catch (NegativeArraySizeException e) {
            System.out.println("�������� ������ �������");
        }
        System.out.println("���������� ��������� ���������");
    }
}