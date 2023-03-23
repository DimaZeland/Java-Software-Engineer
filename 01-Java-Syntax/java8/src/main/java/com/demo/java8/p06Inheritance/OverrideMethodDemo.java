package com.demo.java8.p06Inheritance;

// ����������:
class Alpha3 {
    // ��������� ����:
    String name;

    // ����� ��� ����������� �������� ���������� ����:
    void show() {
        System.out.println("������ ������ Alpha:");
        System.out.println("���� name - " + name);
    }

    // ����������� ������:
    Alpha3(String name) {
        this.name = name;
    }
}

// ��������:
class Bravo3 extends Alpha3 {
    // ������������� ����:
    int code;

    // ��������������� ������. ����� ������� ������
    // ������������ �������� ���� �����:
    void show() {
        System.out.println("������ ������ Bravo:");
        System.out.println("���� name - " + name);
        System.out.println("���� code - " + code);
    }

    // ����������� ������:
    Bravo3(String name, int code) {
        // ����� ������������ �����������:
        super(name);
        this.code = code;
    }
}

// ������� �����:
class OverrideMethodDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ������� �����������:
        Alpha3 objA = new Alpha3("objA");
        // �������� ������� ���������:
        Bravo3 objB = new Bravo3("objB", 123);
        // ����� ������ �� ������� �����������:
        objA.show();
        // ����� ������ �� ������� ���������:
        objB.show();
    }
}