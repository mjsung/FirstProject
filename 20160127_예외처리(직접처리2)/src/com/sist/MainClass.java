package com.sist;
//�ݵ�� ����ó���� �ϴ� ���̺귯�� : IO,Thread, NetWork, Database
//web, bigdata
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
public class MainClass extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	public MainClass()
	{
		b1=new JButton("�޸���");
		b2=new JButton("����");
		b3=new JButton("�׸���");
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		
		setSize(450,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		new JButton().addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new MainClass();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			try{
			Runtime.getRuntime().exec("c:\\windows\\system32\\notepad.exe");
			}catch(IOException re)
			{
				System.out.println(re.getMessage());
				//�Ǵ� re.printStackTrace();  �� �����ؼ� ���°�ٿ� �������� �˷��� -> �������
			}
			
		}
		if(e.getSource()==b2)
		{
			try{
			Runtime.getRuntime().exec("c:\\windows\\system32\\calc.exe");
			}catch(IOException re)
			{
				System.out.println(re.getMessage());
				//�Ǵ� re.printStackTrace();  �� �����ؼ� ���°�ٿ� �������� �˷��� -> �������
			}
			
		}
		if(e.getSource()==b3)
		{
			try{
			Runtime.getRuntime().exec("c:\\windows\\system32\\mspaint.exe");
			}catch(IOException re)
			{
				System.out.println(re.getMessage());
				//�Ǵ� re.printStackTrace();  �� �����ؼ� ���°�ٿ� �������� �˷��� -> �������
			}
			
		}
	}

}
