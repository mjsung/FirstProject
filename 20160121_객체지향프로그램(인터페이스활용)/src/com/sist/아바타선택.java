package com.sist;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 *   event (interface)
 *     ActionListener 
 *       actionPerformed : Button,Menu,TextField
 *     MouseListener
 *       mouseClicked
 *       mousePressed
 *       mouseReleaed
 *       mouseEntered
 *       mouseExited
 *     MouseMotionListener
 *       mouseMoved
 *       mouseDragged
 *     KeyListener
 *       keyPressed
 *       keyReleased
 *       keyTyped
 *     ItemListener
 *       itemStateChanged
 */
public class 아바타선택  extends JFrame 
implements ActionListener,ItemListener
{

	JLabel la;
	JComboBox box;
	JLabel av1,av2,av3;
	JRadioButton rb1,rb2,rb3;
	선택된아바타 s=new 선택된아바타();
	int sel=0;
	public 아바타선택()
	{
		la=new JLabel("성별");
		box=new JComboBox();
		box.addItem("남자");
		box.addItem("여자");
		av1=new JLabel(new ImageIcon("c:\\image\\m1.gif"));
		av2=new JLabel(new ImageIcon("c:\\image\\m2.gif"));
		av3=new JLabel(new ImageIcon("c:\\image\\m3.gif"));
		
		rb1=new JRadioButton("");
		rb2=new JRadioButton("");
		rb3=new JRadioButton("");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		rb1.setSelected(true);
		//배치
				setLayout(null);
				la.setBounds(10,15,40,30);
				box.setBounds(55,15,100,30);
				av1.setBounds(10, 65, 150, 200);
				av2.setBounds(165, 65, 150, 200);
				av3.setBounds(320, 65, 150, 200);
				
				rb1.setBounds(75,270,30,30);
				rb2.setBounds(230,270,30,30);
				rb3.setBounds(385,270,30,30);
				//추가
				add(la); 
				add(box);
				add(av1); add(av2); add(av3);
				add(rb1); add(rb2); add(rb3);
				setSize(495, 350);
				setVisible(true);
				box.addItemListener(this);

		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        아바타선택 a=new 아바타선택();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			int index=box.getSelectedIndex();
			char c='m';
			if(index==0)
			{
				c='m';
				sel=0;
			}
			else
			{
				c='w';
				sel=1;
			}
			
			av1.setIcon(new ImageIcon("c:\\image\\"+c+"1.gif"));
			av2.setIcon(new ImageIcon("c:\\image\\"+c+"2.gif"));
			av3.setIcon(new ImageIcon("c:\\image\\"+c+"3.gif"));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int selNum=0;
		if(e.getSource()==rb1)
		{
			selNum=1;
		}
		else if(e.getSource()==rb2)
		{
			selNum=2;
		}
		else if(e.getSource()==rb3)
		{
			selNum=3;
		}
		s.set(sel, selNum);
		for(int i=0;i<120;i++)
		{
		 s.setBounds(345,0, i, 170);
		 
		 try
		 {
			 Thread.sleep(100);
		 }catch(Exception e1){}
		 s.setVisible(true);
		}
	}

}
