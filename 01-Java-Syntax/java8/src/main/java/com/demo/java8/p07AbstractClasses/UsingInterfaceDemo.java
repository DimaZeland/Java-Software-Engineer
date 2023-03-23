package com.demo.java8.p07AbstractClasses;

// ���������:
interface MyInterface {
    // ����������� ���������:
    int NUMBER = 100;

    // ���������� �������:
    int getNumber(double x);

    char getSymbol(int n);
}

// ����� ��������� ���������:
class MyClass4 implements MyInterface {
    // �������� �������:
    public int getNumber(double x) {
        return (int) x;
    }

    public char getSymbol(int n) {
        return (char) ('A' + n);
    }
}

// ������� �����:
class UsingInterfaceDemo {
    public static void main(String[] args) {
        MyClass4 obj = new MyClass4();
        System.out.println("����������� ���������: " + MyClass4.NUMBER);
        System.out.println("����� �����: " + obj.getNumber(12.5));
        System.out.println("������: " + obj.getSymbol(3));
    }
}