package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ClientMainForm extends JFrame implements ActionListener{
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	CardLayout card=new CardLayout(); //모든 창을 뒤에 감춰두었다가 가져올 수 있음
	ClientMainForm()
	{
		setLayout(card); //BorderLayout
		
		add("LOG", login);
		add("WR",wr);
		setSize(800,600);
		setVisible(true);
		login.b1.addActionListener(this); //로그인버튼 눌렀을때 이벤트
		login.b2.addActionListener(this); //캔슬버튼 눌렀을 때 이벤트
		//윈도우 종료창 눌러도 안꺼지게 하는 방법, 항상 만들어둔 캔슬, 나가기 버튼으로만 게임을 종료할 수 있음
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setResizable(false);//윈도우창크기 고정
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			 UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel"); //jtattoo다운, 샘플다운
		}catch(Exception ex){}
		
		new ClientMainForm();
	}
	@Override //변경해서 쓰겠다!
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			card.show(getContentPane(), "WR");
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0); //종료
		}
	}

}
