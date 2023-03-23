package com.demo.java8.p18Files;

// ������ �������:

import java.io.*;

// ������� �����:
class GetFileInfoDemo {
    // ������� �����:
    public static void main(String[] args) {
        // ���� � �����:
        String path = "d:\\documents\\MyData.pdf";
        // ����������� ���� � �����:
        System.out.println(path);
        // �������� ������� ������ File:
        File F = new File(path);
        // �������� �����:
        System.out.println("��� �����: " + F.getName());
        // ������������ ����������:
        System.out.println("����������: " + F.getParent());
        // ���������� ������������ ����������:
        File[] files = F.getParentFile().listFiles();
        System.out.println("���������� �����:");
        // ����������� �������� ������ � ����������:
        for (int k = 0; k < files.length; k++) {
            System.out.print("\t" + files[k].getName());
            if (files[k].isFile()) {
                System.out.println(" - ����");
            } else {
                System.out.println(" - ����������");
            }
        }
        System.out.println("�������� ����� ���������� � ����������� �����");
        // �������� ������� ��� ����� ����������:
        File D = new File(F.getParentFile(), ".\\MyFiles");
        // �������� ����� ����������:
        D.mkdir();
        // ������ ������������ ���� � ����������:
        try { // �������������� ���
            System.out.println("������� ���������� " + D.getCanonicalPath());
        } // ��������� ����������:
        catch (IOException e) {
            System.out.println("������: " + e);
        }
        // ����������� �����:
        F.renameTo(new File(D, "MyCV.pdf"));
        // �������� ������������� �����:
        System.out.print("���� " + F.getAbsolutePath());
        if (F.exists()) { // ���� ���� ����������
            System.out.println(" ����������");
        } else { // ���� ���� �� ����������
            System.out.println(" �� ����������");
        }
        // ���� � ����� ����������:
        System.out.println("� ���������� " + D.getPath() + " ���� �����:");
        // ������ ������ �� ����� ����������:
        files = D.listFiles();
        // �������� ������ �� ����� ����������:
        for (int k = 0; k < files.length; k++) {
            System.out.println(files[k].getName());
        }
    }
}