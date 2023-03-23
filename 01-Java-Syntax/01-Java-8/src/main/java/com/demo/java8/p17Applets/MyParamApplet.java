package com.demo.java8.p17Applets;

// ������ �������:

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ����� �������:
public class MyParamApplet extends JApplet {
    // ���� - ������ �� �����:
    private JLabel L;
    // ���� ��� ����������� ������� ������ (������������
    // �� ������ ���������, ����������� �������):
    private int small, big;
    // �������� ��� ������:
    private String name = "Arial";
    // ������ ��� �����:
    private Font onFnt, offFnt;
    // ���� ��� ������ �����:
    private Color onFgr = Color.RED;
    // �������� ���� ������������ �� ������ ���������,
    // ����������� �������:
    private Color offFgr;
    // ���� ��� ���� �����:
    private Color onBgr = Color.WHITE;
    private Color offBgr = Color.YELLOW;
    // ����� ��� �����:
    private String onTxt = "������� ����� �� ����� ����";
    // �������� ����� ������������ �� ������ ���������,
    // ����������� �������:
    private String offTxt, clr;

    // ����� ��� ����������� ���������� �����:
    private void setAll(Color fgr, Color bgr, Font fnt, String txt) {
        // ����� ��� �����:
        L.setText(txt);
        // ���� ������ ��� �����:
        L.setForeground(fgr);
        // ���� ���� ��� �����:
        L.setBackground(bgr);
        // ���������� ������ ��� �����:
        L.setFont(fnt);
    }

    // ����� ������������� �������:
    public void init() {
        // �������������� ���. ���������� ��������� �������:
        try {
            // �������� ���������:
            clr = getParameter("color");
            // �������� ��������:
            if (clr.equalsIgnoreCase("�������")) {
                offFgr = Color.PINK;
            } else {
                if (clr.equalsIgnoreCase("�������")) {
                    offFgr = Color.GREEN;
                } else {
                    if (clr.equalsIgnoreCase("������")) {
                        offFgr = Color.BLACK;
                    } else {
                        clr = "�����";
                        offFgr = Color.BLUE;
                    }
                }
            }
        }
        // ��������� ����������:
        catch (Exception e) {
            clr = "�����";
            offFgr = Color.BLUE;
        }
        // �������������� ���. ���������� ��������� �������:
        try {
            // ������ ������:
            small = Integer.parseInt(getParameter("fontsize"));
        }
        // ��������� ����������:
        catch (Exception e) {
            small = 20;
        }
        // ����������� ������ ������:
        big = small + 10;
        // ����������� �������:
        onFnt = new Font(name, Font.ITALIC | Font.BOLD, small);
        offFnt = new Font(name, Font.BOLD, small);
        // ����������� ������ ��� �����:
        offTxt = clr + " ����� �� ������ ����";
        // ���������� ��������� ����������:
        setLayout(null);
        // �������� �����:
        L = new JLabel();
        // ������������ ������ �� ������:
        L.setHorizontalAlignment(JLabel.CENTER);
        // ��������� � ������� �����:
        L.setBounds(30, 30, getWidth() - 60, getHeight() - 60);
        // ���������� ����� ������ �����:
        L.setBorder(BorderFactory.createEtchedBorder());
        // ������� � ����� �������������� ��� �����:
        L.setOpaque(true);
        // ����������� ���������� �����:
        setAll(offFgr, offBgr, offFnt, offTxt);
        // ����������� ����������� �������
        // ������ ComponentEvent � �������:
        addComponentListener(new ComponentAdapter() {
            // ����� ���������� ��� ���������
            // �������� �������:
            public void componentResized(ComponentEvent e) {
                // ������� �����:
                L.setSize(getWidth() - 60, getHeight() - 60);
            }
        });
        // ����������� ����������� �������
        // ������ MouseEvent � �������:
        addMouseListener(new MouseAdapter() {
            // ����� ���������� ��� ������� ������ ����:
            public void mousePressed(MouseEvent e) {
                // ���������� ������ � �����:
                L.setFont(new Font(name, L.getFont().getStyle(), big));
            }

            // ����� ���������� ��� ���������� ������ ����:
            public void mouseReleased(MouseEvent e) {
                // ���������� ������ � �����:
                L.setFont(new Font(name, L.getFont().getStyle(), small));
            }
        });
        // ����������� ����������� �������
        // ������ MouseEvent � �����:
        L.addMouseListener(new MouseAdapter() {
            // ����� ���������� ��� ��������� �������
            // ���� �� �����:
            public void mouseEntered(MouseEvent e) {
                // ��������� �����:
                setAll(onFgr, onBgr, onFnt, onTxt);
            }

            // ����� ���������� ��� "�����" �������
            // ���� �� ������� �����:
            public void mouseExited(MouseEvent e) {
                // ��������� �����:
                setAll(offFgr, offBgr, offFnt, offTxt);
            }
        });
        // ����������� ��� ������ ����������� �������
        // ������ MouseEvent � �����:
        L.addMouseListener(getMouseListeners()[0]);
        // ���������� ����� � ������:
        add(L);
    }
}