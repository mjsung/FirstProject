package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class BoardIU extends JPanel{
	JLabel la1,la2,la3,la4,la5,la6;
	JTextField tf1,tf2;
	JTextArea ta;
	JPasswordField pf;
	JButton b1,b2;
	public BoardIU()
	{
		la1 = new JLabel("�۾���");
		la1.setFont(new Font("���� ���",Font.BOLD,30));
		JPanel p=new JPanel();
		p.add(la1);
		la2=new JLabel("�̸�");
		la3=new JLabel("����");
		la4=new JLabel("����");
		la5=new JLabel("PW");
		
		tf1=new JTextField();
		tf2=new JTextField();
		
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		
		pf=new JPasswordField();
		b1=new JButton("�۾���");
		b2=new JButton("���");
		
		setLayout(null);
		p.setBounds(10, 15, 770, 45);
		la2.setBounds(200, 75, 40, 30);
		tf1.setBounds(245, 75, 150, 30);
		
		la3.setBounds(200, 110, 40, 30);
		tf2.setBounds(245, 110, 400, 30);
		
		la4.setBounds(200, 145, 40, 30);
		js.setBounds(245, 145, 350, 250);
		la5.setBounds(200, 400, 40, 30);
		pf.setBounds(245, 400, 100, 30);
		
		JPanel p1=new JPanel();
		p1.add(b1);
		p1.add(b2);
		p1.setBounds(200, 440, 395, 35);
		add(p);
		add(la2);
		add(tf1);
		add(la3);
		add(tf2);
		add(la4);
		add(js);
		add(la5);
		add(pf);
		add(p1);
		
	}
	
}
