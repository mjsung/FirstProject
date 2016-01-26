package com.sist.game;
import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel{
     Image img0,img1,img21,img31,img22,img32;
     Image[] front=new Image[4];
     Image move;
     int type=0;
     int x=155;
     int y=350;
     int f=0;
     public GameView()
     {
    	 img0=Toolkit.getDefaultToolkit().getImage("c:\\image\\img0.png");
    	 img1=Toolkit.getDefaultToolkit().getImage("c:\\image\\img1.png");
    	 img21=Toolkit.getDefaultToolkit().getImage("c:\\image\\img21.png");
    	 img31=Toolkit.getDefaultToolkit().getImage("c:\\image\\img31.png");
    	 img22=Toolkit.getDefaultToolkit().getImage("c:\\image\\img22.png");
    	 img32=Toolkit.getDefaultToolkit().getImage("c:\\image\\img32.png");
         for(int i=0;i<4;i++)
         {
        	 front[i]=Toolkit.getDefaultToolkit().
        			 getImage("c:\\image\\front0"
        	         +(i+1)+".png");
         }
         move=front[0];
    	 new BackThead().start();
    	 new FrontThread().start();
     }
	@Override
	public void paint(Graphics g) {
		g.drawImage(img0, 0, 0, this);
		g.drawImage(img1, 0, 90, this);
		if(type==0)
		{
		  g.drawImage(img21, 0, 190, this);
		  g.drawImage(img31, 0, 310, this);
		}
		else
		{
		  g.drawImage(img22, 0, 190, this);
		  g.drawImage(img32, 0, 310, this);
		}
		
		
		g.drawImage(move,x,y,this);
			
		
	}
	class BackThead extends Thread
	{
		int a=0;
		public void run()
		{
			try
			{
				while(true)
				{
					if(a%2==0)
						type=0;
					else
						type=1;
					a++;
					Thread.sleep(100);
					repaint();
				}
			}catch(Exception ex){}
		}
	}
	class FrontThread extends Thread
	{
		int a=0;
		int b=0;
		public void run()
		{
			while(true)
			{
				if(a%2==0)
					x+=10;
				else
					x-=10;
				a++;
				
				b=b%4;
				move=front[b];
				
				b++;
				
				try
				{
					Thread.sleep(500);
				}catch(Exception ex){}
				repaint();
			}
		}
	}
     
}




