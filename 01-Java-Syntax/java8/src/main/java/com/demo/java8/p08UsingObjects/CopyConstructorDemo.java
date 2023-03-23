package com.demo.java8.p08UsingObjects;


// ����������:
class Base1 {
    // ��������� ����:
    String name;

    // ����������� � ��������� ����������:
    Base1(String txt) {
        name = txt;
    }

    // ����������� �������� �����:
    Base1(Base1 obj) {
        name = obj.name;
    }
}

// ��������:
class MyClass1 extends Base1 {
    // ������������� ����:
    int code;

    // ����������� � ��������� � ������������� �����:
    MyClass1(String txt, int n) {
        // ����� ������������ �����������:
        super(txt);
        // ������������ �������� �������������� ����:
        code = n;
    }

    // ����������� �������� �����:
    MyClass1(MyClass1 obj) {
        // ����� ������������ �����������:
        super(obj);
        // ������������ �������� �������������� ����:
        code = obj.code;
    }

    // ����� ��� ����������� �������� �����:
    void show() {
        // �������� ���������� ����:
        System.out.println("��������� ����: " + name);
        // �������� �������������� ����:
        System.out.println("������������� ����: " + code);
    }
}

// ������� �����:
class CopyConstructorDemo {
    public static void main(String[] args) {
        // �������� ������� � ������� ������������
        // � ����� �����������:
        MyClass1 A = new MyClass1("������", 200);
        // �������� ������� � ������� ������������
        // �������� �����:
        MyClass1 B = new MyClass1(A);
        // ��������� �������� ����� ������� �������:
        A.name = "�������";
        A.code = 100;
        // �������� ������� � ������� ������������
        // �������� ����� (�������� - ��������� ������):
        MyClass1 C = new MyClass1(new MyClass1("�������", 300));
        // ����������� �������� �����:
        System.out.println("������ A");
        A.show();
        System.out.println("������ B");
        B.show();
        System.out.println("������ C");
        C.show();
    }
}