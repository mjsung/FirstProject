package com.sist;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class HorseGameView extends JPanel{
    Image horse1;
    HorseGameMain hgm=null;
    static int grade;// ��� üũ 
    int x,y;
    HorseThread ht;
    public HorseGameView(HorseGameMain hgm)
    {
    	this.hgm=hgm;
    	int a=(int)(Math.random()*2);
    	if(a==0)
    	horse1=Toolkit.getDefaultToolkit().getImage("c:\\image\\h1.gif");
    	else
    	horse1=Toolkit.getDefaultToolkit().getImage("c:\\image\\h11.gif");
    }
    public void threadSetting(String name)
    {
    	ht=new HorseThread();
    	ht.setName(name);
    }
    public void paint(Graphics g)
    {
    	g.setColor(Color.white);
    	g.fillRect(0, 0, getWidth(), getHeight());	
    	g.drawImage(horse1,x, y, this);	
    }
    class HorseThread extends Thread
    {
    	public void run()
    	{
    		for(int i=0;i<=1000;i++)
    		{
    			if(Thread.currentThread().getName().equals(hgm.hs.tf[0].getText()))
    			{
    				x+=10;
    				hgm.bar[0].setValue(x);
    				if(x>1000)
    				{
    					x=1500;
    					interrupt();
    					grade++;
    					String name=hgm.hs.tf[0].getText();
    					hgm.ta.append("�ڡڡ�"+name+"�� �ڡڡ�"+grade+"��\n");
    					break;
    				}
    				Random rnd=new Random();
    				int value=rnd.nextInt(100)+10;
    				try
    				{
    				  Thread.sleep(value);
    				}catch(Exception ex){}
    			}
    			if(Thread.currentThread().getName().equals(hgm.hs.tf[1].getText()))
    			{
    				x+=10;
    				hgm.bar[1].setValue(x);
    				if(x>1000)
    				{
    					x=1500;
    					interrupt();
    					grade++;
    					String name=hgm.hs.tf[1].getText();
    					hgm.ta.append("�ڡڡ�"+name+"�� �ڡڡ�"+grade+"��\n");
    					break;
    				}
    				Random rnd=new Random();
    				int value=rnd.nextInt(100)+10;
    				try
    				{
    				  Thread.sleep(value);
    				}catch(Exception ex){}
    			}
    			if(Thread.currentThread().getName().equals(hgm.hs.tf[2].getText()))
    			{
    				x+=10;
    				hgm.bar[2].setValue(x);
    				if(x>1000)
    				{
    					x=1500;
    					interrupt();
    					grade++;
    					String name=hgm.hs.tf[2].getText();
    					hgm.ta.append("�ڡڡ�"+name+"�� �ڡڡ�"+grade+"��\n");
    					break;
    				}
    				Random rnd=new Random();
    				int value=rnd.nextInt(100)+10;
    				try
    				{
    				  Thread.sleep(value);
    				}catch(Exception ex){}
    			}
    			if(Thread.currentThread().getName().equals(hgm.hs.tf[3].getText()))
    			{
    				x+=10;
    				hgm.bar[3].setValue(x);
    				if(x>1000)
    				{
    					x=1500;
    					interrupt();
    					grade++;
    					String name=hgm.hs.tf[3].getText();
    					hgm.ta.append("�ڡڡ�"+name+"�� �ڡڡ�"+grade+"��\n");
    					break;
    				}
    				Random rnd=new Random();
    				int value=rnd.nextInt(100)+10;
    				try
    				{
    				  Thread.sleep(value);
    				}catch(Exception ex){}
    			}
    			if(Thread.currentThread().getName().equals(hgm.hs.tf[4].getText()))
    			{
    				x+=10;
    				hgm.bar[4].setValue(x);
    				if(x>1000)
    				{
    					x=1500;
    					interrupt();
    					grade++;
    					String name=hgm.hs.tf[4].getText();
    					hgm.ta.append("�ڡڡ�"+name+"�� �ڡڡ�"+grade+"��\n");
    					break;
    				}
    				Random rnd=new Random();
    				int value=rnd.nextInt(100)+10;
    				try
    				{
    				  Thread.sleep(value);
    				}catch(Exception ex){}
    			}
    		}
    	}
    }
}




