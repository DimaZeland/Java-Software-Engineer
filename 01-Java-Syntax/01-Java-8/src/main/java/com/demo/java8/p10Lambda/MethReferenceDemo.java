package com.demo.java8.p10Lambda;

// ����� � ����� � ��������:
class MyClass2 {
    private int number;

    MyClass2(int n) {
        number = n;
    }

    void set(int n) {
        number = n;
    }

    int get() {
        return number;
    }
}

// ������ �������������� ���������:
interface MyGetter {
    int myget(MyClass2 obj);
}

// ������ �������������� ���������:
interface MySetter {
    void myset(MyClass2 obj, int n);
}

// ������� �����:
class MethReferenceDemo {
    public static void main(String[] args) {
        // ��������� ������:
        MyClass2 obj = new MyClass2(100);
        System.out.println("������ ������ � ����� 100");
        // ���������� ������ �� ������:
        MyGetter A = MyClass2::get;
        MySetter B = MyClass2::set;
        System.out.println("���������� A: " + A.myget(obj));
        System.out.println("���������� obj: " + obj.get());
        obj.set(200);
        System.out.println("���� ��������� �������� 200");
        System.out.println("���������� A: " + A.myget(obj));
        B.myset(obj, 300);
        System.out.println("��������� ������� B.myset(obj,300)");
        System.out.println("���������� A: " + A.myget(obj));
        System.out.println("���������� obj: " + obj.get());
        // ��������� ����� ������:
        obj = new MyClass2(400);
        System.out.println("������ ������ � ����� 400");
        System.out.println("���������� A: " + A.myget(obj));
        System.out.println("���������� obj: " + obj.get());
        B.myset(obj, 500);
        System.out.println("��������� ������� B.myset(obj,500)");
        System.out.println("���������� A: " + A.myget(obj));
        System.out.println("���������� obj: " + obj.get());
    }
}