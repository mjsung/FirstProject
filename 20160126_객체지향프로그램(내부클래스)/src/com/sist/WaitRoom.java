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
		String[] col={"�̸�", "����", "��ȭ"};
		Object[][] row=new Object [0][3]; //object -> � �����͵� ���� �� ����.�׸��� ���� �� ����
		model=new DefaultTableModel(row, col)
		{

			
			
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; //����Ŭ�� �� ���� ���ϰ� �ϱ�
			}

			@Override
			public Class getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			//�͸��� Ŭ����, getColumnClass �׸� �ҷ����� ��  
			
		};
		table=new JTable(model);
		table.setRowHeight(70);
		//MV ������ ������� ���� �� (model view)
		JScrollPane js=new JScrollPane(table);
		
		add("Center",js);
		setSize(640,480);
		setVisible(true);
		
		Object[] data={"ȫ�浿", new ImageIcon("c:\\image\\m.gif"), new Boolean(true)};
		//new Boolean(true) -> üũ�ڽ� üũ�Ǿ� ����
		model.addRow(data);
		Object[] data1={"��û��", new ImageIcon("c:\\image\\w.gif"), new Boolean(false)};
		model.addRow(data1);
		addWindowListener(new WindowAdapter() {
			//�͸��� Ŭ����
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
