package com.sist.client;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameRoom extends JPanel
{
	GameView myPanel=new GameView();
	GameView youPanel=new GameView();
    JPanel my=new JPanel();
    JPanel you=new JPanel();
    JTextField myid=new JTextField();
    JTextField youid=new JTextField();
    JTextArea ta;
    JTextField tf;
    JButton b1,b2,b3;
    public GameRoom()
    {
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	tf=new JTextField();
    	b1=new JButton("����");
    	b2=new JButton("�غ�");
    	b1.setEnabled(false);
    	b2.setEnabled(false);
    	b3=new JButton("������");
    	my.setBackground(Color.black);
    	you.setBackground(Color.black);
    	
    	setLayout(null);
    	my.setBounds(10, 15,180, 150);
    	you.setBounds(350, 15, 180,150);
    	myid.setBounds(10, 170, 180, 30);
    	youid.setBounds(350, 170, 180, 30);
    	myPanel.setBounds(10, 210, 520, 320);
    	js.setBounds(540, 15, 230, 200);
    	tf.setBounds(540, 220, 230, 30);
    	youPanel.setBounds(540, 260, 230, 180);
    	myPanel.btnInit();
    	
    	youPanel.btnInit();
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(3, 1,5,5));
    	p.add(b1);
    	p.add(b2);
    	p.add(b3);
    	p.setBounds(540, 450, 230, 80);
    	add(my);
    	add(you);
    	add(myid);
    	add(youid);
    	add(myPanel);
    	add(js);
    	add(tf);
    	add(youPanel);
    	add(p);
    	
    }

}

