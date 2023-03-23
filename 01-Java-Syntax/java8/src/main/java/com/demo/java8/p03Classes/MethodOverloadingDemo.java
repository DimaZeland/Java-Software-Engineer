package com.demo.java8.p03Classes;

// �������� ������:
class MyClass {
    // ���� ������:
    int number;
    char symbol;

    // ����� � ����� ���������� ��� ������������
    // �������� ���� number:
    void set(int n) {
        number = n;
    }

    // ����� � ����� ���������� ��� ������������
    // �������� ���� symbol:
    void set(char s) {
        symbol = s;
    }

    // ����� � ����� ����������� ��� ������������
    // �������� ����� number � symbol:
    void set(int n, char s) {
        // ������������ �������� ���� number:
        set(n);
        // ������������ �������� ���� symbol:
        set(s);
    }

    // ����� ��� ���������� ��� ������������ ��������
    // ����� �����:
    void set() {
        // ������������ �������� 0 ���� number
        // � �������� 'Z' ���� symbol:
        set(0, 'Z');
    }

    // ����� ��� ���������� ��� �����������
    // �������� ����� �������:
    void show() {
        System.out.println("�������� ����� " + number + " � " + symbol);
    }

    // ����� � ����� ���������� ��� �����������
    // �������� ����� �������:
    void show(String txt) {
        System.out.println(txt + ": �������� ����� " + number + " � " + symbol);
    }

    // ����� � ����� ����������� ��� �����������
    // �������� ����� �������:
    void show(String txt1, String txt2) {
        System.out.println(txt1 + ": " + number);
        System.out.println(txt2 + ": " + symbol);
    }
}

// �������� ������ � ������� ������� ���������:
class MethodOverloadingDemo {
    // ������� ����� ���������:
    public static void main(String[] args) {
        // ���������� ��������� ����������:
        MyClass objA, objB;
        // �������� ��������:
        objA = new MyClass();
        objB = new MyClass();
        // ������������ �������� ����� ������� �������:
        objA.set(100);
        objA.set('A');
        // ����������� �������� ����� ������� �������:
        System.out.println("������ objA:");
        objA.show();
        // ������������ �������� ����� ������� �������:
        objB.set();
        // ����������� �������� ����� ������� �������:
        objB.show("������ objB");
        // ��������� �������� ����� ������� �������:
        objB.set(200, 'B');
        // �������� �������� ����� ������� �������:
        System.out.println("������ objB ����� ���������:");
        objB.show("�����", "������");
    }
}