package com.demo.java8.p09Generics;

// ���������� ����� � ����� ���������� ����:
class MyClass4<X> {
    // ���� ����������� ����:
    X data;

    // ����������� � ���������� ����������� ����:
    MyClass4(X data) {
        // ������������ �������� ����:
        this.data = data;
    }

    // ����� ��� ����������� �������� ����:
    void show() {
        System.out.println("�������� ����: " + data);
    }
}

// ������� �����:
class UsingGenClassDemo {
    public static void main(String[] args) {
        // �������� ������� �� ������ ����������� ������.
        // ������ ����������� ��������� ������������
        // ������������� Integer:
        MyClass4<Integer> A = new MyClass4<Integer>(100);
        // �������� ������� �� ������ ����������� ������.
        // ������ ����������� ��������� ������������
        // ������������� Character:
        MyClass4<Character> B = new MyClass4<Character>('B');
        // �������� ������� �� ������ ����������� ������.
        // ������ ����������� ��������� ������������
        // ������������� String:
        MyClass4<String> C = new MyClass4<String>("�������");
        // ����� ������ show() �� ��������, ���������
        // �� ������ ����������� ������:
        A.show();
        B.show();
        C.show();
    }
}