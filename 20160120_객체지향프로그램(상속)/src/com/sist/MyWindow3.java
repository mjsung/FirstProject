package com.sist;
import java.awt.*;//Layout
import javax.swing.*; //window
//JTabbedPane
public class MyWindow3 extends JFrame{
	JTabbedPane tp;
	public MyWindow3()
	{
		tp=new JTabbedPane();
		JPanel p1=new JPanel();
		p1.setBackground(Color.red);
		
		JPanel p2=new JPanel();
		p2.setBackground(Color.green);
		
		JPanel p3=new JPanel();
		p3.setBackground(Color.blue);
		
		tp.setTabPlacement(tp.LEFT); // 탭을 옆으로, LEFT, TOP, RIGHT, BOTTOM 으로 붙일 수 있다.
		tp.addTab("red", p1);
		tp.addTab("green", p2);
		tp.addTab("green", p3);
		
		add("Center",tp);
		setSize(640,480);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWindow3 m=new MyWindow3();
	}

}
