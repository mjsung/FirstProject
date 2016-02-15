package com.sist;
import java.awt.*;
import javax.swing.*;

public class HorseSetting extends JFrame{
	JLabel[] la=new JLabel[5];
	JTextField[] tf=new JTextField[5];
	JButton b1,b2;
	public HorseSetting()
	{
		setLayout(null);
		for(int i=0; i<la.length;i++)
		{
			la[i]=new JLabel((i+1)+"¹ø ¸»");
			tf[i]=new JTextField();
			la[i].setBounds(10,15+(i*35),40,30);
			tf[i].setBounds(55, 15+(i*35), 150, 30);
			add(la[i]);
			add(tf[i]);
		}
		b1=new JButton("Setting");
		b2=new JButton("Cancel");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 190, 195, 35);
		add(p);
		setSize(230, 280);
		//setVisible(true);
	
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HorseSetting();
	}*/

}
