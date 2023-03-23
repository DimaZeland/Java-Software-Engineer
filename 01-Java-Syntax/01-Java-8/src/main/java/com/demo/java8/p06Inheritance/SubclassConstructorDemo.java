package com.demo.java8.p06Inheritance;

// ����������:
class Alpha4 {
    // ��������� ����:
    String name;
    // ������������� ����:
    int code;

    // ����������� � ����� �����������:
    Alpha4(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("����� Alpha4:");
        System.out.println("���� name - " + this.name);
        System.out.println("���� code - " + this.code);
    }

    // ����������� � ����� ��������� ����������:
    Alpha4(String name) {
        // ����� ������������ � ����� �����������:
        this(name, 0);
    }

    // ����������� � ����� ������������� ����������:
    Alpha4(int code) {
        // ����� ������������ � ����� �����������:
        this("�����", code);
    }

    // ����������� ��� ����������:
    Alpha4() {
        this("������", 1);
    }
}

// ��������:
class Bravo4 extends Alpha4 {
    // ���������� ����:
    char symbol;

    // �������� ����� ��� ����������� ��������
    // ����������� ����:
    private void show() {
        System.out.println("����� Bravo4:");
        // ����������� �������� ����������� ����:
        System.out.println("���� symbol - " + this.symbol);
        // ����������� "�������������� �����":
        for (int k = 1; k <= 18; k++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    // ����������� � ����� �����������:
    Bravo4(String name, int code, char symbol) {
        // ����� ������������ �����������
        // � ����� �����������:
        super(name, code);
        // ������������ ����������� ���� ��������:
        this.symbol = symbol;
        // ����� ��������� ������:
        show();
    }

    // ����������� � ����� ���������� ����������:
    Bravo4(char symbol) {
        // ����� ������������ ����������� ��� ����������:
        super();
        // ������������ ����������� ���� ��������:
        this.symbol = symbol;
        // ����� ��������� ������:
        show();
    }

    // ����������� � ����� ��������� ����������:
    Bravo4(String name) {
        // ����� ������������ �����������
        // � ����� ��������� ����������:
        super(name);
        // ������������ ����������� ���� ��������:
        this.symbol = 'A';
        // ����� ��������� ������:
        show();
    }

    // ����������� � ����� ������������� ����������:
    Bravo4(int code) {
        // ����� ������������ �����������
        // � ����� ������������� ����������:
        super(code);
        // ������������ ����������� ���� ��������:
        this.symbol = 'B';
        // ����� ��������� ������:
        show();
    }

    // ����������� ��� ����������:
    Bravo4() {
        // ������� ������ ���������� �����������
        // ����������� ��� ����������.
        // ������������ �������� ����������� ����:
        this.symbol = 'C';
        // ����� ��������� ������:
        show();
    }

    // ����������� � ����� �����������:
    Bravo4(String name, int code) {
        // ����� ������������ ��������� � ����� �����������:
        this(name, code, 'D');
    }
}

// ����� � ������� ������� ���������:
class SubclassConstructorDemo {
    public static void main(String[] args) {
        // ��������� ���������� ���������:
        Bravo4 obj;
        // ������ ������� �������� ������� ���������:
        obj = new Bravo4();
        obj = new Bravo4("�������");
        obj = new Bravo4(100);
        obj = new Bravo4("�������", 200);
        obj = new Bravo4('Y');
        obj = new Bravo4("�����", 300, 'Z');
    }
}