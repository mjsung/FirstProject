package com.sist;
/*
 * ���̺귯�� Library : ����ǰ(�ڹ�) .class => ����� ���ؼ� ����
 * �����ӿ�ũ Framework : ���� .class, .java => ���������� ����
 * 		= spring, mybatis, jquery
 * 		==========================Open Source��� ��
 * 	1) �޸𸮱���
 * 		===============
 * 			�޼ҵ� ���� => �޼ҵ�, static ����
 * 		===============
 * 			����           => �Ű�����, �������� ���� : �޸� ��ü�� ����, {}�� ���ᰡ �Ǹ� �޸� ����
 * 		===============
 * 			��              => ���α׷��� ����(�ν��Ͻ�) -> new, GC(������ �÷���)�� ���������
 * 		===============
 * 		�ּ� ���� : ����
 * 		���� ������ : ��
 * 		A a=new A();
 * 		 ==
 * 		  ����  ======> ���� �����Ͱ� ����(.)
 * 
 * 		===========================================================
 * 
 * 		���̺귯��
 * 		1) java.lang
 * 			=> import�� ������ �� �ִ�.
 * 			Object : �ֻ��� Ŭ����(��� Ŭ������ Object ���)
 * 			   ���)
 * 				* toString(): ��ü�� ���ڿ��� ��ȯ
 * 				  =>(String) ���ڿ��� ����ȯ ��Ű�� �Ͱ� ����
 * 				* finalize() : ��ü�޸� ȸ���ÿ� ȣ��Ǵ� �޼ҵ�
 * 					C++ => ��ü����(������)  A()
 * 						        ��ü�Ҹ�(�Ҹ���)  ~A()
 * 						��ü�� �����ֱ�
 * 					����==========>  Ȱ��   ==========>�Ҹ�
 * 				A a=new A();   a.display()      a.null
 * 					������						   (GC=>finalize())
 * 				* clone-> (����)
 * 				������ �� Ŭ���� �ڿ� implements Cloneable �ٿ��� ��. 
 * 				* equals : �ּҰ��� ���ϴ� ���� �ƴ϶� ����� ������ ��ü�� ��
 * 
 * 		2) java.util
 * 		3) java.sql
 * 		4) java.io
 * 		5) java.net
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * 1) Ŭ���� ���� : �Ϲ� ����(��������), �迭, Ŭ������ �� �� ����
 * 	class A
 * {
 * 		int a;
 * 		int [] arr;
 * 		JButton b; ==> ���
 * }
 */
public class MainClass extends JFrame implements ActionListener{
	JComboBox box;
	JLabel la;
	JButton b;
	public MainClass()
	{
		//��������� �ʱ�ȭ ==> ������
		//������� : �Ϲݺ���(int a, b, ...), ��ü
		la=new JLabel("����");
		box=new JComboBox();
		box.addItem("����");
		box.addItem("����");
		b=new JButton("����");
		setLayout(new FlowLayout());
		add(la);
		add(box);
		add(b);
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�̺�Ʈ ���
		b.addActionListener(new MyEvent(this));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
