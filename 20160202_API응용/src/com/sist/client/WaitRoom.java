package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class WaitRoom extends JPanel{
	JTable table1,table2; //���̺� �ܰ�
	DefaultTableModel model1,model2;
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JButton b1,b2,b3,b4,b5,b6;
	
	WaitRoom()
	{
		String[] col1={"���̸�", "����/�����", "�ο�"}; //Ÿ��Ʋ
		String[][] row1=new String[0][3]; //0�κ��� �����ٰ� ����� �����
		model1=new DefaultTableModel(row1, col1);
		table1=new JTable(model1);
		JScrollPane js1=new JScrollPane(table1);
		
		String[] col2={"ID", "��ȭ��", "����", "��ġ"}; //Ÿ��Ʋ
		String[][] row2=new String[0][4]; //0�κ��� �����ٰ� ����� �����
		model2=new DefaultTableModel(row2, col2);
		table2=new JTable(model2);
		JScrollPane js2=new JScrollPane(table2);
		
		ta=new JTextArea(); //ä���� ���� �κ� ��ũ�ѹ�!
		JScrollPane js3=new JScrollPane(ta);
		
		tf=new JTextField();
		box=new JComboBox();
		box.addItem("white");
		box.addItem("green");
		box.addItem("pink");
		box.addItem("cyan");
		box.addItem("blue");
		
		b1=new JButton("�游���");
		b2=new JButton("�����");
		b3=new JButton("1:1����");
		b4=new JButton("����������");
		b5=new JButton("��������");
		b6=new JButton("������");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3, 2, 5, 5)); //��ư�� 2���� 3�� ���� , �� ���� ���ڴ� �¿찣��
		p.add(b1); p.add(b2);
		p.add(b3); p.add(b4);
		p.add(b5); p.add(b6);
		
		setLayout(null);
		js1.setBounds(10, 15, 500, 350);
		js2.setBounds(10, 370, 500, 180);
		js3.setBounds(515, 15, 265, 300);	
		tf.setBounds(515, 320, 160, 30);
		box.setBounds(680, 320, 100, 30);
		p.setBounds(515, 470, 265, 80); //��ư ��ġ
		
		add(js1);
		add(js2);
		add(js3);
		add(tf);
		add(box);
		add(p);
		
	}
	

}
