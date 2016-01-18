package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ClientMainForm extends JFrame implements ActionListener{
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	CardLayout card=new CardLayout(); //��� â�� �ڿ� ����ξ��ٰ� ������ �� ����
	ClientMainForm()
	{
		setLayout(card); //BorderLayout
		
		add("LOG", login);
		add("WR",wr);
		setSize(800,600);
		setVisible(true);
		login.b1.addActionListener(this); //�α��ι�ư �������� �̺�Ʈ
		login.b2.addActionListener(this); //ĵ����ư ������ �� �̺�Ʈ
		//������ ����â ������ �Ȳ����� �ϴ� ���, �׻� ������ ĵ��, ������ ��ư���θ� ������ ������ �� ����
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setResizable(false);//������âũ�� ����
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			 UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel"); //jtattoo�ٿ�, ���ôٿ�
		}catch(Exception ex){}
		
		new ClientMainForm();
	}
	@Override //�����ؼ� ���ڴ�!
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			card.show(getContentPane(), "WR");
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0); //����
		}
	}

}
