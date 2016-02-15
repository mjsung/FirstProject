package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class BoardList extends JPanel{
     JLabel la;
     JButton b1;
     JTable table;
     DefaultTableModel model;
     JLabel la2;
     JComboBox box;
     JTextField tf;
     JButton b2,b3,b4,b5;
     JLabel pageLa;
     TableColumn column;
     /*
      *   ������ => �޸��Ҵ�ÿ� �ѹ��� ȣ�� 
      *   ====
      *    Ư¡) Ŭ������� ���� 
      *        ����� �ʱ�ȭ 
      *        �����ε����� => �������� ���� 
      *        *** ��ӿ��� ���ܰ� �ȴ� 
      *        
      *    ===> �ʱ�ȭ �� 
      *    �ν��Ͻ� �ʱ�ȭ ��  {}
      *    static �� �ʱ�ȭ �� static{}
      *    class�������� ������ ����� �� ���� 
      *      ==> ���� ���� �ϴ� 
      *      
      *    ****** ���̺귯�� ��� 
      *      = ���� : �ִ� �״�� ��� 
      *      = ��� : ������ ���� 
      */
     public BoardList()
     {
    	 la=new JLabel("�Խ���");
    	 la.setFont(new Font("���� ���",Font.BOLD,30));
    	 b1=new JButton("����");
    	 JPanel p=new JPanel();
    	 p.add(la);
    	 
    	 String[] col={"��ȣ","����","�̸�","�ۼ���","��ȸ��"};
    	 String[][] row=new String[0][5];
    	 model=new DefaultTableModel(row, col)
    	 {
    		 public boolean isCellEditable(int r,int c)
    		 {
    			 return false;
    		 }
    	 };
    	 table=new JTable(model);
    	 table.setRowHeight(27);
    	 table.setShowGrid(false);
    	 table.setSelectionBackground(Color.lightGray);
    	 table.setSelectionForeground(Color.ORANGE);
    	 table.getTableHeader().setReorderingAllowed(false);
    	 table.getTableHeader().setResizingAllowed(false);
    	 table.getTableHeader().setBackground(Color.ORANGE);
    	 JScrollPane js=new JScrollPane(table);
    	 js.getViewport().setBackground(Color.white);
    	 la2=new JLabel("Search");
    	 box=new JComboBox();
    	 box.addItem("�̸�");
    	 box.addItem("����");
    	 box.addItem("����");
    	 b2=new JButton("ã��");
    	 b3=new JButton("���");
    	 b4=new JButton("����");
    	 b5=new JButton("����");
    	 pageLa=new JLabel("0 page / 0 pages");
    	 tf=new JTextField(10);
    	 JPanel p1=new JPanel();
    	 p1.add(la2);
    	 p1.add(box);
    	 p1.add(tf);
    	 p1.add(b2);
    	 p1.add(b3);
    	 JPanel p2=new JPanel();
    	 p2.add(b4);
    	 p2.add(b5);
    	 p2.add(pageLa);
    	 
    	 setLayout(null);
    	 p.setBounds(10, 15, 770, 45);
    	 b1.setBounds(10, 65, 100, 30);
    	 js.setBounds(10, 100, 770, 400);
    	 p1.setBounds(10, 505, 350, 35);
    	 p2.setBounds(550, 505, 230, 35);
    	 add(p);
    	 add(b1);
    	 add(js);
    	 add(p1);
    	 add(p2);
    	 for(int i=0;i<col.length;i++)
    	 {
    		 column=table.getColumnModel().getColumn(i);
    		 DefaultTableCellRenderer rnd=new DefaultTableCellRenderer();
    		 if(i==0)
    		 {
    			 column.setPreferredWidth(60);
    			 rnd.setHorizontalAlignment(JLabel.CENTER);
    		 }
    		 if(i==1)
    		 {
    			 column.setPreferredWidth(400);
    			 
    		 }
    		 if(i==2)
    		 {
    			 column.setPreferredWidth(100);
    			 rnd.setHorizontalAlignment(JLabel.CENTER);
    		 }
    		 if(i==3)
    		 {
    			 column.setPreferredWidth(120); 
    			 rnd.setHorizontalAlignment(JLabel.CENTER);
    		 }
    		 if(i==4)
    		 {
    			 column.setPreferredWidth(60);
    			 rnd.setHorizontalAlignment(JLabel.RIGHT);
    		 }
    		 column.setCellRenderer(rnd);
    	 }
     }
}




