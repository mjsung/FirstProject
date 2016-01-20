package com.sist;
/*
 * ������ ������� Ŭ������ ���
 * =================
 * 		  B
 * =================
 * 1. ��� ==> is-a : ���ϻ��
 * class A extends B    
 * 2. ���� ==> has-a
 * class A
 * {
 *     B b;  => �͸��� Ŭ����(������)
 * }
 * 
 * ===============================
 * ��������� class
 * ���̺귯�� ���   => ������
 * 
 * ������ ����
 * 1) ���̺귯���� �о�´�
 * 	  import javax.swing : ������� ���õ� ��� Ŭ����
 * 	  import java.awt : Layout
 * 	  import java.awt.event : �̺�Ʈ ó��
 * 2) ȭ�� ���� 
 * 	  = �ʿ��� ������Ʈ�� ����
 *  	JButton b1, b2;
 *    = �����ڿ��� ������Ʈ�� �޸� �Ҵ�
 *    	b1=new JButton();
 *      �Ӽ�ó��
 *      b1.setEnabled(false)
 *      ��ġ
 *      ������ ũ�� setSize(w,h)
 *      ������ ������ setVisiable(true)
 * 3) ȣ��
 * 	   new ������()
 * 4) �̺�Ʈ�� ���� ó�� ==> interface
 * ===============================
 * 
 * ������ â(Container)
 * 	 = JFrame : �Ϲ� ������(Ÿ��Ʋ�ٸ� ������ ����)
 * 	 = JWindow : Ÿ��Ʋ�ٰ� ���� ������(���ӼҰ�, �α���)
 * 	 = JDialog : ������ ���� �����츦 �� ���� ����,���� ���� â
 * 				 Modal(���� �� â�� ���������� �� ���� ������â Ŭ�� �� ��� �Ұ���)
 * 				 Modaless(������ ���� �� â�� �� �ؿ� �� �����찡 �� ��밡��)
 * 	 = JPanel : �ܵ����� ������ �Ұ��� (Component ��� ����� ����)
 * 
 * ���(Component)
 * 	 = Button (JButton, JRadioButton, JCheckbox, JMenu)
 * 	 = TextField (JTextField, JPasswordField)
 *   = TextArea (JTextArea, JTextPane)
 *   = List (JList, JTabel, JTree)
 *   = etc : JProgressBar, JSilderBar, JScrollPane
 *     => ������ �и� :  JTabbedPane, JSplitPane, JInternalFrame
 * ��ġ
 *   = BorderLayout (5���� ��ġ)
 *   = FlowLayout (1�� �迭)
 *   = GridLayout 
 *   = CardLayout (����״� ���)
 *   
 * �̺�Ʈ
 *   = ActionListener : Button, Menu, TextField
 *   = MouseListener : ��� ������Ʈ�� ����
 *   = KeyListener : Ű����� ����
 *   = ItemListener : �޺�, ��ϼ���
 */
import java.awt.*;
import javax.swing.*;

public class MyWindow extends JFrame{
	JButton b1,b2,b3,b4,b5; //����Ŭ����
	public MyWindow()
	{
		b1=new JButton("North", new ImageIcon("c:\\image\\enter.gif"));
		//������ => �����ε�
		b2=new JButton("East");
		b2.setToolTipText("�α���"); //ǳ������
		b3=new JButton("West");
		b3.setEnabled(false); //��Ȱ��ȭ
		b4=new JButton("Center");
		//b4.setForeground(Color.MAGENTA);
		b4.setForeground(new Color(223,159,220)); //R.G.B ���� //�տ� set�� �ٴ°� �Ӽ�ó��
		b5=new JButton("South");
		b1.setRolloverIcon(new ImageIcon("c:\\image\\enter2.gif"));
		//��ġ - �������� ����Ʈ���� BorderLayout
		/*add("North",b1);
		add("East",b2);
		add("West",b3);
		add("Center",b4);
		add("South",b5);*/
		
		//setLayout(new FlowLayout());
		/*JPanel p=new JPanel();
		p.add(b1);
		p.add(b5);
		p.add(b2);
		p.add(b4);
		p.add(b3);
		add("Center",p);*/
		
		setLayout(new GridLayout(5,1,5,30)); //��, ��, �¿찣��
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);		
		
		
		setSize(640,480);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWindow m=new MyWindow();
	}

}
