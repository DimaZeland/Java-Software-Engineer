package com.demo.java8.p09Generics;

// ���������� �����:
class Base<X> {
    // ���������� ����:
    X data;

    // �����������:
    Base(X data) {
        this.data = data;
    }

    // ����� ��� ����������� �������� ����:
    void show() {
        System.out.println(data);
    }
}

// �������� �� ������ ����������� ������ � �������������
// ����� ������ �����������:
class Alpha1 extends Base<Integer> {
    // �����������:
    Alpha1(Integer n) {
        // ����� ������������ �����������:
        super(n);
    }

    // ��������������� ������:
    void show() {
        System.out.print("������������� ����: ");
        // ����� ������ ������ �� �����������:
        super.show();
    }
}

// �������� �� ������ ����������� ������ � ���������
// ����� ������ �����������:
class Bravo1 extends Base<String> {
    // �����������:
    Bravo1(String txt) {
        // ����� ������������ �����������:
        super(txt);
    }

    // ��������������� ������:
    void show() {
        System.out.print("��������� ����: ");
        // ����� ������ ������ �� �����������:
        super.show();
    }
}

// �������� �� ������ ����������� ������ � ����������
// ����� ������ �����������:
class Charlie1 extends Base<Character> {
    // �����������:
    Charlie1(Character s) {
        // ����� ������������ �����������:
        super(s);
    }

    // ��������������� ������:
    void show() {
        System.out.print("���������� ����: ");
        // ����� ������ ������ �� �����������:
        super.show();
    }
}

// ������� �����:
class ExtendingGenClassDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ��������:
        Alpha1 A = new Alpha1(123);
        Bravo1 B = new Bravo1("������ B");
        Charlie1 C = new Charlie1('C');
        // ����� ������ show() �� ������ ��������:
        A.show();
        B.show();
        C.show();
    }
}