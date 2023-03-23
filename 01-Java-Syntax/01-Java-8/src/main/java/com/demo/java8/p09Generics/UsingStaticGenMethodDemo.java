package com.demo.java8.p09Generics;

// ����� �� ������������ ����������� ��������:
class UsingStaticGenMethodDemo {
    // ����� � ���������� ����������� ����:
    static <X> void show(X arg) {
        System.out.println(arg);
    }

    // �������� ������ - ���������� ������:
    static <X> void show(X[] array) {
        System.out.print("| ");
        // ����������� �������� ��������� �������:
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " | ");
        }
        System.out.println("");
    }

    // ������ ���������� ���������� ���������� ������ �
    // ������������� ������, � ����������� ������������
    // �������� �������� � ��������������� ��������:
    static <X> X getElement(X[] array, int index) {
        return array[index];
    }

    // ������� �����:
    public static void main(String[] args) {
        // ������������� ������:
        Integer[] nums = {1, 3, 7, 2};
        // ���������� ������:
        Character[] symbs = {'A', 'W', 'L', 'O', 'B'};
        System.out.println("����� ������ show()");
        System.out.print("� ��������� ����������: ");
        show("���������� �����");
        System.out.print("� int-����������: ");
        show(123);
        System.out.print("� double-����������: ");
        show(123.45);
        System.out.print("� char-����������: ");
        show('A');
        System.out.print("������������� ������: ");
        show(nums);
        System.out.print("���������� ������: ");
        show(symbs);
        // ������������ ����������� ��������:
        System.out.println("����� ������ getElement()");
        System.out.print("������������� ������: *");
        for (int k = 0; k < nums.length; k++) {
            System.out.print(getElement(nums, k) + "*");
        }
        System.out.print("\n���������� ������: *");
        for (int k = 0; k < symbs.length; k++) {
            System.out.print(getElement(symbs, k) + "*");
        }
        System.out.println("");
    }
}