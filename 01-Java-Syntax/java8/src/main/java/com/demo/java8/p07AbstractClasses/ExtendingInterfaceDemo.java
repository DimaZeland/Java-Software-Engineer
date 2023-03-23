package com.demo.java8.p07AbstractClasses;

// ����������� ���������:
interface First1 {
    // ����� � ����� �� ���������:
    default void alpha() {
        System.out.println("��������� First: ����� alpha()");
    }

    // ����� � ����� �� ���������:
    default void bravo() {
        System.out.println("��������� First: ����� bravo()");
    }

    // ����� � ����� �� ���������:
    default void charlie() {
        System.out.println("��������� First: ����� charlie()");
    }

    // ����� ��� ���� �� ���������:
    void delta();
}

// ���������-���������:
interface Second1 extends First1 {
    // ���������� ������:
    void bravo();

    // ����� � ����� �� ���������:
    default void charlie() {
        System.out.println("��������� Second: ����� charlie()");
    }

    // ���������� ������:
    void echo();
}

// ����� ��������� ���������:
class MyClass1 implements Second1 {
    // �������� �������:
    public void bravo() {
        System.out.println("����� MyClass: ����� bravo()");
    }

    public void delta() {
        System.out.println("����� MyClass: ����� delta()");
    }

    public void echo() {
        System.out.println("����� MyClass: ����� echo()");
    }
}

// ������� �����:
class ExtendingInterfaceDemo {
    public static void main(String[] args) {
        // �������� �������:
        MyClass1 obj = new MyClass1();
        // ����� �������:
        obj.alpha();
        obj.bravo();
        obj.charlie();
        obj.delta();
        obj.echo();
    }
}