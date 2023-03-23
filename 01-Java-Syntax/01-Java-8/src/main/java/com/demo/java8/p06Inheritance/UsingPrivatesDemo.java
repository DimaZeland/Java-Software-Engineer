package com.demo.java8.p06Inheritance;

// ����������:
class Alpha6 {
    // �������� ����:
    private int code;

    // �������� ����� ��� ������������ ��������
    // ��������� ����:
    public void set(int code) {
        this.code = code;
    }

    // �������� ����� ��� ����������� ��������
    // ��������� ����:
    public void show() {
        System.out.println("���� code: " + code);
    }

    // ����������� ������:
    Alpha6(int code) {
        set(code);
    }
}

// ��������:
class Bravo6 extends Alpha6 {
    // ����������� ���������:
    Bravo6(int code) {
        // ����� ������������ �����������:
        super(code);
    }
}

// ����� � ������� ������� ���������:
class UsingPrivatesDemo {
    public static void main(String[] args) {
        // �������� ������� ���������:
        Bravo6 obj = new Bravo6(100);
        // �������� �������� ����:
        obj.show();
        // ������������ �������� ����:
        obj.set(200);
        // ����������� �������� ����:
        obj.show();
    }
}