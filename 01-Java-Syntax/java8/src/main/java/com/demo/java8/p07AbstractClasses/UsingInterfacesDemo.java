package com.demo.java8.p07AbstractClasses;

// ������ ���������:
interface First4 {
    void hello();
}

// ������ ���������:
interface Second4 {
    void hi();
}

// ����� ��������� ��� ����������:
class MyClas implements First4, Second4 {
    // �������� ������ �� ������� ����������:
    public void hello() {
        System.out.println("����� �� ���������� First");
    }

    // �������� ������ �� ������� ����������:
    public void hi() {
        System.out.println("����� �� ���������� Second");
    }
}

// ������� �����:
class UsingInterfacesDemo {
    public static void main(String[] args) {
        // �������� �������:
        MyClas obj = new MyClas();
        // ����� ������� �� �������:
        obj.hello();
        obj.hi();
    }
}