package com.sist;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class GameView extends JPanel{
    Image back,move,chong;
    int x,y;
    Graphics gg;
    ArrayList<ChongThread> list=
    		new ArrayList<ChongThread>();
    public GameView()
    {
    	x=340;
    	y=430;
    	back=Toolkit.getDefaultToolkit().getImage("c:\\image\\sky.png");
    	move=Toolkit.getDefaultToolkit().getImage("c:\\image\\spider1.png");
    	chong=Toolkit.getDefaultToolkit().getImage("c:\\image\\w0.png");
        
    }
    public void createChong(int x,int y)
    {
    	ChongThread ct=
    			new ChongThread(x, y);
    	list.add(ct);
    	ct.start();
    }
    public void paint(Graphics g)
    {
    	gg=g;
    	g.drawImage(back, 0,0,getWidth(),getHeight(),this);
    	g.drawImage(move, x,y,this);
		for(ChongThread c:list)
		{
			g.drawImage(chong,c.mx, c.my, this);
		}
    }
    
    class ChongThread extends Thread
    {
    	int mx,my;
    	public ChongThread(int mx,int my)
    	{
    		this.mx=mx;
    		this.my=my;
    	}
    	public void run()
    	{
    		try
    		{
    			while(true)
    			{
    				my-=5;
    				if(my<0)
    				{
    					my=-30;
    					interrupt();
    				}
    				

    				Thread.sleep(100);
    				repaint();
    			}
    		}catch(Exception ex){}
    	}
    }
}





