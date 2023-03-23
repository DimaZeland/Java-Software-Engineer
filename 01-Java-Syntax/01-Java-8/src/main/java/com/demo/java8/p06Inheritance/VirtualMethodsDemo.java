package com.demo.java8.p06Inheritance;

// ����������:
class Alpha7 {
    // ��������� ����:
    String name;

    // ����� ��� ����������� ���������:
    void objectCreated() {
        System.out.println("������ ������ ������ Alpha");
    }

    // ����� ��� ����������� ���������:
    void hello() {
        System.out.println("������ ������ Alpha");
    }

    // ����� ��� ����������� �������� ����:
    void show() {
        // ����� ������ ��� ����������� ���������:
        hello();
        // ����������� �������� ����:
        System.out.println("���� name: " + name);
    }

    // �����������:
    Alpha7(String txt) {
        // ����� ������ ��� ����������� ���������:
        objectCreated();
        // ������������ �������� ����:
        name = txt;
    }
}

// ��������:
class Bravo7 extends Alpha7 {
    // ��������������� ������:
    void objectCreated() {
        System.out.println("������ ������ ������ Bravo");
    }

    // ��������������� ������:
    void hello() {
        System.out.println("������ ������ Bravo");
    }

    // �����������:
    Bravo7(String txt) {
        // ����� ������������ �����������:
        super(txt);
    }
}

// ������� �����:
class VirtualMethodsDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ������� �����������:
        Alpha7 objA = new Alpha7("alpha");
        // ����������� �������� ����:
        objA.show();
        // �������� ������� ���������:
        Bravo7 objB = new Bravo7("bravo");
        // ����������� �������� ����:
        objB.show();
    }
}