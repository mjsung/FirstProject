package com.sist.main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sist.dao.*; //��Ű���� �޶� �ҷ��;���
public class SawonMain extends JFrame
implements ActionListener
{
    SawonLogin login=new SawonLogin();
    SawonList sList=new SawonList();
    JTabbedPane tp;
    public SawonMain()
    {
    	tp=new JTabbedPane();
    	tp.addTab("�α���", new ImageIcon(""),
    			login,"�α���ó�������Դϴ�");
    	tp.addTab("������", new ImageIcon(""),
    			sList,"��������� �����Դϴ�");
    	tp.setEnabledAt(1, false);
    	add("Center",tp);
    	setSize(640, 480);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	login.b1.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new SawonMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			String empno=login.tf.getText().trim();
			String ename=new String(login.pf.getPassword());
			EmpDAO d=new EmpDAO();
			String res=d.login(Integer.parseInt(empno), ename);
			if(res.equals("noid"))
			{
				JOptionPane.showMessageDialog(this, "����� �������� �ʽ��ϴ�");
				login.tf.setText("");
				login.tf.requestFocus();
				login.pf.setText("");
				
			}
			else if(res.equals("noname"))
			{
				JOptionPane.showMessageDialog(this, "�̸��� Ʋ���ϴ�");
				login.pf.setText("");
				login.pf.requestFocus();
			}
			else
			{
				JOptionPane.showMessageDialog(this, ename+"�� �α��� �Ǿ����ϴ�");
				tp.setEnabledAt(0,false);
				tp.setEnabledAt(1, true);
				tp.setSelectedIndex(1);
				
			}
			
			
		}
	}

}
