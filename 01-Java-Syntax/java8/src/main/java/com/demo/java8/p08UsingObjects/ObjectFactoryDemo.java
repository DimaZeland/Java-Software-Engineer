package com.demo.java8.p08UsingObjects;


// ����������� ����������:
abstract class Base3 {
    // ���������� ������������ ������:
    abstract void show();
}

// ����������� ������:
class Alpha extends Base3 {
    void show() {
        System.out.println("������ ������ Alpha");
    }
}

class Bravo extends Base3 {
    void show() {
        System.out.println("������ ������ Bravo");
    }
}

class Charlie extends Base3 {
    void show() {
        System.out.println("������ ������ Charlie");
    }
}

// ������� �����:
class ObjectFactoryDemo {
    // ����������� ����� ��� �������� ��������
    // ������ �������:
    static Base3 createObject(int n) {
        if (n == 1) return new Alpha();
        if (n == 2) return new Bravo();
        return new Charlie();
    }

    // ������� ����� ���������:
    public static void main(String[] args) {
        // ��������� ���������� ������������ �����������:
        Base3 obj;
        for (int k = 1; k <= 3; k++) {
            // �������� �������:
            obj = createObject(k);
            // ����� �� ������� ������:
            obj.show();
        }
    }
}