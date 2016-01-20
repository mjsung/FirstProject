package com.sist;
//JLabel
import java.awt.*; //Layout
import javax.swing.*; //window
public class MyWindow2 extends JFrame{
	JLabel[] la=new JLabel[9]; //�迭�������� �޸� �Ҵ��� �ƴ�(null)
	JMenuItem start,stop,end; // ���߿� �� ����ϴϱ�! ���� ���� ���⿡ ���ִ°�!
	public MyWindow2()
	{
		JMenuBar bar=new JMenuBar(); //���� file edit source�� ���� ȸ����, �� �ؿ� ������ �͵��� MenuItem
		JMenu menu=new JMenu("Game");
		start=new JMenuItem("Game Start");
		stop=new JMenuItem("Game Stop");
		end=new JMenuItem("Game Exit");
		//�޴�����
		menu.add(start);
		menu.add(stop);
		menu.addSeparator(); //�޴������� �����ִ� ���м�(����� �ٸ� �͵��� ���м����� ǥ���Ѵ�)
		menu.add(end);
		
		bar.add(menu);
		
		setJMenuBar(bar);
		
		setLayout(new GridLayout(3,3,5,5)); //row,col, �¿찣��
		for(int i=0;i<9;i++)
		{
			int rnd=(int)(Math.random()*9)+1;
			la[i]=new JLabel(new ImageIcon("c:\\image\\"+rnd+".gif")); //�޸� �Ҵ��� ���⼭!
			add(la[i]);
		}
		setSize(350,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWindow2 m=new MyWindow2();
	}

}
