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
	//Twitter ����
	TwitterStream ts; //Ʈ���Ϳ���
	FilterQuery fq; //�����͸� ������
	public TwitterMain()
	{
		la=new JLabel("�˻���");
		tf=new JTextField(20);
		bu=new JButton("�˻�");
		String[] col={"���̵�","������"};
		String[][] row=new String[0][2];
		//model ����
		model=new DefaultTableModel(row, col);
		
		//table ����
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.getTableHeader().setBackground(new Color(255,128,255)); //col ���̵�, ����� �ٲ�
		table.setRowHeight(35);//���� ������ �� ���� �÷���!
		table.setShowVerticalLines(false); // ������ ������ ���ֱ�!
		JScrollPane js=new JScrollPane(table);
		js.getViewport().setBackground(Color.white);
		
		//��ġ
		
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
			DefaultTableCellRenderer rnd=new DefaultTableCellRenderer(); //���̵� ��������ϱ�1
			if(i==0)
			{
				column.setPreferredWidth(100);
				rnd.setHorizontalAlignment(JLabel.CENTER); //���̵�� �������2
			}
			else if(i==1)
			{
				column.setPreferredWidth(700); // �����Ͱ� �� ũ��!!column�� width �ٲٱ�
				rnd.setHorizontalAlignment(JLabel.LEFT);//�����ʹ� ��������3
			}
			column.setCellRenderer(rnd);
			
		}
		/*String[] str={"admin","Ʈ���� ������ �ε�"};
		for(int i=0;i<10;i++)
		{
			model.addRow(str); //model�� ���پ� �߰�!
		}*/
		ts=new TwitterStreamFactory().getInstance();
		fq=new FilterQuery();
		TwitterListener list=new TwitterListener();
		ts.addListener(list);// ��� ó���� ���ΰ�! ���̺� ����ϰڴٴ� �� list
		bu.addActionListener(this);//��ư�������� ó��
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwitterMain m=new TwitterMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bu || e.getSource()==tf) //��ư ������ ��, �Ǵ� ���͸� �������� �����ϵ���
		{
			String data=tf.getText(); //�Է��� �����͸� ������ �� �� getText
			if(data.length()<1)
			{
				JOptionPane.showMessageDialog(this, "�˻�� �Է��ϼ���"); //�����ִ� â���� ����-> this
				tf.requestFocus();//Ŀ���̵���Ű�� ���ڱ���!
				return;
			}
			String[] str={data}; //�� -> �˻�����!
			fq.track(str);
			ts.filter(fq);
			
		}
	}

}
