package com.demo.java8.p08UsingObjects;


// ���������:
interface Base2 {
    // ����� � ����� �� ���������:
    default void show() {
        System.out.println("��������� Base2");
    }

    // ���������� ������:
    void hello();
}

// ������� �����:
class MoreAnonymousClassDemo {
    public static void main(String[] args) {
        // �������� ������� ���������� ������:
        Base2 obj = new Base2() {
            // �������� ������ �� ����������:
            public void hello() {
                System.out.println("������ ���������� ������");
            }
        }; // ���������� ���������� �������� �������
        // ���������� ������
        // ����� ������� �� �������, ���������� �� ������
        // ���������� ������:
        obj.show();
        obj.hello();
        // �������� ���������� ������� ���������� ������
        // � ����� �� ����� ������� ������ showAll(),
        // ���������� � ��������� ������:
        new Base2() {
            // �������� ������ �� ����������:
            public void hello() {
                System.out.println("��������� ������");
            }

            // �������� ������ ������:
            void showAll() {
                hello();
                show();
            }
        }.showAll(); // ����� ������
    }
}