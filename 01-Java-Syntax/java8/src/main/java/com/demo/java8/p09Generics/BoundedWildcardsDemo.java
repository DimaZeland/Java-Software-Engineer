package com.demo.java8.p09Generics;

// ������ �����:
class Alpha {
    // �������� ��������� ����:
    private String name;

    // �����������:
    Alpha(String txt) {
        name = txt;
    }

    // ��������������� ������ toString():
    public String toString() {
        return name;
    }
}

// ������ �����:
class Bravo extends Alpha {
    // �����������:
    Bravo(String txt) {
        // ����� ������������ �����������:
        super(txt);
    }
}

// ������ �����:
class Charlie extends Bravo {
    Charlie(String txt) {
        super(txt);
    }
}

// ��������� �����:
class Delta extends Charlie {
    Delta(String txt) {
        super(txt);
    }
}

// ����� �����:
class Echo extends Delta {
    Echo(String txt) {
        super(txt);
    }
}

// ���������� �����:
class MyClass<T> {
    // �������� ���� ����������� ����:
    private T obj;

    // ��������������� ������ toString():
    public String toString() {
        return obj.toString();
    }

    // �����������:
    MyClass(T arg) {
        obj = arg;
    }
}

// ������� �����:
class BoundedWildcardsDemo {
    // ����������� ����� ��� ����������� ����������
    // ������������� �������, ���������� � ��������������
    // ��������� ��� ������ Charlie:
    static void show(MyClass<? extends Charlie> obj) {
        System.out.println(obj);
    }

    // ����������� ����� ��� ����������� ����������
    // ������������� �������, ���������� � ��������������
    // ����������� ��� ������ Charlie:
    static void display(MyClass<? super Charlie> obj) {
        System.out.println(obj);
    }

    // ������� �����:
    public static void main(String[] args) {
        // �������� ��������:
        MyClass<Alpha> A = new MyClass<>(new Alpha("������ A"));
        MyClass<Bravo> B = new MyClass<>(new Bravo("������ B"));
        MyClass<Charlie> C = new MyClass<>(new Charlie("������ C"));
        MyClass<Delta> D = new MyClass<>(new Delta("������ D"));
        MyClass<Echo> E = new MyClass<>(new Echo("������ E"));
        // ����� ������� display() � show() � ���������
        // ���������� ������ �� ��������� ��������:
        display(A);
        display(B);
        display(C);
        show(C);
        show(D);
        show(E);
    }
}