package com.demo.java8.p09Generics;

// ����� � ���������� �������:
class MyClass6 {
    // ��������� ����:
    String name;

    // ���������� �����:
    <X> void show(X arg) {
        System.out.println(name + ": " + arg);
    }

    // �����������:
    MyClass6(String txt) {
        name = txt;
    }
}

// ������� �����:
class UsingGenMethodsDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ��������:
        MyClass6 A = new MyClass6("������ A");
        MyClass6 B = new MyClass6("������ B");
        // ����� ���������� ������� �� ������ ��������:
        A.show(123);
        A.show("Alpha");
        A.show('A');
        B.show(123);
        B.show("Bravo");
        B.show('B');
    }
}