package com.sist;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

import twitter4j.FilterQuery;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

public class TwitterMain extends JFrame implements ActionListener{
	static JTable table;
	static DefaultTableModel model;
	JLabel la;
	JTextField tf;
	JButton bu;
	TableColumn column;
	//Twitter 관련
	TwitterStream ts; //트위터연결
	FilterQuery fq; //데이터를 가져옴
	public TwitterMain()
	{
		la=new JLabel("검색어");
		tf=new JTextField(20);
		bu=new JButton("검색");
		String[] col={"아이디","데이터"};
		String[][] row=new String[0][2];
		//model 생성
		model=new DefaultTableModel(row, col);
		
		//table 생성
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.getTableHeader().setBackground(new Color(255,128,255)); //col 아이디, 내용색 바꿈
		table.setRowHeight(35);//내용 나오는 것 세로 늘려줌!
		table.setShowVerticalLines(false); // 내용의 세로줄 없애기!
		JScrollPane js=new JScrollPane(table);
		js.getViewport().setBackground(Color.white);
		
		//배치
		
		JPanel p=new JPanel();
		p.add(la);
		p.add(tf);
		p.add(bu);
		
		
		add("North",p);
		add("Center",js);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for(int i=0;i<col.length;i++)
		{
			column=table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer rnd=new DefaultTableCellRenderer(); //아이디 가운데정렬하기1
			if(i==0)
			{
				column.setPreferredWidth(100);
				rnd.setHorizontalAlignment(JLabel.CENTER); //아이디는 가운데정렬2
			}
			else if(i==1)
			{
				column.setPreferredWidth(700); // 데이터가 더 크게!!column의 width 바꾸기
				rnd.setHorizontalAlignment(JLabel.LEFT);//데이터는 왼쪽정렬3
			}
			column.setCellRenderer(rnd);
			
		}
		/*String[] str={"admin","트위터 데이터 로딩"};
		for(int i=0;i<10;i++)
		{
			model.addRow(str); //model에 한줄씩 추가!
		}*/
		ts=new TwitterStreamFactory().getInstance();
		fq=new FilterQuery();
		TwitterListener list=new TwitterListener();
		ts.addListener(list);// 어떻게 처리할 것인가! 테이블에 출력하겠다는 것 list
		bu.addActionListener(this);//버튼눌렀을때 처리
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwitterMain m=new TwitterMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bu || e.getSource()==tf) //버튼 눌렀을 때, 또는 엔터를 눌렀을때 가능하도록
		{
			String data=tf.getText(); //입력한 데이터를 가지고 올 때 getText
			if(data.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요"); //보고있는 창위에 띄우기-> this
				tf.requestFocus();//커서이동시키기 깜박깜박!
				return;
			}
			String[] str={data}; //들어감 -> 검색해줘!
			fq.track(str);
			ts.filter(fq);
			
		}
	}

}
