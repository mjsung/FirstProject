package com.sist;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

//더블클릭 이벤트 연습
public class MouseMain2 extends JFrame implements MouseListener{
	JTable table;
	DefaultTableModel model;
	public MouseMain2()
	{
		String[] col={"사번","이름","부서"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row, col)
		{
			//익명의 클래스, 상속은 한번밖에 안되니까 오버라이딩
			public boolean isCellEditable(int r,int c)
			{
				return false; //이게 들어가야 창이떴을때 데이터가 더블클릭 했을 때 편집이 안됨
			}
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		add("Center",js);
		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		String[] data1={"1","홍길동","영업부"};
		model.addRow(data1);
		
		String[] data2={"2","심청이","개발부"};
		model.addRow(data2);

		String[] data3={"3","춘향이","기획부"};
		model.addRow(data3);
	
		String[] data4={"4","박문수","자재부"};
		model.addRow(data4);
	
		String[] data5={"5","김두한","인사부"};
		model.addRow(data5);
		
		table.addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseMain2();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow(); //선택을 했을 때 몇번째 줄을 선택했는지 확인해줌, 줄수는 0번부터.
				String sabun=model.getValueAt(row, 0).toString();
				String name=model.getValueAt(row, 1).toString();
				String dept=model.getValueAt(row, 2).toString();
				
				String res="사번:"+sabun+"\n"
				+"이름:"+name+"\n"
				+"부서:"+dept+"\n";
				
				JOptionPane.showMessageDialog(this, res);
				
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

}
