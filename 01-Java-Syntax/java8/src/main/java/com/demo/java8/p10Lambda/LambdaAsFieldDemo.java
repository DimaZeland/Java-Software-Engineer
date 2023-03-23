package com.demo.java8.p10Lambda;

// �������������� ���������:
interface MyInterface1 {
    // ����� � ������������� ���������� ����������
    // ������������� ���������:
    int getNumber(int n);
}

// ����� � ����� ������������� ����:
class MyClass1 {
    // �������� ���� ������������� ����:
    private MyInterface1 ref;

    // �����������:
    MyClass1(MyInterface1 mi) {
        set(mi);
    }

    // ����� ��� ������������ �������� ����:
    void set(MyInterface1 mi) {
        ref = mi;
    }

    // ����� � ������������� ���������� ����������
    // ����������� ����� �����:
    int get(int n) {
        // ����� ������ �� �������, �� ������� ���������
        // ���� ������������� ����:
        return ref.getNumber(n);
    }
}

// ������� �����:
class LambdaAsFieldDemo {
    // ������� �����:
    public static void main(String[] args) {
        // �������� ������� ������ � ��������� ����������
        // ������������ ������-���������:
        MyClass1 obj = new MyClass1((int n) -> {
            return n * n;
        });
        // �������� ����������:
        System.out.println("��������:");
        for (int k = 0; k <= 5; k++) {
            System.out.print(k + "\t");
        }
        System.out.println("\n�������� � ��������:");
        for (int k = 0; k <= 5; k++) {
            System.out.print(obj.get(k) + "\t");
        }
        // ���� ������� ������������� ����� ��������:
        obj.set((int n) -> {
            return n * n * n;
        });
        // �������� ����������:
        System.out.println("\n�������� � ����:");
        for (int k = 0; k <= 5; k++) {
            System.out.print(obj.get(k) + "\t");
        }
        System.out.println("");
    }
}