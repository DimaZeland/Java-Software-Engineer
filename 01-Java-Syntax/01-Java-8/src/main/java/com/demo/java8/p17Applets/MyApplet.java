package com.demo.java8.p17Applets;

// ������ �������:

import javax.swing.*;
import java.awt.*;

// ����� �������:
public class MyApplet extends JApplet {
    // ����� ������������� �������:
    public void init() {
        // �������� �����:
        JLabel lbl = new JLabel("����� ����� �� ������ ����");
        // ���������� ������ � �����:
        lbl.setFont(new Font("Arial", Font.BOLD, 30));
        // ���� ������:
        lbl.setForeground(Color.BLUE);
        // ������� � ����� ��������������:
        lbl.setOpaque(true);
        // ���� ���� �����:
        lbl.setBackground(Color.YELLOW);
        // ���������� ����� � ������:
        add(lbl);
    }
}