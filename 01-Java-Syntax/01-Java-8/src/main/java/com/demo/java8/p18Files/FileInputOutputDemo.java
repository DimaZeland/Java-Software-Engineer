package com.demo.java8.p18Files;

// ������ �������:

import java.io.*;

// ������� �����:
class FileInputOutputDemo {
    // ������� �����:
    public static void main(String[] args) {
        System.out.println("���������� ����������� �����");
        // ���� � ����������:
        String path = "d:/documents/";
        // ���������� ��� ������ ����������� ������:
        int bt;
        // �������������� ���:
        try {
            // ������ ��������� ������ �����:
            FileInputStream input = new FileInputStream(path + "MyFiles/MyCV.pdf");
            // ������ ��������� ������ ������:
            FileOutputStream output = new FileOutputStream(path + "MyData.pdf");
            // ���������� ����� �� �����:
            bt = input.read();
            // ���������� ������ �� ������ �����
            // � ������ � ������ ����:
            while (bt != -1) { // ���� �� ��������� ����� �����
                // ������ ����� � ����:
                output.write(bt);
                // ���������� ����� �� �����:
                bt = input.read();
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