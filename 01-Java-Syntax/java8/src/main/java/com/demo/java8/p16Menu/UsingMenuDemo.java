package com.demo.java8.p16Menu;// ������ �������:
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
// ����� ���� ��������� ��������� ActionListener:
class MyFrame extends JFrame implements ActionListener{
   // ����, ������������ ����������� � �����,
   // ������� ������� ���������� � ����:
   private int state;
   // ������ �� ������, ���������� �����������
   // � ��������� ������:
   private JPanel pnl;
   // ������ �� ������, ������������ ����� ��� �������:
   private Border bdr;
   // ������ �� ���������� ����� ��� ���� ������:
   private Color[] clr=new Color[3];
   // ������ ��� �������� ����:
   private JButton btn;
   // ������ �� ������ ����:
   private JMenu content,view,program;
   // ������ � �������������:
   private ImageIcon[] imgs;
   // ������� � ���������� ��������:
   private String[] engNames={"fox","wolf","bear","raccoon"};
   private String[] cyrNames={"����","����","�������","����"};
   // ������ ��� ������ �������� ������ � �������:
   private String[] files;
   // ������ �� ����� � ������������:
   private JLabel lbl;
   // ������ �� ��������� ������:
   private JTextPane tp;
   // ������ �� ������ ����:
   private JMenuBar mb;
   // ������ �� ������� ����:
   private JMenuItem about,exit;
   // ������ �� �������� �� ������� ����:
   private JMenuItem[] animals;
   // ������ �� ��������� ������� ����:
   private JCheckBoxMenuItem color;
   // ������ �� ������� ����, ���������� ���������������:
   private JRadioButtonMenuItem light,dark,ordinary;
   // ������ �� ������ ������������:
   private JToolBar tb;
   // ������ �� ������, ����������� �� ������ ������������:
   private MyButton exitBtn,nextBtn,prevBtn,startBtn;
   // ������ �� ����������� ����:
   private JPopupMenu pm;
   // ���������� ����� ��� ������, �����������
   // �� ������ ������������:
   class MyButton extends JButton{
      // �����������:
      MyButton(String txt){
         // ����� ������������ �����������:
         super(new ImageIcon("d:/resources/pictures/"+txt));
         // ������ ��������� ����� ������:
         setFocusPainted(false);
      }
   }
   // ����� ��� ��������� ����������� � ������:
   private void setContent(){
      // ���������� ����������� � �����:
      lbl.setIcon(imgs[state]);
      // �������������� ���:
      try{
         // ��� ��������� ������ �����������
         // ����� �� �����:
         tp.setPage(files[state]);
      }
      // ��������� ����������:
      catch(IOException err){
         tp.setText("���������� ����������");
      }
   }
   // ���������� ������ �� ���������� ActionListener:
   public void actionPerformed(ActionEvent e){
      // ������������ ���� state ��������� ������ �����,
      // ������� ���������� ��������������� ��
      // ���������� ������� ������� �������� ���
      // ����������, �� ������� ��������� �������:
      state=Integer.parseInt(((JMenuItem)e.getSource()).getActionCommand());
      // ����� ������, ���������������� ����������� � �����
      // � ����� � ��������� ������:
      setContent();
   }
   // ����������� ������:
   MyFrame(){
      // ����� ������������ �����������:
      super("���� � ������� ����");
      // ��������� � ������� ����:
      setBounds(250,250,350,230);
      // ���� ���������� ��������:
      setResizable(false);
      // ������� �� ������ ��������� �����������:
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      // ���������� ��������� ����������:
      setLayout(new BorderLayout());
      // ��������� �������� �������������� ����:
      state=0;
      // ��� ����� ��� �������:
      bdr=BorderFactory.createEtchedBorder();
      // ������������ �����:
      clr[0]=getBackground();
      clr[1]=Color.WHITE;
      clr[2]=Color.DARK_GRAY;
      // ������ � �������������:
      imgs=new ImageIcon[engNames.length];
      // ������ � ���������� ��������� ������:
      files=new String[engNames.length];
      // ������ �� �������� �� ������� ������ ����:
      animals=new JMenuItem[cyrNames.length];
      // ���������� ������� � �������������
      // � ������� � ���������� ������:
      for(int k=0;k<engNames.length;k++){
         imgs[k]=new ImageIcon("d:/resources/pictures/"+engNames[k]+".jpg");
         files[k]="file:///d:/resources/files/"+engNames[k]+".txt";
      }
      // �������� ������� ��� ������ ������������:
      tb=new JToolBar("������ ����");
      // �������� �������� ��� ������, �����������
      // �� ������ ������������ � ����������� ��� ���
      // ����������� ���������:
      exitBtn=new MyButton("exit.png");
      exitBtn.setToolTipText("���������� ������");
      startBtn=new MyButton("start.png");
      startBtn.setToolTipText("��������� �����������");
      prevBtn=new MyButton("prev.png");
      prevBtn.setToolTipText("���������� �����������");
      nextBtn=new MyButton("next.png");
      nextBtn.setToolTipText("��������� �����������");
      // ���������� ������ �� ������ ������������:
      tb.add(exitBtn);
      tb.add(startBtn);
      tb.add(prevBtn);
      tb.add(nextBtn);
      // ���������� ������ ������������ � ����:
      add(tb,BorderLayout.NORTH);
      // �������� ������:
      pnl=new JPanel();
      // ����� ������ ������;
      pnl.setBorder(bdr);
      // ����������� ��������� ���������� ��� ������:
      pnl.setLayout(new GridLayout(1,2));
      // �������� �����:
      lbl=new JLabel();
      // ����� ������������ ����������� �� ������:
      lbl.setHorizontalAlignment(JLabel.CENTER);
      // ���������� ����� �� ������:
      pnl.add(lbl);
      // ���������� ������ � ����:
      add(pnl,BorderLayout.CENTER);
      // ������� � �������� ���������:
      JScrollPane sp=new JScrollPane();
      // �������� ��������� ������:
      tp=new JTextPane();
      // ����� ��������� �������������� ����������� ������:
      tp.setEditable(false);
      // ���������� ��������� ������ � �������
      // ��������� ������ � �������� ���������:
      sp.getViewport().add(tp);
      // ���������� ������ � �������� ���������
      // �� ������� ������:
      pnl.add(sp);
      // �������� ������:
      btn=new JButton("OK");
      // ������ ������ ����������� ����� ������:
      btn.setFocusPainted(false);
      // �������� ������� ������:
      JPanel p=new JPanel();
      // ����������� ��������� ���������� ��� ������:
      p.setLayout(new GridLayout(1,3));
      // ����� ������ ������:
      p.setBorder(bdr);
      // ���������� �� ������ "�����������" ������:
      p.add(new JPanel());
      // ���������� �� ������ ������:
      p.add(btn);
      // ���������� �� ������ "�����������" ������:
      p.add(new JPanel());
      // ���������� ������ � ����:
      add(p,BorderLayout.SOUTH);
      // �������� ������ ����:
      mb=new JMenuBar();
      // �������� ������� ����:
      content=new JMenu("����������");
      view=new JMenu("���");
      program=new JMenu("���������");
      // �������� ������ ����:
      about=new JMenuItem("� ���������");
      exit=new JMenuItem("�����",exitBtn.getIcon());
      // ���������� � ����� ���� ������:
      program.add(about);
      program.addSeparator(); // ���������� �����������
      program.add(exit);
      // �������� ��������� ������� ����:
      color=new JCheckBoxMenuItem("���� ������",true);
      // �������� ������ ����, ���������� ���������������:
      light=new JRadioButtonMenuItem("�������",false);
      dark=new JRadioButtonMenuItem("������",false);
      ordinary=new JRadioButtonMenuItem("�������",true);
      // �������� ������� ��� ������ ��������������:
      ButtonGroup bg=new ButtonGroup();
      // ���������� ������-�������������� � ������:
      bg.add(ordinary);
      bg.add(light);
      bg.add(dark);
      // ���������� � ����� ���� ��������� �������:
      view.add(color);
      // ���������� �����������:
      view.addSeparator();
      // ���������� � ����� ���� ������-��������������:
      view.add(ordinary);
      view.add(light);
      view.add(dark);
      // �������� ������ ����, ������������� ����� ������:
      for(int k=0;k<animals.length;k++){
         // �������� ������� ��� ������� ����:
         animals[k]=new JMenuItem(cyrNames[k]);
         // ����������� ������ ��� ������� ��������:
         animals[k].setActionCommand(""+k);
         // ����������� �����������:
         animals[k].addActionListener(this);
         // ���������� ������� � ����� ����:
         content.add(animals[k]);
      }
      // ���������� ������� ���� �� ������ ����:
      mb.add(content);
      mb.add(view);
      mb.add(program);
      // ���������� � ���� ������ ����:
      setJMenuBar(mb);
      // �������� ������� ��� ������������ ����:
      pm=new JPopupMenu();
      // ���������� ������������ ���� ���������:
      for(int k=0;k<cyrNames.length;k++){
         // ���������� ������� � ����������� ����
         // � ������������� ������������ ������ ���
         // ������� ��������:
         pm.add(new JMenuItem(cyrNames[k])).setActionCommand(""+k);
         // ����������� �����������:
         ((JMenuItem)pm.getComponent(k)).addActionListener(this);
      }
      // ���������� �����������:
      pm.addSeparator();
      // ���������� ������� � ����������� ����
      // � ������������� ������������ �����������:
      pm.add(new JMenuItem("�����",exitBtn.getIcon())).addActionListener(e->exitBtn.doClick());
      // ����������� ������������ ���� ��� �����:
      lbl.setComponentPopupMenu(pm);
      btn.addActionListener(e->System.exit(0));
      // ����������� ����������� ��� ������ �� ������
      // ������������:
      exitBtn.addActionListener(btn.getActionListeners()[0]);
      nextBtn.addActionListener(e->{
         state=(state+1)%(engNames.length);
         setContent();
      });
      prevBtn.addActionListener(e->{
         state=state==0?engNames.length-1:(state-1);
         setContent();
      });
      startBtn.addActionListener(e->{
         state=0;
         setContent();
      });
      // ����������� ������������ ��� ������ ����:
      exit.addActionListener(exitBtn.getActionListeners()[0]);
      about.addActionListener(e->{
         // ����������� ����������� ����:
         JOptionPane.showMessageDialog(
            this,  // ������������ ����
            // ����� � ������� ���� (����� ���������):
            "� ��������� ������������ ������ ����\n� ������ ������������.",
            // �������� ����:
            "� ���������",
            // ��� �����������:
            JOptionPane.INFORMATION_MESSAGE
         );
      });
      // ����������� ����������� ��� �����. ��� ������
      // �� ������ ������ ���� � ������� �����
      // ������������ ����������� ����:
      lbl.addMouseListener(new MouseAdapter(){
         public void mousePressed(MouseEvent e){
            // ���������, ����� ������ ������ ����:
            if(e.isPopupTrigger()){
               // ����������� ������������ ���� � �����
               // ���������� �������:
               pm.show(e.getComponent(),e.getX(),e.getY());
            }
         }
      });
      // ����������� ����������� ��� ��������� �������:
      color.addActionListener(e->{
         // ���� ����� �����������:
         if(color.isSelected()){
            ordinary.setEnabled(true);
            light.setEnabled(true);
            dark.setEnabled(true);
         }
         // ���� ����� �� �����������:
         else{
            ordinary.setEnabled(false);
            light.setEnabled(false);
            dark.setEnabled(false);
         }
      });
      // ����������� ������������
      // ��� ������-��������������:
      ordinary.addActionListener(e->pnl.setBackground(clr[0]));
      light.addActionListener(e->pnl.setBackground(clr[1]));
      dark.addActionListener(e->pnl.setBackground(clr[2]));
      // ���������� ����������� ������:
      setContent();
      // ����������� ����:
      setVisible(true);
   }
}
// ������� �����:
class UsingMenuDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ������� ����:
      new MyFrame();
   }
}