package com.demo.java8.p11Exceptions;

class UsingExceptionObjectDemo {
    public static void main(String[] args) {
        // ��� � �������:
        try {
            System.out.println("������������� ������:");
            int[] a = new int[-1];
        }
        // ��������� ������:
        catch (NegativeArraySizeException e) {
            System.out.println(e);
        }
        // ��� � �������:
        try {
            System.out.println("�������� ������:");
            int[] b = {1};
            b[-1] = 0;
        }
        // ��������� ������:
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        // ��� � �������:
        try {
            System.out.println("������� �� ����:");
            int c = 10 / 0;
        }
        // ��������� ������:
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}