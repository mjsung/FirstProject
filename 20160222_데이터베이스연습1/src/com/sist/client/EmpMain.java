package com.sist.client;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import com.sist.dao.*;

import sun.net.www.content.image.jpeg;

public class EmpMain extends JFrame implements MouseListener, ActionListener{
	JTable table;
	DefaultTableModel model;
	JLabel la;
	JLabel la1;
	JComboBox box;
	JTextField tf;
	JButton b1,b2;
	public EmpMain()
	{
		String[] col={"���","�̸�","����","�Ի���","�μ���ȣ"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row, col)
		{
			public boolean isCellEditable(int r, int c)
			{
				return false;
			}
		};
		table=new JTable(model);
		JScrollPane js= new JScrollPane(table);
		la = new JLabel("������");
		la.setFont(new Font("����������", Font.BOLD, 30));
		table.setFont(new Font("����������", Font.PLAIN, 12));
		JPanel p=new JPanel();
		p.add(la);
		
		la1=new JLabel("Search");
		tf=new JTextField(10);
		box=new JComboBox();
		box.addItem("�̸�");
		box.addItem("�Ի���");
		box.addItem("�μ�");
		b1=new JButton("ã��");
		b2=new JButton("���");
		JPanel p1=new JPanel();
		p1.add(la1);
		p1.add(box);
		p1.add(tf);
		p1.add(b1);
		p1.add(b2);
		add("South",p1);
		add("Center",js);
		add("North",p);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getData();
		table.addMouseListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void getData()
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		EmpDAO dao=new EmpDAO();
		ArrayList<EmpDTO> list = dao.empAllData();
		for(EmpDTO d:list)	
		{
			String[] data={
				String.valueOf(d.getEmpno()),
				d.getEname(),
				d.getJob(),
				d.getHiredate().toString(),
				String.valueOf(d.getDeptno())
			};
			model.addRow(data);
		}
	}
	public void getFindData(String column, String fdata)
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		EmpDAO dao=new EmpDAO();
		ArrayList<EmpDTO> list = dao.empFindData(column,fdata);
		for(EmpDTO d:list)	
		{
			String[] data={
				String.valueOf(d.getEmpno()),
				d.getEname(),
				d.getJob(),
				d.getHiredate().toString(),
				String.valueOf(d.getDeptno())
			};
			model.addRow(data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpMain();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow();
				String sabun=model.getValueAt(row, 0).toString();
				EmpDAO dao=new EmpDAO();
				EmpDTO d=dao.empDetailData(Integer.parseInt(sabun));
				String msg="���:"+d.getEmpno()+"\n"
						+"�̸�:"+d.getEname()+"\n"
						+"����:"+d.getJob()+"\n"
						+"�����ȣ:"+d.getMgr()+"\n"
						+"�Ի���:"+d.getHiredate().toString()+"\n"
						+"�޿�:"+d.getSal()+"\n"
						+"������:"+d.getComm()+"\n"
						+"�μ���ȣ:"+d.getDeptno();
				JOptionPane.showMessageDialog(this, msg);
						
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			int index=box.getSelectedIndex();
			String column="";
			if(index==0)
				column="ename";
			else if(index==1)
				column="hiredate";
			else
				column="deptno";
			String data=tf.getText().trim();
			if(data.length()<1)
			{
				tf.requestFocus();
				return;
			}
			getFindData(column, data);
		}
		if(e.getSource()==b2)
		{
			getData();
		}
	}

}
