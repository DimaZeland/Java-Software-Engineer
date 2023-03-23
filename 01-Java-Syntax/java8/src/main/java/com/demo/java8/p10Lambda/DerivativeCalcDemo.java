package com.demo.java8.p10Lambda;

// �������������� ���������:
interface MyFunction {
    // ����� � ���������� ���� double ����������
    // ����������� �������� ���� double:
    double f(double x);
}

// ������� �����:
class DerivativeCalcDemo {
    // ����������� ����� ��� ���������� �����������:
    static MyFunction Derivative(MyFunction ref) {
        // ���������� �� ��������� ��� ����������
        // ����������� � �����:
        double dx = 1e-5;
        // ��������� ������ - ������-���������:
        return (double x) -> {
            return (ref.f(x + dx) - ref.f(x)) / dx;
        };
    }

    // ������� �����:
    public static void main(String[] args) {
        // ����������� ��� ������ �������:
        MyFunction A = Derivative((double x) -> {
            return x * (3 - x);
        });
        // ����������� ��� ������ �������:
        MyFunction B = Derivative((double x) -> {
            return x * Math.exp(-x);
        });
        // �������� ����������� ����������:
        System.out.println("����������� ��� ������ �������");
        System.out.println("���������:\t�����:");
        for (double t = 0; t <= 5; t++) {
            System.out.printf("%8.5f\t%8.5f\n", A.f(t), (3 - 2 * t));
        }
        System.out.println("����������� ��� ������ �������");
        System.out.println("���������:\t�����:");
        for (double t = 0; t <= 5; t++) {
            System.out.printf("%8.5f\t%8.5f\n", B.f(t), Math.exp(-t) * (1 - t));
        }
    }
}