package com.demo.java8.p09Generics;

// ���������� ����� � ����� ����������:
class Alpha5<X> {
    // �������� ���� ����������� ����:
    private X first;

    // ����������� � ���������� ����������� ����:
    Alpha5(X first) {
        // ����� ������ � ���������� ����������� ����:
        set(first);
    }

    // ����� � ���������� ����������� ����
    // ��� ������������ �������� ����:
    void set(X first) {
        this.first = first;
    }

    // ����� ���������� ����������� �������� ����:
    X get() {
        return first;
    }
}

// ���������� ����� � ����� �����������:
class Bravo5<X, Y> {
    // ���� - ������ ����������� ������:
    Alpha5<X> obj;
    // ���� ����������� ����:
    Y second;

    // ����������� � ����� ����������� ����������� ����:
    Bravo5(X first, Y second) {
        // �������� ������� �� ������ ����������� ������:
        obj = new Alpha5<X>(first);
        // ������������ �������� ����:
        this.second = second;
    }

    // ����� ��� ����������� �������� �����:
    void show() {
        System.out.println("�������� " + obj.get() + " � " + second);
    }
}

// ������� �����:
class UsingGenericsDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ������� �� ������ ����������� ������:
        Bravo5<Integer, Character> A = new Bravo5<Integer, Character>(100, 'A');
        // ����������� �������� ����� �������:
        A.show();
        // �������� ������� �� ������ ����������� ������:
        Bravo5<String, Double> B = new Bravo5<>("Bravo5", 12.345);
        // ����������� �������� ����� �������:
        B.show();
    }
}