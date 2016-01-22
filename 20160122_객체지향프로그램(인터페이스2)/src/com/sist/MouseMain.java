package com.sist;
/*
 *   mouseClicked ==> getClickCount()==2
 *   mouseReleased
 *   mousePressed
 *   mouseEntered
 *   mouseExited
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseMain extends JFrame
implements MouseListener
{
    JButton b1,b2;
    public MouseMain()
    {
    	b1=new JButton("로그인");
    	b2=new JButton("취소");
    	JPanel p=new JPanel();
    	p.add(b1);
    	p.add(b2);
    	add("North",p);
    	setSize(300,250);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	b1.addMouseListener(this);
    	b2.addMouseListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MouseMain();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
			b1.setForeground(Color.green);
		if(e.getSource()==b2)
			b2.setForeground(Color.green);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
			b1.setForeground(Color.black);
		if(e.getSource()==b2)
			b2.setForeground(Color.black);
	}

}



