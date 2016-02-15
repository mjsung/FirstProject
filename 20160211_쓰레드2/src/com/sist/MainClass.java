package com.sist;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
public class MainClass extends JFrame implements ActionListener, Runnable{
	JProgressBar bar1,bar2,bar3;
	JLabel la1,la2,la3,la4;
	JTextField tf1,tf2,tf3;
	JButton b1,b2;
	public MainClass()
	{
		la1=new JLabel("운세",JLabel.CENTER);
		la1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		la2=new JLabel("금전운");
		la3=new JLabel("애정운");
		la4=new JLabel("건강운");
		tf1=new JTextField();
		tf1.setHorizontalAlignment(JLabel.CENTER);
		tf2=new JTextField();
		tf2.setHorizontalAlignment(JLabel.CENTER);
		tf3=new JTextField();
		tf3.setHorizontalAlignment(JLabel.CENTER);
		b1=new JButton("운세보기");
		b2=new JButton("종료");
		
		
		bar1=new JProgressBar();
		bar2=new JProgressBar();
		bar3=new JProgressBar();
		bar1.setMinimum(0);
		bar1.setMaximum(100);
		bar1.setBackground(Color.white);
		bar1.setForeground(Color.black);
		bar1.setStringPainted(true);
		bar2.setBackground(Color.white);
		bar2.setForeground(Color.pink);
		bar2.setStringPainted(true);
		bar3.setBackground(Color.white);
		bar3.setForeground(Color.orange);
		bar3.setStringPainted(true);
		setLayout(null);
		la1.setBounds(10, 15, 600, 35);
		
		la2.setBounds(10, 75, 50, 30);
		bar1.setBounds(65, 75, 450, 30);
		tf1.setBounds(520, 75, 90, 30);
		
		la3.setBounds(10, 110, 50, 30);
		bar2.setBounds(65, 110, 450, 30);
		tf2.setBounds(520, 110, 90, 30);
		
		la4.setBounds(10, 145, 50, 30);
		bar3.setBounds(65, 145, 450, 30);
		tf3.setBounds(520, 145, 90, 30);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		add(p);
		p.setBounds(10, 180, 600, 35);
		add(la1);
		add(la2);
		add(bar1);
		add(tf1);
		add(la3);
		add(bar2);
		add(tf2);
		add(la4);
		add(bar3);
		add(tf3);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==b1)
		{
			new Thread(this).start();
		}
	}
	public void go()
	{
		try
		{
			Random rnd=new Random();
			int a=rnd.nextInt(101);
			int b=rnd.nextInt(101);
			int c=rnd.nextInt(101);
			for(int i=0;i<=a;i++)
			{
				bar1.setValue(i);
				Thread.sleep(100);
			}
			for(int i=0;i<=b;i++)
			{
				bar2.setValue(i);
				Thread.sleep(100);
			}
			for(int i=0;i<=c;i++)
			{
				bar3.setValue(i);
				Thread.sleep(100);
			}
			tf1.setText(a+"%");
			tf2.setText(b+"%");
			tf3.setText(c+"%");
		}catch(Exception ex){}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}

}
