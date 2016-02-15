package com.sist;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class UserSelect extends JFrame{
	JLabel la1,la2,la3;
	public UserSelect()
	{
		la1=new JLabel(new ImageIcon("c:\\image\\b.png"));
		la2=new JLabel(new ImageIcon("c:\\image\\c.png"));
		la3=new JLabel(new ImageIcon("c:\\image\\a.png"));
		JPanel p=new JPanel();
		p.add(la1);
		p.add(la2);
		p.add(la3);
		add("Center", p);
		setSize(400, 180);
		
		
	}


}
