package com.demo.java8.p03Classes;

// ����� �� ������������ �������:
class MyClass5 {
    // ����������� ����:
    static int count = 0;

    // ����������� ��� ����������:
    MyClass5() {
        // ���������� �������� ������������ ����:
        count++;
        // ����������� ���������:
        System.out.println("������ ������ ����� " + count);
    }

    // ����������� �����:
    static void show() {
        System.out.println("���������� ��������: " + count);
    }
}

// ����� � ������� ������� ���������:
class UsingStaticMembersDemo {
    // ������� ����� ���������:
    public static void main(String[] args) {
        // ����� ������������ ������:
        MyClass5.show();
        // �������� ��������:
        MyClass5 objA = new MyClass5();
        MyClass5 objB = new MyClass5();
        MyClass5 objC = new MyClass5();
        // ����� ������������ ������ ����� ������ �� �����:
        MyClass5.show();
        // ����� ������������ ������ ����� ������ �� ������:
        objC.show();
        objB.show();
    }
}