package com.demo.java8.p09Generics;

// ���������� ���������:
interface MyMethods3<X> {
    X get();

    void set(X arg);
}

// �������� ������� ������ �� ������
// ����������� ����������:
class Alpha3 implements MyMethods3<Integer> {
    // �������� ���� �������������� ����:
    private Integer value;

    // �������� ������� �� ����������:
    public Integer get() {
        return value;
    }

    public void set(Integer arg) {
        value = arg;
    }

    // ����� ��� ����������� �������� ����:
    void show() {
        System.out.println("������������� ����: " + get());
    }

    // �����������:
    Alpha3(Integer arg) {
        value = arg;
    }
}

// �������� ������� ������ �� ������
// ����������� ����������:
class Bravo3 implements MyMethods3<Character> {
    // �������� ���� ����������� ����:
    private Character value;

    // �������� ������� �� ����������:
    public Character get() {
        return value;
    }

    public void set(Character arg) {
        value = arg;
    }

    // ����� ��� ����������� �������� ����:
    void show() {
        System.out.println("���������� ����: " + get());
    }

    // �����������:
    Bravo3(Character arg) {
        value = arg;
    }
}

// ������� �����:
class MoreGenInterfaceDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ������������ ����������:
        MyMethods3 ref;
        // �������� ��������:
        Alpha3 A = new Alpha3(123);
        Bravo3 B = new Bravo3('A');
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