package com.demo.java8.p07AbstractClasses;

// ��������� � �������, ������� ��� �� ���������:
interface Base1 {
    // ����� � ����� �� ���������:
    default void show(String txt) {
        System.out.println("��������� Base: " + txt);
    }

    // ���������� ������:
    void hello();
}

// ����� ��������� ��������� Base:
class Alpha implements Base1 {
    // �������� �������� ������:
    public void hello() {
        System.out.println("������ ������ Alpha");
    }

    // �������� ������ � ����� �� ���������:
    public void show(String txt) {
        System.out.println("����� Alpha: " + txt);
    }
}

// ����� ��������� ��������� Base:
class Bravo implements Base1 {
    // �������� �������� ������:
    public void hello() {
        System.out.println("������ ������ Bravo");
    }
}

// ������� �����:
class UsingDefaultMethodsDemo {
    public static void main(String[] args) {
        // ������������ ����������:
        Base1 ref;
        // ������ ������ Alpha:
        Alpha objA = new Alpha();
        // ����� ������� ����� ��������� ����������:
        objA.hello();
        objA.show("��������� ���������� objA");
        // ������������ ���������� ������������� ������
        // �� ������ ������ Alpha:
        ref = objA;
        // ����� ������ ����� ������������ ����������:
        ref.show("������������ ���������� ref");
        // ������ ������ Bravo:
        Bravo objB = new Bravo();
        // ����� ������� ����� ��������� ����������:
        objB.hello();
        objB.show("��������� ���������� objB");
        // ������������ ���������� ������������� ������
        // �� ������ ������ Bravo:
        ref = objB;
        // ����� ������ ����� ������������ ����������:
        ref.show("������������ ���������� ref");
    }
}