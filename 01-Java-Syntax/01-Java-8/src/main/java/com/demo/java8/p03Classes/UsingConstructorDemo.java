package com.demo.java8.p03Classes;

// �������� ������:
class MyClass1 {
    // ���� ������:
    int number;
    char symbol;

    // ����������� ������ ��� ����������:
    MyClass1() {
        // ������������ �������� �����:
        number = 100;
        symbol = 'A';
    }

    // ����������� ������ � ����� �����������:
    MyClass1(int n, char s) {
        // ������������ �������� �����:
        number = n;
        symbol = s;
    }

    // ����� ��� ����������� �������� ����� �������:
    void show() {
        System.out.println("�������� ����� " + number + " � " + symbol);
    }
}

// �������� ������ � ������� ������� ���������:
class UsingConstructorDemo {
    // ������� ����� ���������:
    public static void main(String[] args) {
        // �������� ������� �������
        // (���������� ����������� ��� ����������):
        MyClass1 objA = new MyClass1();
        // �������� ������� �������
        // (���������� ����������� � ����� �����������):
        MyClass1 objB = new MyClass1(200, 'B');
        // ����������� �������� ����� ������� �������:
        System.out.println("������ objA:");
        objA.show();
        // ����������� �������� ����� ������� �������:
        System.out.println("������ objB:");
        objB.show();
    }
}