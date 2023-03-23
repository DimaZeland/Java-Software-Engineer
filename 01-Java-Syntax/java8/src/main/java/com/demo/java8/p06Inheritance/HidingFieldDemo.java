package com.demo.java8.p06Inheritance;

// ����������:
class Alpha {
    // ��������� ����:
    String name;
}

// ��������:
class Bravo extends Alpha {
    // ��������� ����:
    String name;

    // ����� ��� ����������� �������� �����:
    void show() {
        // �������� ��������������� �� ����������� ����:
        System.out.println("�� ������ Alpha: " + super.name);
        // �������� ���������� � ��������� ����:
        System.out.println("�� ������ Bravo: " + name);
    }

    // �����������:
    Bravo(String a, String b) {
        // ����� ������������ (�� ���������) �����������:
        super();
        // �������� ��������������� �� ����������� ����:
        super.name = a;
        // �������� ���������� � ��������� ����:
        name = b;
    }
}

// ������� �����:
class HidingFieldDemo {
    public static void main(String[] args) {
        // �������� ������� ���������:
        Bravo obj = new Bravo("alpha", "bravo");
        // �������� �������� �����:
        obj.show();
    }
}