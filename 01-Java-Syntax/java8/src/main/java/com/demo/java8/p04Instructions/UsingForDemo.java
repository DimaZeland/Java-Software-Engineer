package com.demo.java8.p04Instructions;

class UsingForDemo {
    // ������� ����� ���������:
    public static void main(String[] args) {
        // ������������� ����������:
        int s = 0, k, n = 10;
        // ���������� ����� ��������� ����������� �����:
        for (k = 1; k <= n; k++) {
            s += k * k;
        }
        // ����� ��� ����������� � ���� ������:
        String txt = "����� ��������� ����� �� 1 �� " + n + ": " + s;
        // ����������� ���������� ����������:
        System.out.println(txt);
    }
}