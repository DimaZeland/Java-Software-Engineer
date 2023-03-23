package com.demo.java8.p08UsingObjects;


class MyClass5 {
    int number;

    MyClass5(int n) {
        number = n;
    }
}

class SwapObjectsDemo {
    static void swap(MyClass5 A, MyClass5 B) {
        System.out.println("����������� ����� swap()");
        System.out.println("������ A: " + A.number);
        System.out.println("������ B: " + B.number);
        // ��������� "������������" ����������:
        MyClass5 X = B;
        B = A;
        A = X;
        System.out.println("�������� ���������� ��������");
        System.out.println("������ A: " + A.number);
        System.out.println("������ B: " + B.number);
        System.out.println("��������� ���������� ������ swap()");
    }

    public static void main(String[] args) {
        MyClass5 A = new MyClass5(100);
        MyClass5 B = new MyClass5(200);
        System.out.println("�� ������ ������ swap(): A.number=" + A.number + " � B.number=" + B.number);
        swap(A, B);
        System.out.println("����� ������ ������ swap(): A.number=" + A.number + " � B.number=" + B.number);
    }
}