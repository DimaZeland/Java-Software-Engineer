package com.demo.java8.p12Multithreading;

// ����� � ������������� �����:
class MyNumber {
    int number;
}

// ����� ��� �������� �������:
class MyThread3 extends Thread {
    // ������ �� ������ � ������������� �����:
    private MyNumber obj;
    // �������� ������������ � ���������� ������:
    private int time;
    // ���������� ������:
    private int count;
    // ���� ����������� ����:
    private boolean state;

    // �����������:
    MyThread3(String name, MyNumber obj, int time, int count, boolean state) {
        // ����� ������������ �����������:
        super(name);
        // ������ �� ������:
        this.obj = obj;
        // �������� ��������:
        this.time = time;
        // ���������� ������:
        this.count = count;
        // �������� ���� ����������� ����:
        this.state = state;
        // ������ ������:
        start();
    }

    // ����� ��� ����������� "�����" �� ��������:
    private void line() {
        // ��������� ���������� ����������:
        char s;
        // �������� ����������:
        if (state) s = '-';
        else s = '*';
        // ����������� ������������������ ��������:
        for (int k = 1; k <= 35; k++) {
            System.out.print(s);
        }
        System.out.println("");
    }

    // ��������������� ������ run():
    public void run() {
        // �������� �����:
        for (int k = 1; k <= count; k++) {
            // ���� �������������:
            synchronized (obj) {
                // ������������ "�����":
                line();
                // ����������� ���������:
                System.out.println("����� " + getName() + ": �������� �������� " + obj.number);
                // �������������� ���:
                try {
                    // �������� � ���������� ������:
                    Thread.sleep(time);
                } // ��������� ����������:
                catch (InterruptedException e) {
                    System.out.println(e);
                }
                // ��������� �������� ���� �������:
                if (state) obj.number++;
                else obj.number--;
                // ����������� ���������:
                System.out.println("����� " + getName() + ": ����� �������� " + obj.number);
                // ����������� "�����":
                line();
            } // ���������� ����� �������������
        }
    }
}

// ������� �����:
class SynchronizedThreadsDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ������������� ����������:
        int n = 100, count = 5, time = 1000, dt = 200;
        // �������� ������� � ������������� �����:
        MyNumber obj = new MyNumber();
        // ������������ ���� ������� ��������:
        obj.number = n;
        // �������� ������� ������:
        MyThread3 Alpha = new MyThread3("Alpha", obj, time + dt, count, true);
        // �������� ������� ������:
        MyThread3 Bravo = new MyThread3("Bravo", obj, time - dt, count, false);
        // �������������� ���:
        try {
            // �������� ���������� �������:
            if (Alpha.isAlive()) Alpha.join();
            if (Bravo.isAlive()) Bravo.join();
        } // ��������� ����������:
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}