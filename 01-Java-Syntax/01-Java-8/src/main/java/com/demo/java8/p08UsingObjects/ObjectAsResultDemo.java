package com.demo.java8.p08UsingObjects;


// �����:
class MyClass3 {
    // �������� ����:
    private int code;
    private String name;

    // �����������:
    MyClass3(int n, String s) {
        System.out.println("�������� �������:");
        // ������������ �������� ����� �
        // ����������� ���� ��������:
        set(n, s).show();
    }

    // ����� ��� ������������ �������� �������������� ����,
    // ������������ ����������� ������ �� ������:
    MyClass3 set(int n) {
        // ������������ �������� �������������� ����:
        code = n;
        // ��������� ������:
        return this;
    }

    // ����� ��� ������������ �������� ���������� ����,
    // ������������ ����������� ������ �� ������:
    MyClass3 set(String s) {
        // ������������ �������� ���������� ����:
        name = s;
        // ��������� ������:
        return this;
    }

    // ����� ��� ������������ �������� �����,
    // ������������ ����������� ������ �� ������:
    MyClass3 set(int n, String s) {
        // ������������ �������� ����� � ��������� ������:
        return set(n).set(s);
    }

    // ����� ��� ����������� �������� �����:
    void show() {
        System.out.println("���� code=" + code);
        System.out.println("���� name=" + name);
        System.out.println("-----------------");
    }
}

// ������� �����:
class ObjectAsResultDemo {
    // ����������� ����� ��� �������� �������:
    static MyClass3 createObject(int n, String s) {
        // ��������� ������:
        return new MyClass3(n, s);
    }

    // ������� ����� ���������:
    public static void main(String[] args) {
        // �������� �������:
        MyClass3 obj = createObject(100, "alpha");
        // ��������� �������� �������������� ���� �
        // ����������� �������� ����� �������:
        obj.set(200).show();
        // ��������� �������� ���������� ���� �
        // ����������� �������� ����� �������:
        obj.set("bravo").show();
        // ����������� �������� �����:
        obj.show();
        // �������� �������, ��������� �������� ��� �����
        // � ����� ������ ��� ����������� �������� �����:
        createObject(300, "charlie").set(400, "delta").show();
    }
}