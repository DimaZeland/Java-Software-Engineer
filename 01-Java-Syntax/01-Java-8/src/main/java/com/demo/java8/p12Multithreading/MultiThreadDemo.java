package com.demo.java8.p12Multithreading;

// ������ ������ Random:

import java.util.Random;

// �������� MyThread2 ��������� �������������
// ����������� Thread:
class MyThread2 extends Thread {
    // ���������� ���������:
    private int count;

    // �����������:
    MyThread2(String name, int count) {
        // ����� ������������ �����������:
        super(name);
        // �������� �������������� ����:
        this.count = count;
        // ������ ������ �� ����������:
        start();
    }

    // ��������������� ������ run():
    public void run() {
        // ����������� ��������� � ������� ������:
        System.out.println("����������� ����� " + getName());
        // �������� ������� ������ Random
        // ��� ������������� ��������� �����:
        Random rnd = new Random();
        // �������� �����, � ������� ��������� ���������:
        for (int k = 1; k <= count; k++) {
            System.out.println("��������� �� ������ " + getName() + ":\t" + getName().charAt(0) + k);
            try {
                // �������� � ���������� ������:
                Thread.sleep(1000 + rnd.nextInt(2001));
            } catch (InterruptedException e) {
                System.out.println("���������� ������ " + getName());
            }
        }
        // ��������� � ���������� ���������� ������:
        System.out.println("����� " + getName() + " ��������");
    }
}

// ������� �����:
class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("�������� ����������� ������� �����");
        // �������� �������� - ������ �������:
        MyThread2 A = new MyThread2("ALPHA", 5);
        MyThread2 B = new MyThread2("BRAVO", 3);
        MyThread2 C = new MyThread2("CHARLIE", 7);
        // ��������� �������� ������:
        for (int k = 1; k <= 4; k++) {
            System.out.println("��������� �� �������� ������:\t" + k);
            // �������� � ���������� ������:
            Thread.sleep(2000);
        }
        // �������� ���������� �������� �������:
        if (A.isAlive()) {
            A.join();
        }
        if (B.isAlive()) {
            B.join();
        }
        if (C.isAlive()) {
            C.join();
        }
        // ��������� � ���������� �������� ������:
        System.out.println("������� ����� ��������");
    }
}