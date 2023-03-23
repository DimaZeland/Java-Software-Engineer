package com.demo.java8.p11Exceptions;

class UsingThrowDemo {
    public static void main(String[] args) {
        // �������� ������� ����������:
        Exception me = new Exception("������������� ������");
        // �������������� ��� (������� ����):
        try {
            System.out.println("������������ ������");
            // �������������� ��� (���������� ����):
            try {
                // ������������� ����������:
                throw me;
            }
            // ��������� ���������� (���������� ����):
            catch (Exception one) {
                System.out.println(one);
                System.out.println("� ������ ��� ���� ������");
                // ��������� ������������� ����������:
                throw one;
            }
        }
        // ��������� ���������� (������� ����):
        catch (Exception two) {
            System.out.println(two);
        }
        System.out.println("���������� ��������� ���������");
    }
}