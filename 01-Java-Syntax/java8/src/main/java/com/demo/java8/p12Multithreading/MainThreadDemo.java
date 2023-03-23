package com.demo.java8.p12Multithreading;

class MainThreadDemo {
    public static void main(String[] args) {
        // ��������� ���������� ��� ������ ������ �� �����:
        Thread t;
        // ��������� ������ �� ������ �������� ������:
        t = Thread.currentThread();
        // ����������� ���������� � ������:
        System.out.println(t);
        // ��������� ����� ������:
        t.setName("������� �����");
        // �������� �������������� ������:
        t.setPriority(7);
        // ����������� ���������� � ������:
        System.out.println(t);
    }
}