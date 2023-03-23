package com.demo.java8.p07AbstractClasses;

// ������ ���������:
interface First2 {
    default void hello() {
        System.out.println("����� �� ���������� First");
    }
}

// ������ ���������:
interface Second2 {
    default void hello() {
        System.out.println("����� �� ���������� Second");
    }
}

// ����� ��������� ��� ����������:
class MyClass2 implements First2, Second2 {
    // �������� ������:
    public void hello() {
        // ����� ������ ������ �� ���������� First:
        First2.super.hello();
        // ����� ������ ������ �� ���������� Second:
        Second2.super.hello();
    }
}

// ������� �����:
class MoreDefaultMethodsDemo {
    public static void main(String[] args) {
        // �������� �������:
        MyClass2 obj = new MyClass2();
        // ����� ������:
        obj.hello();
    }
}