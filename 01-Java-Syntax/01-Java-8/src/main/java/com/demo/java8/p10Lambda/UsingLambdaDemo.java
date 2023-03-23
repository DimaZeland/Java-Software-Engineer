package com.demo.java8.p10Lambda;

// �������������� ���������:
interface MyNums1 {
    // ����� � ����� �� ���������:
    default void show(int n) {
        System.out.println("��������: " + n);
        System.out.println("���������: " + get(n));
    }

    // ����������� �����:
    int get(int n);
}

// ������� �����:
class UsingLambdaDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ������������ ������-��������� ���������
        // ���������� ������������� ����:
        MyNums1 A = (int n) -> {
            // ��������� ����������:
            int k, s = 0;
            // ���������� ����� ����������� �����:
            for (k = 1; k <= n; k++) {
                s += k;
            }
            // ���������:
            return s;
        };
        System.out.println("���������� ������-���������:");
        // ����� ������� �� ������������ ����������:
        A.show(10);
        System.out.println("��������: " + A.get(10));
        // �������������� ������ �� ������:
        MyNums1 B = A;
        System.out.println("����� ������-���������:");
        // ������������ ��������� ��������� �������������
        // ����� ������-���������:
        A = n -> n * n;
        System.out.println("����� ������ show() �� A:");
        A.show(10);
        System.out.println("����� ������ show() �� B:");
        B.show(10);
    }
}