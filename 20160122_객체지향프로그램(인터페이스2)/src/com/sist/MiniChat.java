package com.sist;
/*
 * 	interface
 * 		=> ���� �ٸ� Ŭ������ ��� ���
 * 		=> ǥ��ȭ�� �����ϴ�
 * 		����)
 * 			interface interfaceName
 * 			{
 * 				����
 * 				int a=10; public static final
 * 				�޼ҵ�(����)
 * 				void display(); => public abstract ����
 * 				������ �޼ҵ�(JDK 1.8���� ����)
 * 				static void a(){}
 * 				default void b(){}
 * 		=> ����
 * 			�޸� �Ҵ��� �� �� ����(�̿ϼ��� Ŭ�����̱� ������)
 * 			�׻� ��ӹ��� Ŭ���� �̿ϼ��� �޼ҵ带 �����ؼ� ���
 * 			=> class�� ��ӹ��� ��쿡�� implements�� ����Ѵ�.
 * 		=> ����
 * 			���߻���� �����ϴ�
 * 			interface A
 * 			interface B
 * 			class C implements A,B
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * ������ ó�� => ������ ���
 * 			========
 * 			1) ���
 * 			class A extends JFrame
 * 			2)����
 * 			class A
 * 			{
 * 				JFrame f=new JFrame();
 * 			}
 */
public class MiniChat extends JFrame implements ActionListener{

	JTextArea ta;
	JTextField tf;
	public MiniChat()
	{
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		//��������
		tf=new JTextField(20);
		//��ġ
		add("Center", js); //��ũ�ѹ� �߰�
		add("South", tf);
		setSize(350,450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MiniChat();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)
		{
			String data=tf.getText();
			if(data.length()<1)
				return;
			ta.append(data+"\n");
			tf.setText("");//�ؽ�Ʈ ġ�� ����ġ�� ä��ġ�� �� �����
		}
	}

}























