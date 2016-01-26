import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//�Ѱ��̻��� ��ɿ��� ��� ==> ���
//��Ȱ�� ==>���
//������ ==>������(�������̵�)=> �߻�Ŭ����, �������̽�(�߻�޼ҵ�)
//�߻�޼ҵ� : ���� �� �޼ҵ� actionPerformed();
public class MainClass extends JFrame implements ActionListener{
    JLabel la1,la2,la3,la4,la5,la6,la7;
    JTextField tf1,tf2,tf3,tf4,tf5;
    JComboBox box;
    JRadioButton rb1,rb2;
    JButton b1,b2,b3;
    Student std=new Student();
    // ȭ�� ������
    public MainClass()
    {
    	la1=new JLabel("�й�");
    	la2=new JLabel("�̸�");
    	la3=new JLabel("����");
    	la4=new JLabel("����");
    	la5=new JLabel("����");
    	la6=new JLabel("����");
    	la7=new JLabel("����");
    	
    	tf1=new JTextField();
    	tf2=new JTextField();
    	tf3=new JTextField();
    	tf4=new JTextField();
    	tf5=new JTextField();
    	
    	box=new JComboBox();
    	// ������ ÷�� 
    	box.addItem("�İ�");
    	box.addItem("������");
    	box.addItem("������");
    	
    	rb1=new JRadioButton("����");
    	rb2=new JRadioButton("����");
    	
    	// RadionButton => �ݵ�� �׷����� ��� ��� 
    	// ButtonGroup
    	ButtonGroup bg=new ButtonGroup();
    	bg.add(rb1);
    	bg.add(rb2);
    	
    	b1=new JButton("�Է�");
    	b2=new JButton("���");
    	b3=new JButton("���");
    	
    	// �Ӽ� ó�� 
    	rb1.setSelected(true);//���� ���� ��ư�� �����Ѵ� 
    	// isSelected()
    	
    	// ��ġ
    	setLayout(null);//�����ϴ� Layout�� ������� �ʴ´� 
    	/*
    	 *   JFrame,JWindow,JDialog : default(BorderLayout)
    	 *   JPanel : FlowLayout 
    	 */
    	la1.setBounds(10,15,30,30);
    	tf1.setBounds(45, 15, 150, 30);
    	
    	la2.setBounds(10,50,30,30);
    	tf2.setBounds(45, 50, 150, 30);
    	
    	la3.setBounds(10,85,30,30);
    	rb1.setBounds(45, 85, 70, 30);
    	rb2.setBounds(120,85,70,30);
    	
    	la4.setBounds(10,120,30,30);
    	box.setBounds(45, 120, 150, 30);
    	
    	la5.setBounds(10,155,30,30);
    	tf3.setBounds(45, 155, 150, 30);
    	
    	la6.setBounds(10,190,30,30);
    	tf4.setBounds(45, 190, 150, 30);
    	
    	la7.setBounds(10,225,30,30);
    	tf5.setBounds(45, 225, 150, 30);
    	
    	JPanel p=new JPanel();
    	p.add(b1);
    	p.add(b2);
    	p.add(b3);
    	p.setBounds(10, 260, 250, 35);
    	b2.setEnabled(false);
    	
    	
    	//�����쿡 �߰�
    	add(la1); add(tf1);
    	add(la2); add(tf2);
    	add(la3); add(rb1); add(rb2);
    	add(la4); add(box);
    	add(la5); add(tf3);
    	add(la6); add(tf4);
    	add(la7); add(tf5);
    	add(p);
    	
    	//������ ũ��
    	setSize(285,335);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	//��ư�� Ŭ���ϸ� MainClass�� ������ �ִ� actionPerformed�� ȣ���϶�
    	//�ý��ۿ� ���ؼ� �ڵ�ȣ���ϰ� ����� ==> CallBack
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			//�й��� �о�´� :
			//Integer.parseInt("1") ���ڿ��� ������ �ٲ� �� ��� => static
			String hak=tf1.getText().trim();
			//TextField�� �Էµ� ���� �д´�, trim���� ��������
			std.setHakbun(Integer.parseInt(hak));
			/*
			 * 	���������� ������ �� �ְ� Ŭ����ȭ(Wrapper)
			 *	*****int : Integer
			 *	*****double : Double
			 *  boolean: Boolean
			 *	byte : Byte
			 */
			
			//�̸�
			String name=tf2.getText().trim();
			std.setName(name);
			//����
			if(rb1.isSelected())
				std.setSex("����");
			else
				std.setSex("����");
			
			//���� :
			String sub=(String)box.getSelectedItem(); //����ȯ
			std.setSubject(sub);
			
			//���� :
			String kor=tf3.getText().trim();
			std.setKor(Integer.parseInt(kor));
			//���� :
			String eng=tf4.getText().trim();
			std.setEng(Integer.parseInt(eng));
			//���� :
			String math=tf5.getText().trim();
			std.setMath(Integer.parseInt(math));
			
			//�Ϸ�
			JOptionPane.showMessageDialog(this, "����Ϸ�");
			b1.setEnabled(false);
			b2.setEnabled(true);
		}
		else if(e.getSource()==b2)
		{
			
			//���
			String result="�й�:"+std.getHakbun()+"\n"
					+"�̸�:"+std.getName()+"\n"
					+"����:"+std.getSex()+"\n"
					+"����:"+std.getSubject()+"\n"
					+"����:"+std.getKor()+"\n"
					+"����:"+std.getEng()+"\n"
					+"����:"+std.getMath();
			
			JOptionPane.showMessageDialog(this, result);
		}
		else if(e.getSource()==b3)
		{
			dispose();//�޸�����
			System.exit(0);
			//���� ����(0), ������ ����(1)
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
