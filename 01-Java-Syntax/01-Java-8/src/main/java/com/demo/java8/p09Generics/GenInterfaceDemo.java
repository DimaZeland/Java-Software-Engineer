package com.demo.java8.p09Generics;

// ���������� ���������:
interface MyMethods<X> {
    X get();

    void set(X arg);
}

// �������� ����������� ������ �� ������
// ����������� ����������:
class MyClass1<X> implements MyMethods<X> {
    // �������� ���� ����������� ����:
    private X value;

    // �������� ������� �� ����������:
    public X get() {
        return value;
    }

    public void set(X arg) {
        value = arg;
    }

    // ����� ��� ����������� �������� ����:
    void show() {
        System.out.println("�������� ����: " + get());
    }

    // �����������:
    MyClass1(X arg) {
        value = arg;
    }
}

// ������� �����:
class GenInterfaceDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ������������ ����������:
        MyMethods ref;
        // �������� �������� �� ������ ����������� ������:
        MyClass1<Integer> A = new MyClass1<>(123);
        MyClass1<Character> B = new MyClass1<>('A');
        // ����� ������ �� ������� ������:
        A.show();
        // ������������ ���������� ������������� ��������:
        ref = A;
        // ����� ������ ����� ������������ ����������:
        ref.set(321);
        // ����� ������� �� �������� ������:
        A.show();
        B.show();
        // ������������ ���������� ������������� ��������:
        ref = B;
        // ����� ������ ����� ������������ ����������:
        ref.set('B');
        // ����� ������ �� ������� ������:
        B.show();
    }
}