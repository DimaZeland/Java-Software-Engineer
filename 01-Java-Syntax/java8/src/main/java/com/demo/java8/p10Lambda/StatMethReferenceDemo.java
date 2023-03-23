package com.demo.java8.p10Lambda;

// ����� �� ������������ ��������:
class MyClass5 {
    // ������� ������������ ���������:
    static void show() {
        System.out.println("����� ������ MyClass5");
    }

    // ������� ����������� ����� �����:
    static int sum(int n) {
        int k, s = 0;
        for (k = 1; k <= n; k++) {
            s += k;
        }
        return s;
    }
}

// ������ ���������:
interface MyShow {
    void myshow();
}

// ������ ���������:
interface MySum {
    int mysum(int n);
}

// ������ ���������:
interface MyPrinter {
    void myprint(Object t);
}

// ������� �����:
class StatMethReferenceDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ������������� ������ �� ����������� ������:
        MyShow A = MyClass5::show;
        MySum B = MyClass5::sum;
        MyPrinter P = System.out::println;
        // ����� ������� �� ������������ ����������:
        A.myshow();
        P.myprint("����� �����: " + B.mysum(10));
    }
}