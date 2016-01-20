package com.sist;
import java.awt.*;//Layout
import javax.swing.*; //window
import java.awt.event.*;
public class MyWindow4 extends JFrame implements ActionListener{
	
	JButton[][] bu=new JButton[3][3];
	int[][] panCount=new int[3][3];
	int brow,bcol;
	JButton b1,b2;
	public MyWindow4()
	{
		JPanel p=new JPanel(); // ��� �÷��ִ� ���
		p.setLayout(new GridLayout(3, 3, 5,5));
		int k=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				bu[i][j]=new JButton(String.valueOf(k)); 
				// ������� ���ڸ� ������ ����! ��ȣ�ȿ� k�� ���� �� ����. string���� �־����
				bu[i][j].setFont(new Font("���� ���", Font.BOLD,20));
				k++;
				p.add(bu[i][j]);
				bu[i][j].addActionListener(this);
			}
		}
		b1=new JButton("����");
		b2=new JButton("����");
		
		JPanel p1=new JPanel();
		p1.add(b1);
		p1.add(b2);
		add("Center", p);
		add("South", p1);
		setSize(350, 370);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// ������ ����!�� ���ֱ�
		getRand();
		display();
		b1.addActionListener(this); //b1�� ��������, actionPerformed �޼ҵ带 ����, �ڱ��ڽ��� ������ ������ this�� ��
	}
	//��� �߰�(�������̵�)
	public void getRand()
	{
		int[] temp=new int[9];
		boolean bDash=false;
		int su=0;
		for(int i=0;i<9;i++)
		{
			bDash=true;
			while(bDash)
			{
				su=(int)(Math.random()*9);
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(su==temp[j])
					{
						bDash=true;
						break;
					}
				}
			}
			temp[i]=su;
			panCount[i/3][i%3]=su; //1�����迭�� 2�����迭�� �ٲ��ٶ� ����ϴ� ����!i�� col ������ŭ �����ִ°�!
			if(su==8)//�����
			{
				brow=i/3;
				bcol=i%3;
			}
		}
	}
	public void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==brow && j==bcol)
				{
					bu[i][j].setText("");
					bu[i][j].setEnabled(false);
				}
				else
				{
					bu[i][j].setText(String.valueOf(panCount[i][j]+1));//��ư�� �ؽ�Ʈ �÷��ִ°� setText
					bu[i][j].setEnabled(true);
				}
			}
		}
		
		
	}
	 public boolean isEnd()
	    {
	    	int k=0;
	    	for(int i=0;i<3;i++)
	    	{
	    		for(int j=0;j<3;j++)
	    		{
	    			if(panCount[i][j]!=k)
	    				return false;
	    			k++;
	    		}
	    	}
	    	return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWindow4 m= new MyWindow4();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			display();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(e.getSource()==bu[i][j])
				{
					if(!((brow==i && Math.abs(bcol-j)==1)||
							(bcol==j&&Math.abs(brow-i)==1))) //��ĭ���� �����̰� ��, Math.abs�� ���밪
						return;
					panCount[brow][bcol]=panCount[i][j]; //����鿡 �־��
					panCount[i][j]=8; //���� Ŭ���Ѱ� ������ ��ȣ��
					brow=i;
					bcol=j;
					display();
					if(isEnd())
					{
						JOptionPane.showMessageDialog(this, "Game Over");
						System.exit(0);
					}
				}
			}
		}
	}

}
