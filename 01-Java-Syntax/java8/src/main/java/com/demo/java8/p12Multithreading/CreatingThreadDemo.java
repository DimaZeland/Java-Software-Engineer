package com.demo.java8.p12Multithreading;

// ����� ��������� ��������� Runnable:
class MyThread implements Runnable {
    // �������� ������ run() (����������� ��� ��� ������):
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // ����������� ���������:
            System.out.println("�������� �����:\t" + i);
            try {
                // �������� � ���������� ������:
                Thread.sleep(1200);
            } // ��������� ����������:
            catch (InterruptedException e) {
                System.out.println("���������� ��������� ������");
            }
        }
    }
}

// ������� �����:
class CreatingThreadDemo {
    // ������� �����:
    public static void main(String[] args) {
        System.out.println("���������� ���������� ���������");
        // �������� ������� ������ Thread ��� �������
        // ��������� ������ �� ����������:
        Thread t = new Thread(new MyThread());
        System.out.println("����������� �������� �����");
        // ������ ��������� ������:
        t.start();
        for (int k = 0; k <= 5; k++) {
            // ����������� ���������:
            System.out.println("������� �����:\t" + (char) ('A' + k));
            try {
                // �������� � ���������� �������� ������:
                Thread.sleep(2000);
            } // ��������� ����������:
            catch (InterruptedException e) {
                System.out.println("���������� �������� ������");
            }
        }
        System.out.println("���������� ��������� ���������");
    }
}