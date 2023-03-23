package com.demo.java8.p09Generics;

// ���������� �����:
class MyClass7<T> {
    // ���� ����������� ����:
    T value;

    // �����������:
    MyClass7(T val) {
        value = val;
    }
}

// ������� �����:
class UsingWildcardDemo {
    // ����������� ���������� �����
    // (������������ �������� ����������� ����):
    static <T> void show(MyClass7<T> obj) {
        System.out.println("����� ������ show():");
        // ����������� �������� ����:
        System.out.println(obj.value);
    }

    // ����������� �����, � ������� ������������
    // ���������� �����������:
    static void display(MyClass7<?> obj) {
        System.out.println("����� ������ display():");
        // ����������� �������� ����:
        System.out.println(obj.value);
    }

    // ������� �����:
    public static void main(String[] args) {
        // ��� �������� ������� ���� ������� ��������
        // ��� ����������� ����:
        MyClass7<Integer> A = new MyClass7<>(100);
        // ��� �������� ������� �� ������� ��������
        // ��� ����������� ����:
        MyClass7 B = new MyClass7<>('B');
        // ��� �������� ������� ������������
        // ���������� �����������:
        MyClass7<?> C = new MyClass7<>("������ �");
        // ������� ������ ������� show() � display()
        // � ������� �����������:
        show(A);
        display(A);
        show(B);
        display(B);
        show(C);
        display(C);
    }
}