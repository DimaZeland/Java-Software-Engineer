package com.demo.java8.p10Lambda;

// �����:
class MyClass4 {
    // ����:
    int number;

    // ������������� �����:
    void set() {
        number = 0;
    }

    void set(int n) {
        number = n;
    }
}

// ������ ���������:
interface Alpha4 {
    void none();
}

// ������ ���������:
interface Bravo4 {
    void one(int n);
}

// ������� �����:
class OverloadedMethRefDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� �������:
        MyClass4 obj = new MyClass4();
        // ������������� ������ �� ������������� �����:
        Alpha4 A = obj::set;
        Bravo4 B = obj::set;
        // ����� ������ ����� ������������ ����������:
        B.one(100);
        // �������� �������� ���� �������:
        System.out.println("�������� ����: " + obj.number);
        // ����� ������ ����� ������������ ����������:
        A.none();
        // �������� �������� ���� �������:
        System.out.println("�������� ����: " + obj.number);
    }
}