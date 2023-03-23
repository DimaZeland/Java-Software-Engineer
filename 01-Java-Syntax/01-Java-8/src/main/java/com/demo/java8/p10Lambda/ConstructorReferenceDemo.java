package com.demo.java8.p10Lambda;

// �����:
class MyClass {
    // �������� ����:
    private int number;

    // �����������:
    MyClass(int n) {
        number = n;
    }

    // �������� ������:
    void show() {
        System.out.println("�������� ����: " + number);
    }

    void set(int n) {
        number = n;
    }
}

// ���������:
interface MyInterface {
    MyClass create(int n);
}

// ������� �����:
class ConstructorReferenceDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ������������� ������ �� �����������:
        MyInterface ref = MyClass::new;
        // �������� ������� ������� ������
        // �� ������������ ����������:
        MyClass obj = ref.create(100);
        // ����� ������� �������:
        obj.show();
        obj.set(200);
        obj.show();
    }
}