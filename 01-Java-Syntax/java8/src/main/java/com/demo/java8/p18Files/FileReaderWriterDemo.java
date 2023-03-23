package com.demo.java8.p18Files;

// ������ �������:

import java.io.*;

// ������� �����:
class FileReaderWriterDemo {
    // ������� �����:
    public static void main(String[] args) {
        System.out.println("���������� ����������� �����");
        // ���� � ����������:
        String path = "d:/documents/";
        // ���������� ��� ������ ����� ����������� ��������:
        int sm;
        // �������������� ���:
        try {
            // ������ ��������� ������ �����:
            FileReader input = new FileReader(path + "MyFiles/MyText.txt");
            // ������ ��������� ������ ������:
            FileWriter output = new FileWriter(path + "MyNewText.txt");
            // ���������� ���� ������� �� �����:
            sm = input.read();
            // ���������� �������� �� ������ �����
            // � ������ � ������ ����:
            while (sm != -1) { // ���� �� ��������� ����� �����
                // ������ ������� � ����:
                output.write(Character.toUpperCase((char) sm));
                // ���������� ���� ������� �� �����:
                sm = input.read();
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