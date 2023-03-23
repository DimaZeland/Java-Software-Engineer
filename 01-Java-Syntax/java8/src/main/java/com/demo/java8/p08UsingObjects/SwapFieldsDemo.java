package com.demo.java8.p08UsingObjects;

// ����� ��� �������� ��������:
class MyClass4 {
    // ������������� ����:
    int number;

    // �����������:
    MyClass4(int n) {
        number = n;
    }
}

// ����� �� ����������� ������� swap() � �������
// ������� ���������:
class SwapFieldsDemo {
    // ����������� ����� � ����� �����������, �����������
    // ��������� ������ MyClass4:
    static void swap(MyClass4 A, MyClass4 B) {
        System.out.println("����������� ����� swap()");
        // �������� ���� number ��������, ����������
        // ����������� ������:
        System.out.println("������ A: " + A.number);
        System.out.println("������ B: " + B.number);
        // ������� "������������" ���������� �����:
        int number = B.number;
        B.number = A.number;
        A.number = number;
        // �������� ���� number ��������, ����������
        // ����������� ������ swap()
        // (����� "������" ���������� �����):
        System.out.println("�������� ����� ��������");
        System.out.println("������ A: " + A.number);
        System.out.println("������ B: " + B.number);
        System.out.println("��������� ���������� ������ swap()");
    }

    // ������� ����� ���������:
    public static void main(String[] args) {
        // �������� ��������:
        MyClass4 A = new MyClass4(100);
        MyClass4 B = new MyClass4(200);
        // �������� ���� number �������� A � B ��
        // ������ ������ swap():
        System.out.println("�� ������ ������ swap(): A.number=" + A.number + " � B.number=" + B.number);
        // ����� ������ swap():
        swap(A, B);
        // �������� ���� number �������� A � B �����
        // ������ ������ swap():
        System.out.println("����� ������ ������ swap(): A.number=" + A.number + " � B.number=" + B.number);
    }
}