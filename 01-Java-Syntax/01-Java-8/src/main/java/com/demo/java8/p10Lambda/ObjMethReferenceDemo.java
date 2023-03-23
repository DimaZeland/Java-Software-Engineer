package com.demo.java8.p10Lambda;

// �����:
class MyClass3 {
    // �������� ������������� ����:
    private int number;

    // �����������:
    MyClass3(int n) {
        number = n;
    }

    // ����� ��� ������������ �������� ����:
    void set(int n) {
        number = n;
    }

    // ����� ��� ���������� �������� ����:
    int get() {
        return number;
    }
}

// ������ �������������� ���������:
interface MyGetter3 {
    int myget();
}

// ������ �������������� ���������:
interface MySetter3 {
    void myset(int n);
}

// ������� �����:
class ObjMethReferenceDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� �������:
        MyClass3 obj = new MyClass3(100);
        System.out.println("������ ������ � ����� 100");
        // ���������� ������ �� ������:
        MyGetter3 A = obj::get;
        MySetter3 B = obj::set;
        // ��������� "�������� ����" ������� ������ myget()
        // �� ������������ ���������� A:
        System.out.println("���������� A: " + A.myget());
        // ��������� �������� ���� �������:
        System.out.println("���������� obj: " + obj.get());
        // ���� ������� ������������� ��������:
        obj.set(200);
        System.out.println("���� ��������� �������� 200");
        // ��������� "�������� ����" ������� ������ myget()
        // �� ������������ ���������� A:
        System.out.println("���������� A: " + A.myget());
        // ����������� "�������� ����" ������� ������ myset()
        // �� ������������ ���������� B:
        B.myset(300);
        System.out.println("��������� ������� B.myset(300)");
        // ��������� "�������� ����" ������� ������ myget()
        // �� ������������ ���������� A:
        System.out.println("���������� A: " + A.myget());
        // ��������� �������� ���� �������:
        System.out.println("���������� obj: " + obj.get());
        // ��������� ����� ������:
        obj = new MyClass3(400);
        System.out.println("������ ������ � ����� 400");
        // ��������� "�������� ����" ������� ������ myget()
        // �� ������������ ���������� A:
        System.out.println("���������� A: " + A.myget());
        // ��������� �������� ���� �������:
        System.out.println("���������� obj: " + obj.get());
        // ����������� "�������� ����" ������� ������ myset()
        // �� ������������ ���������� B:
        B.myset(500);
        System.out.println("��������� ������� B.myset(500)");
        // ��������� "�������� ����" ������� ������ myget()
        // �� ������������ ���������� A:
        System.out.println("���������� A: " + A.myget());
        // ��������� �������� ���� �������:
        System.out.println("���������� obj: " + obj.get());
    }
}