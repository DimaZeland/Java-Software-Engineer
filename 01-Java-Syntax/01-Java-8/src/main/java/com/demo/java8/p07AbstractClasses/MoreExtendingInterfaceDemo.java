package com.demo.java8.p07AbstractClasses;

// ������ ���������:
interface First3 {
    // �������� ������:
    default void alpha() {
        System.out.println("��������� First: ����� alpha()");
    }
}

// ������ ���������:
interface Second3 extends First3 {
    // �������� �������:
    default void alpha() {
        // ����� ������ ������ �� ���������� First:
        First3.super.alpha();
        System.out.println("��������� Bravo: ����� alpha()");
    }

    default void bravo() {
        System.out.println("��������� Bravo: ����� bravo()");
    }
}

// ����� ��������� ���������:
class MyClass3 implements Second3 {
    // �������� ������:
    public void bravo() {
        // ����� ������ ������ �� ���������� Second:
        Second3.super.bravo();
        System.out.println("����� MyClass: ����� bravo()");
    }
}

// ������� �����:
class MoreExtendingInterfaceDemo {
    public static void main(String[] args) {
        // �������� �������:
        MyClass3 obj = new MyClass3();
        // ����� �������:
        obj.alpha();
        obj.bravo();
    }
}