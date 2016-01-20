package com.sist;
//JLabel
import java.awt.*; //Layout
import javax.swing.*; //window
public class MyWindow2 extends JFrame{
	JLabel[] la=new JLabel[9]; //배열선언이지 메모리 할당이 아님(null)
	JMenuItem start,stop,end; // 나중에 또 써야하니까! 위로 빼서 여기에 써주는거!
	public MyWindow2()
	{
		JMenuBar bar=new JMenuBar(); //위에 file edit source와 같이 회색바, 그 밑에 나오는 것들은 MenuItem
		JMenu menu=new JMenu("Game");
		start=new JMenuItem("Game Start");
		stop=new JMenuItem("Game Stop");
		end=new JMenuItem("Game Exit");
		//메뉴연결
		menu.add(start);
		menu.add(stop);
		menu.addSeparator(); //메뉴아이템 나눠주는 구분선(기능이 다른 것들은 구분선으로 표시한다)
		menu.add(end);
		
		bar.add(menu);
		
		setJMenuBar(bar);
		
		setLayout(new GridLayout(3,3,5,5)); //row,col, 좌우간격
		for(int i=0;i<9;i++)
		{
			int rnd=(int)(Math.random()*9)+1;
			la[i]=new JLabel(new ImageIcon("c:\\image\\"+rnd+".gif")); //메모리 할당은 여기서!
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
