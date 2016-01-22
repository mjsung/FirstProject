package com.sist;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMain3 extends JFrame implements MouseMotionListener{
	GameView gv=new GameView();
	public MouseMain3()
	{
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		gv.addMouseMotionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseMain3();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		gv.x=e.getX();
		gv.y=e.getY();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
