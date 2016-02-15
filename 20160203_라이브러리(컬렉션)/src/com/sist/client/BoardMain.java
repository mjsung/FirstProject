package com.sist.client;
import java.awt.*;
import javax.swing.*;

import com.sist.board.BoardDAO;
import com.sist.board.BoardDTO;

import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class BoardMain extends JFrame
implements ActionListener,MouseListener
{
    CardLayout card=new CardLayout();
    BoardList bList=new BoardList();
    BoardIU bIU=new BoardIU();
    BoardDAO dao=new BoardDAO();
    BoardContent bCont=new BoardContent();
    // ������
    int curpage=1;
    int totalpage=0;
    public BoardMain()
    {
    	setLayout(card);
    	
    	add("LIST",bList);
    	add("IU",bIU);
    	add("CONT",bCont);
    	setSize(800, 600);
    	setVisible(true);
    	//setDefaultCloseOperation(EXIT_ON_CLOSE);
    	bList.b1.addActionListener(this);
    	bIU.b2.addActionListener(this);
    	bIU.b1.addActionListener(this);
    	bList.b4.addActionListener(this);
    	bList.b5.addActionListener(this);
    	bList.table.addMouseListener(this);
    	bCont.b3.addActionListener(this);
    	bCont.b1.addActionListener(this);
    	bCont.b2.addActionListener(this);
    	addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try
				{
					File file=new File("c:\\image\\board.txt");
					ObjectOutputStream oos=
						new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(BoardDAO.getBoardList());
					oos.close();
				}catch(Exception ex){}
			}
    		
		});
    	getData();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new BoardMain();
	}
	// ����� ���� ��� 
	public void getData()
	{
		for(int i=bList.model.getRowCount()-1;i>=0;i--)
		{
			bList.model.removeRow(i);
		}
		ArrayList<BoardDTO> list=
				dao.boardALLData(curpage);
		for(BoardDTO d:list)
		{
			String[] data={
				String.valueOf(d.getNo()),
				d.getSubject(),
				d.getName(),
				/*
				 *   SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				 *   sdf.format(date)
				 *   
				 */
				new SimpleDateFormat("yyyy-MM-dd").format(d.getRegdate()),
				String.valueOf(d.getHit())
			};
			bList.model.addRow(data);
		}
		totalpage=dao.boardTotalPage();
		String page=curpage+" page / "
				  +totalpage+" pages";
		bList.pageLa.setText(page);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bList.b1)
		{
			bIU.tf1.setText("");
			bIU.tf2.setText("");
			bIU.ta.setText("");
			bIU.pf.setText("");
			card.show(getContentPane(), "IU");
			bIU.tf1.requestFocus();
			bIU.b1.setText("�۾���");
			bIU.la1.setText("�۾���");
		}
		else if(e.getSource()==bIU.b2)
		{
			String title=bIU.b1.getText();
			if(title.equals("�۾���"))
				card.show(getContentPane(), "LIST");
			else
				card.show(getContentPane(), "CONT");
		}
		else if(e.getSource()==bIU.b1)
		{
			String type=bIU.b1.getText();
			String name=bIU.tf1.getText().trim();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this,
						"�̸��� �Է��ϼ���");
				bIU.tf1.requestFocus();
				return;
			}
			String subject=bIU.tf2.getText().trim();
			if(subject.length()<1)
			{
				JOptionPane.showMessageDialog(this,
						"������ �Է��ϼ���");
				bIU.tf2.requestFocus();
				return;
			}
			String content=bIU.ta.getText().trim();
			if(content.length()<1)
			{
				JOptionPane.showMessageDialog(this,
						"������ �Է��ϼ���");
				bIU.ta.requestFocus();
				return;
			}
			String pwd=String.valueOf(bIU.pf.getPassword());
			if(pwd.length()<1)
			{
				JOptionPane.showMessageDialog(this,
						"��й�ȣ�� �Է��ϼ���");
				bIU.pf.requestFocus();
				return;
			}
			BoardDTO d=new BoardDTO();
			d.setName(name);
			d.setSubject(subject);
			d.setContent(content);
			d.setPwd(pwd);
			
			if(type.equals("�۾���"))
			{
				dao.boardInsert(d);
				card.show(getContentPane(), "LIST");
				getData();
			}
			else
			{
				d.setNo(Integer.parseInt(bCont.tf1.getText()));
				boolean bCheck=dao.boardUpdate(d);
				if(bCheck==true)
				{
					JOptionPane.showMessageDialog(this, "������ �Ϸ�Ǿ����ϴ�");
					card.show(getContentPane(), "LIST");
					getData();
				}
				else
				{
					JOptionPane.showMessageDialog(this, "��й�ȣ�� Ʋ�Ƚ��ϴ�");
					bIU.pf.setText("");
					bIU.pf.requestFocus();
					
				}
			}
		}
		else if(e.getSource()==bList.b4)
		{
			if(curpage>1)
			{
				curpage--;
				getData();
			}
		}
		else if(e.getSource()==bList.b5)
		{
			if(curpage<totalpage)
			{
				curpage++;
				getData();
			}
		}
		else if(e.getSource()==bCont.b3)
		{
			card.show(getContentPane(), "LIST");
			getData();
		}
		else if(e.getSource()==bCont.b1)
		{
			card.show(getContentPane(), "IU");
			bIU.b1.setText("�����ϱ�");
			bIU.la1.setText("�����ϱ�");
			bIU.tf1.setText(bCont.tf3.getText());
			bIU.tf2.setText(bCont.tf5.getText());
			bIU.ta.setText(bCont.ta.getText());
			bIU.pf.setText("");
		}
		else if(e.getSource() == bCont.b2)
		{
			String pwd=JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ��� : ");
			int no=Integer.parseInt(bCont.tf1.getText());
			boolean bCheck=dao.boardDelete(no, pwd);
			if(bCheck==true)
			{
				JOptionPane.showMessageDialog(this, "������ �Ϸ�Ǿ����ϴ�");
				card.show(getContentPane(), "LIST");
				getData();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "��й�ȣ�� Ʋ�Ƚ��ϴ�");
			
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bList.table)
		{
			if(e.getClickCount()==2)
			{
				int row=bList.table.getSelectedRow();
				String no=bList.model.getValueAt(row, 0).toString();
				BoardDTO d=dao.boardContent(Integer.parseInt(no));
				card.show(getContentPane(), "CONT");
				bCont.tf1.setText(String.valueOf(d.getNo()));
				bCont.tf2.setText(new SimpleDateFormat("yyyy-MM-dd").format(d.getRegdate()));
				bCont.tf3.setText(d.getName());
				bCont.tf4.setText(String.valueOf(d.getHit()));
				bCont.tf5.setText(d.getSubject());
				bCont.ta.setText(d.getContent());
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
