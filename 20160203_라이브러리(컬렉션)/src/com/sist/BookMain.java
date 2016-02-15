package com.sist;
/*
 *   Ŭ���� �뵵 
 *     = �����͸� ��Ƽ� ����ϴ� Ŭ����  => DTO,VO
 *     = �����͸� Ȱ���ϴ� Ŭ����  => DAO
 *     = ����� ���� (������,��,�ȵ���̵�) => ������
 *     
 *     
 *     MyBatis,JPA,Hibernate,XML,Annotation
����Ŭ  => JSP => Spring => Hadoop => R
====================================
                                                ����ũ    Node.js,Mean Stack
                  MongoDB 
                  IOT => ����(��ŷ,��ť�� �ڵ�) 
        (HTML,JavaScript,JQuery,AngularJS)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/*
 *    java : JDK 1.0 (Java)
 *    javax : JDK 1.2 (Java2) : swing,servlet,xml
 *    => JDK 1.8 (Java3) : ���ٽ�,����ȥ(�ڹٽ�ũ��Ʈ ����),JavaFx
 *                        ======
 *                        �Լ��������̽� 
 *       =====> ����Ŭ�翡 ó������ ����   <-
 */
import javax.swing.table.*;
public class BookMain extends JFrame implements MouseListener, ItemListener{
    JTable table;
    DefaultTableModel model;
    BookPanel bp=new BookPanel();
    BookManager bm=new BookManager();
    JLabel la1,la2,la3,la4,la5;
    JComboBox box;
    JLabel la6;
    JTextField tf;
    JButton b;
    public BookMain()
    {
    	String[] col={"��ȣ","����","����"};
    	String[][] row=new String[0][3];
    	model=new DefaultTableModel(row,col)
    	{
    		public boolean isCellEditable(int r,int c)
    		{
    			return false;
    		}
   		};
   		table=new JTable(model);
   		JScrollPane js=new JScrollPane(table);
   		la1=new JLabel("��ȣ:");
   		la2=new JLabel("����:");
   		la3=new JLabel("����:");
   		la4=new JLabel("���ǻ�:");
   		la5=new JLabel("����:");
   		la6=new JLabel("Search");
    	box=new JComboBox();
    	box.addItem("��Ű�Ͻ�");
    	box.addItem("�Ѻ��̵��");
    	box.addItem("�������ǻ�");
    	box.addItem("�븲���ǻ�");
    	tf=new JTextField(20);
    	tf.setEditable(false);
    	b=new JButton("��ü���"); 
    	//<input type=text readonly>
    	JPanel p=new JPanel();
    	p.add(la6);
    	p.add(box);
    	p.add(tf);
    	p.add(b);
    	// ��ġ
    	setLayout(null);
    	p.setBounds(10, 15, 620, 35);
    	js.setBounds(10, 55, 620, 245);
    	bp.setBounds(10, 320, 300, 170);
    	la1.setBounds(320, 320, 300, 30);
    	la2.setBounds(320, 355, 300, 30);
    	la3.setBounds(320, 390, 300, 30);
    	la4.setBounds(320, 425, 300, 30);
    	la5.setBounds(320, 460, 300, 30);
    	add(p);
    	add(js);
    	add(bp);
    	add(la1);add(la2);
    	add(la3);add(la4);
    	add(la5);
    	
    	setSize(640,550);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	getData();
    	getData();
    	table.addMouseListener(this);
    	box.addItemListener(this);
    	b.addMouseListener(this);
    }
    public void getData()
    {
    	for(int i=model.getRowCount()-1;i>=0;i--)
    	{
    		model.removeRow(i); //�����, table�� ���������� ������ �ȳ��� ����. ���� 0������ ����� �ϳ��� ����
    	}
    	ArrayList<Book> list=bm.bookALLData();
    	for(Book book:list)
    	{
    		String[] data={
    			String.valueOf(book.getNo()),
    			book.getTitle(), 
    			book.getAuthor()
    		};
    		model.addRow(data);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookMain();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)//����Ŭ��
			{
				int row=table.getSelectedRow();
				String no=model.getValueAt(row, 0).toString();
				bp.setPoster(Integer.parseInt(no));
				bp.repaint(); //repaint�� �ؾ� �׸��� �ٲ�
				Book book=bm.bookDetail(Integer.parseInt(no));
				la1.setText("��ȣ:"+no);
				la2.setText("����:"+book.getTitle());
				la3.setText("����:"+book.getAuthor());
				la4.setText("���ǻ�:"+book.getPublisher());
				la5.setText("����:"+book.getPrice());
			}
		}
		else if(e.getSource()==b)
		{
			getData();
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
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			getFindData();
		}
	}
	public void getFindData()
    {
    	for(int i=model.getRowCount()-1;i>=0;i--)
    	{
    		model.removeRow(i);
    	}
    	String pub=box.getSelectedItem().toString();
    	ArrayList<Book> list=bm.bookFindData(pub);
    	tf.setText(pub);
    	for(Book book:list)
    	{
    		String[] data={
    			String.valueOf(book.getNo()),
    			book.getTitle(),
    			book.getAuthor()
    		};
    		model.addRow(data);
    	}
    }
	

}












