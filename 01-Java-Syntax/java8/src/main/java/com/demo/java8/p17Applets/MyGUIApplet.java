package com.demo.java8.p17Applets;

// ������ �������:

import javax.swing.*;
import java.awt.*;

// ����� �������:
public class MyGUIApplet extends JApplet {
    // ������ ����:
    private JMenuBar mb;
    // ������ ����:
    private JMenu font, color;
    // ��������� ������� ����:
    private JCheckBoxMenuItem mItalic, mBold;
    // ������� ���� - �������������:
    private JRadioButtonMenuItem mRed, mBlack, mBlue;
    // ������� ����:
    private JMenuItem mReset;
    // �����:
    private JLabel text;
    // �����:
    private JCheckBox italic, bold;
    // ������:
    private JButton reset;
    // �������������:
    private JRadioButton red, black, blue;

    // ����� ��� ����������� ������ � ������ ��� �����:
    private void setAll() {
        // ����:
        Color clr;
        // ����� ��� �����:
        String txt = " ����� �� ����� ����";
        // ����� (��������� ��������):
        int style = Font.PLAIN;
        // ����������� �����:
        if (italic.isSelected()) {
            style |= Font.ITALIC; // ������
        }
        if (bold.isSelected()) {
            style |= Font.BOLD; // ������ �����
        }
        // ��������� ������ � ����������� �����:
        if (red.isSelected()) {
            txt = "�������" + txt;
            clr = Color.RED;
        } else {
            if (black.isSelected()) {
                txt = "������" + txt;
                clr = Color.BLACK;
            } else {
                txt = "�����" + txt;
                clr = Color.BLUE;
            }
        }
        // ����� ��� �����:
        text.setText(txt);
        // ����� ��� �����:
        text.setFont(new Font("Arial", style, 20));
        // ���� ������ �����:
        text.setForeground(clr);
    }

    // ����� ������������� �������:
    public void init() {
        // ����������:
        int w, h;
        // ������ � ������ �������:
        w = getWidth();
        h = getHeight();
        // ���������� ��������� ����������:
        setLayout(null);
        // �������� ������:
        JPanel pnl = new JPanel();
        // ��������� � ������� ������:
        pnl.setBounds(5, 5, w - 10, h - 35);
        // ����� ��� ������:
        pnl.setBorder(BorderFactory.createEtchedBorder());
        // ���������� ��������� ���������� ������:
        pnl.setLayout(null);
        // �������� �����:
        text = new JLabel();
        // ����� ������������ ������ �� ������:
        text.setHorizontalAlignment(JLabel.CENTER);
        // ��������� � ������� �����:
        text.setBounds(5, 5, pnl.getWidth() - 10, pnl.getHeight() / 3);
        // ����� ������ �����:
        text.setBorder(BorderFactory.createEtchedBorder());
        // ���������� ����� �� ������:
        pnl.add(text);
        // �������� �����:
        italic = new JCheckBox("��������� �����");
        bold = new JCheckBox("������ �����");
        // �������� ������:
        reset = new JButton("�����");
        // ��������� � ������� ����� � ������:
        italic.setBounds(text.getX(), text.getY() + text.getHeight() + 5, text.getWidth() / 2 - 5, 30);
        bold.setBounds(italic.getX(), italic.getY() + italic.getHeight() + 5, italic.getWidth(), italic.getHeight());
        reset.setBounds(bold.getX(), bold.getY() + bold.getHeight() + 5, bold.getWidth(), bold.getHeight());
        // ���������� ����� � ������ �� ������:
        pnl.add(italic);
        pnl.add(bold);
        pnl.add(reset);
        // �������� ������ ��������������:
        ButtonGroup bg = new ButtonGroup();
        // �������� ��������������:
        red = new JRadioButton("�������", true);
        black = new JRadioButton("������", false);
        blue = new JRadioButton("�����", false);
        // ���������� �������������� � ������:
        bg.add(red);
        bg.add(black);
        bg.add(blue);
        // ��������� � ������� ��������������:
        red.setBounds(italic.getX() + italic.getWidth() + 5, italic.getY(), italic.getWidth(), italic.getHeight());
        black.setBounds(red.getX(), bold.getY(), red.getWidth(), red.getHeight());
        blue.setBounds(black.getX(), reset.getY(), black.getWidth(), black.getHeight());
        // ���������� �������������� �� ������:
        pnl.add(red);
        pnl.add(black);
        pnl.add(blue);
        // �������� ������ ����:
        mb = new JMenuBar();
        // �������� ������ ����:
        font = new JMenu("�����");
        // �������� ��������� ������ ����:
        mItalic = new JCheckBoxMenuItem("������", false);
        mBold = new JCheckBoxMenuItem("������", false);
        // �������� ������� ����:
        mReset = new JMenuItem("�����");
        // ���������� ��������� ������ � ����� ����:
        font.add(mItalic);
        font.add(mBold);
        // ���������� �����������:
        font.addSeparator();
        // ���������� ������� � ����� ����:
        font.add(mReset);
        // �������� ������ ����:
        color = new JMenu("����");
        // �������� ������ ��������������:
        ButtonGroup mBG = new ButtonGroup();
        // �������� ������-��������������:
        mRed = new JRadioButtonMenuItem("�������", true);
        mBlack = new JRadioButtonMenuItem("������", false);
        mBlue = new JRadioButtonMenuItem("�����", false);
        // ���������� ������-�������������� � ������:
        mBG.add(mRed);
        mBG.add(mBlack);
        mBG.add(mBlue);
        // ���������� ������-�������������� � ����� ����:
        color.add(mRed);
        color.add(mBlack);
        color.add(mBlue);
        // ���������� ������� ���� �� ������ ����:
        mb.add(font);
        mb.add(color);
        // ���������� ������ ���� � ������:
        setJMenuBar(mb);
        // ���������� ������ � ������ � �����:
        setAll();
        // ���������� ������ � ������:
        add(pnl);
        // ����������� ������������
        // ��� ������� ������ ActionEvent:
        mItalic.addActionListener(e -> italic.setSelected(mItalic.isSelected()));
        mBold.addActionListener(e -> bold.setSelected(mBold.isSelected()));
        italic.addActionListener(e -> mItalic.setSelected(italic.isSelected()));
        bold.addActionListener(e -> mBold.setSelected(bold.isSelected()));
        mRed.addActionListener(e -> red.setSelected(mRed.isSelected()));
        mBlack.addActionListener(e -> black.setSelected(mBlack.isSelected()));
        mBlue.addActionListener(e -> blue.setSelected(mBlue.isSelected()));
        red.addActionListener(e -> mRed.setSelected(red.isSelected()));
        black.addActionListener(e -> mBlack.setSelected(black.isSelected()));
        blue.addActionListener(e -> mBlue.setSelected(blue.isSelected()));
        // ����������� ������������
        // ��� ������� ������ ItemEvent:
        italic.addItemListener(e -> setAll());
        bold.addItemListener(italic.getItemListeners()[0]);
        red.addItemListener(italic.getItemListeners()[0]);
        black.addItemListener(italic.getItemListeners()[0]);
        blue.addItemListener(italic.getItemListeners()[0]);
        // ���������� ��� ������:
        reset.addActionListener(e -> {
            italic.setSelected(true);
            // ����������� "������" �� �����:
            italic.doClick();
            bold.setSelected(true);
            // ����������� "������" �� �����:
            bold.doClick();
            // ����������� "������" �� �������������:
            red.doClick();
        });
        // ���������� ��� ������� ����:
        mReset.addActionListener(e -> reset.doClick());
    }
}