package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class BoardContent extends JPanel{
	JLabel la1,la2,la3,la4,la5;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JTextArea ta;
	JButton b1,b2,b3;
	JLabel la;
	public BoardContent()
	{
		la=new JLabel("���뺸��");
   	 	la.setFont(new Font("���� ���",Font.BOLD,30));
   	 	b1=new JButton("����");
   	 	JPanel p=new JPanel();
   	 	p.add(la);
		
	   	la1=new JLabel("��ȣ");
	   	la2=new JLabel("�ۼ���");
	   	la3=new JLabel("�̸�");
	   	la4=new JLabel("��ȸ��");
	   	la5=new JLabel("����");
	   
	   	tf1=new JTextField();
	   	tf2=new JTextField();
	   	tf3=new JTextField();
	   	tf4=new JTextField();
	   	tf5=new JTextField();
	   	tf1.setEditable(false);
		tf2.setEditable(false);
		tf3.setEditable(false);
		tf4.setEditable(false);
		tf5.setEditable(false);
		
	   	ta=new JTextArea();
	   	ta.setEnabled(false);
	   	JScrollPane js=new JScrollPane(ta);
	   	
	   	b1=new JButton("����");
		b2=new JButton("����");
		b3=new JButton("���");
		
		setLayout(null);
		p.setBounds(10, 15, 770, 45);
		la1.setBounds(180, 70, 50, 30);
		tf1.setBounds(235, 70, 150, 30);
		la2.setBounds(390, 70, 50, 30);
		tf2.setBounds(445, 70, 150, 30);
	   	
		la3.setBounds(180, 105, 50, 30);
		tf3.setBounds(235, 105, 150, 30);
		la4.setBounds(390, 105, 50, 30);
		tf4.setBounds(445, 105, 150, 30);
		
		la5.setBounds(180, 145, 50, 30);
		tf5.setBounds(235, 145, 360, 30);
		
		js.setBounds(180, 180, 415, 200);
		
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.setBounds(180, 390, 415, 35);
		add(p2);
		add(p);
		add(la1);add(tf1);add(la2);add(tf2);
		add(la3);add(tf3);add(la4);add(tf4);
		add(la5);add(tf5);
		add(js);
	}
}
