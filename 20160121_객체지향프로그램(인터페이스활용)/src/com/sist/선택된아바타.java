package com.sist;
import java.awt.*;
import javax.swing.*;
public class ���õȾƹ�Ÿ  extends JFrame{
	 JLabel la;
     public ���õȾƹ�Ÿ()
     {
    	 la=new JLabel("");
    	 add("Center",la);
    	 
     }
     public void set(int index,int selNum)
     {
    	 la.setIcon(new ImageIcon("c:\\image\\"+(index==0?"m":"w")+""+selNum+".gif"));
     }
}
