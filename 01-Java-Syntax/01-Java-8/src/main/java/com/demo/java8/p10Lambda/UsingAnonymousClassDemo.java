package com.demo.java8.p10Lambda;

// ���������:
interface MyNums {
    default void show(int n) {
        System.out.println("��������: " + n);
        System.out.println("���������: " + get(n));
    }

    int get(int n);
}

class UsingAnonymousClassDemo {
    public static void main(String[] args) {
        // ������������ ������������ ���������� ������
        // �� ������ ���������� ������:
        MyNums A = new MyNums() {
            // �������� ������ �� ����������:
            public int get(int n) {
                int k, s = 0;
                for (k = 1; k <= n; k++) {
                    s += k;
                }
                return s;
            }
        };
        System.out.println("���������� ��������� �����:");
        A.show(10);
        System.out.println("��������: " + A.get(10));
        MyNums B = A;
        System.out.println("����� ��������� �����:");
        // ��������� ��������� ������������� ������
        // �� ������ ������ ���������� ������:
        A = new MyNums() {
            // �������� ������ �� ����������:
            public int get(int n) {
                return n * n;
            }
        };
        System.out.println("����� ������ show() �� A:");
        A.show(10);
        System.out.println("����� ������ show() �� B:");
        B.show(10);
    }
}