package com.sist;
import java.awt.*;
import javax.swing.*;

import java.awt.Toolkit;

public class GameView extends JPanel{
	Image back,move;
	int x,y;
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\back.jpg");
		move=Toolkit.getDefaultToolkit().getImage("c:\\image\\left.gif");
	}
	public void paint(Graphics g)
	{
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
		g.drawImage(move, x, y, this);
	}
}
