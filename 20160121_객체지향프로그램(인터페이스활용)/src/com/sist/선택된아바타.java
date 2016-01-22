package com.sist;
import java.awt.*;
import javax.swing.*;
public class 선택된아바타  extends JFrame{
	 JLabel la;
     public 선택된아바타()
     {
    	 la=new JLabel("");
    	 add("Center",la);
    	 
     }
     public void set(int index,int selNum)
     {
    	 la.setIcon(new ImageIcon("c:\\image\\"+(index==0?"m":"w")+""+selNum+".gif"));
     }
}
