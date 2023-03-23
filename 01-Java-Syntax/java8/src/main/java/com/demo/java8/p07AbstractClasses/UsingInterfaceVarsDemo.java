package com.demo.java8.p07AbstractClasses;

// ���������:
interface Base2 {
    // ���������� ������:
    void show();
}

// ����� ��������� ��������� Base:
class Alpha2 implements Base2 {
    // ��������� ����:
    String word;

    // �����������:
    Alpha2(String txt) {
        word = txt;
    }

    // �������� ������ �� ����������:
    public void show() {
        System.out.println("������ ������ Alpha");
        System.out.println("��������� ����: " + word);
    }
}

// ����� ��������� ��������� Base:
class Bravo2 implements Base2 {
    // ������������� ����:
    int number;

    // �����������:
    Bravo2(int n) {
        number = n;
    }

    // �������� ������ �� ����������:
    public void show() {
        System.out.println("������ ������ Bravo");
        System.out.println("������������� ����: " + number);
    }
}

// ������� �����:
class UsingInterfaceVarsDemo {
    public static void main(String[] args) {
        // ������������ ����������:
        Base2 ref;
        // ������ ������ Alpha:
        ref = new Alpha2("�����");
        ref.show();
        // ������ ������ Bravo:
        ref = new Bravo2(123);
        ref.show();
    }
}