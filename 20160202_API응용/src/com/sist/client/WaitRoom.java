package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class WaitRoom extends JPanel{
	JTable table1,table2; //테이블 외곽
	DefaultTableModel model1,model2;
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JButton b1,b2,b3,b4,b5,b6;
	
	WaitRoom()
	{
		String[] col1={"방이름", "공개/비공개", "인원"}; //타이틀
		String[][] row1=new String[0][3]; //0부분은 없었다가 생기게 만든다
		model1=new DefaultTableModel(row1, col1);
		table1=new JTable(model1);
		JScrollPane js1=new JScrollPane(table1);
		
		String[] col2={"ID", "대화명", "성별", "위치"}; //타이틀
		String[][] row2=new String[0][4]; //0부분은 없었다가 생기게 만든다
		model2=new DefaultTableModel(row2, col2);
		table2=new JTable(model2);
		JScrollPane js2=new JScrollPane(table2);
		
		ta=new JTextArea(); //채팅이 들어가는 부분 스크롤바!
		JScrollPane js3=new JScrollPane(ta);
		
		tf=new JTextField();
		box=new JComboBox();
		box.addItem("white");
		box.addItem("green");
		box.addItem("pink");
		box.addItem("cyan");
		box.addItem("blue");
		
		b1=new JButton("방만들기");
		b2=new JButton("방들어가기");
		b3=new JButton("1:1게임");
		b4=new JButton("쪽지보내기");
		b5=new JButton("정보보기");
		b6=new JButton("나가기");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3, 2, 5, 5)); //버튼이 2개씩 3줄 생김 , 그 다음 숫자는 좌우간격
		p.add(b1); p.add(b2);
		p.add(b3); p.add(b4);
		p.add(b5); p.add(b6);
		
		setLayout(null);
		js1.setBounds(10, 15, 500, 350);
		js2.setBounds(10, 370, 500, 180);
		js3.setBounds(515, 15, 265, 300);	
		tf.setBounds(515, 320, 160, 30);
		box.setBounds(680, 320, 100, 30);
		p.setBounds(515, 470, 265, 80); //버튼 배치
		
		add(js1);
		add(js2);
		add(js3);
		add(tf);
		add(box);
		add(p);
		
	}
	

}
