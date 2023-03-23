package com.demo.java8.p18Files;

// ������ �������:

import java.io.*;

// ������� �����:
class BufferedReaderWriterDemo {
    // ������� �����:
    public static void main(String[] args) {
        System.out.println("���������� ����������� �����");
        // ���� � ����������:
        String path = "d:/documents/";
        // ��������� ���������� ��� ������
        // ����������� �� ����� �����:
        String str;
        // �������������� ���:
        try {
            // ������ ����������������� ������ �����:
            BufferedReader input = new BufferedReader(new FileReader(path + "MyNewText.txt"));
            // ������ ����������������� ������ ������:
            BufferedWriter output = new BufferedWriter(new FileWriter(path + "MyFiles/MyVeryNewText.txt"));
            // ���������� - ������� �����:
            int k = 1;
            // ���������� ����� �� ������ �����
            // � ������ � ������ ����:
            while ((str = input.readLine()) != null) {
                // ������ ������ � ����:
                output.write("[" + k + "] " + str.toLowerCase());
                // ������� � ����� ������:
                output.newLine();
                // ����� �������� ����������-��������:
                k++;
            }
            // ������ �����������:
            input.close();
            output.close();
        }
        // ��������� ����������:
        catch (FileNotFoundException e) {
            System.out.println("���� �� ������: " + e);
        } catch (IOException e) {
            System.out.println("������ ������� � �����: " + e);
        }
        System.out.println("����������� ����� ���������");
    }
}