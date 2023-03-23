package com.demo.java8.p09Generics;

// ����������:
class Base2 {
    // ��������� ����:
    String name;

    // �����������:
    Base2(String txt) {
        name = txt;
    }

    // ����� ��� ����������� �������� ����:
    void show() {
        System.out.println("��������� ����: " + name);
    }
}

// �������� ����������� Base2:
class Alpha2 extends Base2 {
    // ������������� ����:
    int number;

    // �����������:
    Alpha2(String txt, int n) {
        // ����� ������������ �����������:
        super(txt);
        // ������������ �������� �������������� ����:
        number = n;
    }

    // ��������������� ������:
    void show() {
        // ����� ������ ������ �� �����������:
        super.show();
        // ����������� �������� �������������� ����:
        System.out.println("������������� ����: " + number);
    }
}

// �������� ����������� Alpha2:
class Bravo2 extends Alpha2 {
    // ���������� ����:
    char symbol;

    // �����������:
    Bravo2(String txt, int n, char s) {
        // ����� ������������ �����������:
        super(txt, n);
        // ������������ �������� ����������� ����:
        symbol = s;
    }

    // ��������������� ������:
    void show() {
        // ����� ������ ������ �� �����������:
        super.show();
        // ����������� �������� ����������� ����:
        System.out.println("���������� ����: " + symbol);
    }
}

// ���������� �����:
class MyClass2<X extends Base2> {
    // ���� ����������� ����:
    X obj;

    // �����������:
    MyClass2(X obj) {
        // �������� ����:
        this.obj = obj;
    }

    // ����� ����������� ������:
    void show() {
        System.out.println("������ ������ MyClass2");
        // ����� ������ �� ���� ����������� ����:
        obj.show();
    }
}

// ������� �����:
class GenTypeExtendingDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ������� ��������� �� ������ ����������� ������:
        MyClass2<Alpha2> A = new MyClass2<>(new Alpha2("Alpha2", 123));
        MyClass2<Bravo2> B = new MyClass2<>(new Bravo2("Bravo2", 321, 'B'));
        // ����� ������ show() �� ��������:
        A.show();
        B.show();
    }
}