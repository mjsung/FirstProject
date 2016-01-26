package com.sist;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.table.*;

public class WaitRoom extends JFrame {
	JTable table;
	DefaultTableModel model;
	public WaitRoom()
	{
		String[] col={"이름", "성별", "전화"};
		Object[][] row=new Object [0][3]; //object -> 어떤 데이터든 받을 수 있음.그림도 넣을 수 있음
		model=new DefaultTableModel(row, col)
		{

			
			
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; //더블클릭 시 수정 못하게 하기
			}

			@Override
			public Class getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			//익명의 클래스, getColumnClass 그림 불러오는 것  
			
		};
		table=new JTable(model);
		table.setRowHeight(70);
		//MV 모양따로 내용따로 가는 것 (model view)
		JScrollPane js=new JScrollPane(table);
		
		add("Center",js);
		setSize(640,480);
		setVisible(true);
		
		Object[] data={"홍길동", new ImageIcon("c:\\image\\m.gif"), new Boolean(true)};
		//new Boolean(true) -> 체크박스 체크되어 들어옴
		model.addRow(data);
		Object[] data1={"심청이", new ImageIcon("c:\\image\\w.gif"), new Boolean(false)};
		model.addRow(data1);
		addWindowListener(new WindowAdapter() {
			//익명의 클래스
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		
		
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WaitRoom();
	}
	

}
