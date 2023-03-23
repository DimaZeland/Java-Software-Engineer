package com.demo.java8.p11Exceptions;

// ����� ��������������� ���������� ���������
// ������������� ������ Exception:
class MyException extends Exception {
    // �������� �������� ����:
    private int code;

    // �����������:
    MyException(int n) {
        super();
        code = n;
    }

    // ��������������� ������ toString():
    public String toString() {
        String txt = "���������� ������ MyException\n";
        txt += "��� ������: " + code + "\n";
        txt += "------------------------------";
        return txt;
    }
}

// ����� ����������������� ���������� ���������
// ������������� ������ RuntimeException:
class MyMistake extends RuntimeException {
    // �������� �������� ����:
    private int code;

    // �����������:
    MyMistake(int n) {
        super();
        code = n;
    }

    // ��������������� ������ toString():
    public String toString() {
        String txt = "���������� ������ MyMistake\n";
        txt += "��� ������: " + code + "\n";
        txt += "******************************";
        return txt;
    }
}

// ������� �����:
class UsingMyExceptionDemo {
    // ����������� ����� ����������� ��������������
    // ���������� ������ MyException:
    static void alpha(int n) throws MyException {
        throw new MyException(n);
    }

    // ����������� ����� ����������� ����������������
    // ���������� ������ MyMistake:
    static void bravo(int n) {
        throw new MyMistake(n);
    }

    // ������� �����:
    public static void main(String[] args) {
        // �������������� ��� (������� ����):
        try {
            // �������������� ��� (���������� ����):
            try {
                // ����� ����������� ���������� MyException:
                alpha(123);
            }
            // ��������� ���������� ������ MyException:
            catch (MyException e) {
                System.out.println(e);
                bravo(321);
            }
        }
        // ��������� ���������� ������ MyMistake:
        catch (MyMistake e) {
            System.out.println(e);
        }
    }
}