package com.sist;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SlotMain extends JFrame implements Runnable, ActionListener{
	SlotView sv=new SlotView();
	JButton b1,b2;
	static boolean bThread;
	Thread t;
	public SlotMain()
	{
		b1=new JButton("STRAT");
		b2=new JButton("STOP");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		add("Center", sv);
		add("South",p);
		setSize(300,350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b2.setEnabled(false);
		
		//new Thread(this).start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SlotMain();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(bThread)
			{
				sv.drawImage();
				Thread.sleep(100);
			}
		}catch(Exception ex){}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			bThread=true;
			b1.setEnabled(false);
			b2.setEnabled(true);
				t=new Thread(this);
				t.start();
			
		}	
		else if(e.getSource() ==b2)
		{
			bThread=false;
			b1.setEnabled(true);
			b2.setEnabled(false);
			t=null;
		}
	
	}

}
