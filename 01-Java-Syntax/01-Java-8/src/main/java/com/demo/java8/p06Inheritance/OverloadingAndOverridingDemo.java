package com.demo.java8.p06Inheritance;

// ����������:
class Alpha2 {
    // ������ ������ ��� ���������:
    void show() {
        System.out.println("����� Alpha");
    }

    // ������ ������ � ��������� ����������:
    void show(String txt) {
        System.out.println(txt);
    }
}

// ��������:
class Bravo2 extends Alpha2 {
    // ��������������� ������ ������ ��� ����������:
    void show() {
        System.out.println("����� Bravo");
    }

    // ������ ������ � ������������� ����������:
    void show(int num) {
        System.out.println("����� " + num);
    }
}

// ������� �����:
class OverloadingAndOverridingDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ������� �����������:
        Alpha2 objA = new Alpha2();
        // ����� ������ ������ ������:
        objA.show();
        objA.show("������ objA");
        // �������� ������� ���������:
        Bravo2 obj = new Bravo2();
        // ����� ������ ������ ������:
        obj.show();
        obj.show("������ objB");
        obj.show(123);
    }
}