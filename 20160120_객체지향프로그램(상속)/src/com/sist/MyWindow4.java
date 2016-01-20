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
		JPanel p=new JPanel(); // 묶어서 올려주는 기능
		p.setLayout(new GridLayout(3, 3, 5,5));
		int k=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				bu[i][j]=new JButton(String.valueOf(k)); 
				// 윈도우는 숫자를 넣으면 에러! 괄호안에 k를 넣을 수 없다. string으로 넣어야함
				bu[i][j].setFont(new Font("맑은 고딕", Font.BOLD,20));
				k++;
				p.add(bu[i][j]);
				bu[i][j].addActionListener(this);
			}
		}
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		JPanel p1=new JPanel();
		p1.add(b1);
		p1.add(b2);
		add("Center", p);
		add("South", p1);
		setSize(350, 370);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// 완전히 종료!꼭 써주기
		getRand();
		display();
		b1.addActionListener(this); //b1을 눌렀을때, actionPerformed 메소드를 실행, 자기자신이 가졌기 때문에 this를 씀
	}
	//기능 추가(오버라이딩)
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
			panCount[i/3][i%3]=su; //1차원배열을 2차원배열로 바꿔줄때 사용하는 공식!i를 col 갯수만큼 나눠주는것!
			if(su==8)//빈공백
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
					bu[i][j].setText(String.valueOf(panCount[i][j]+1));//버튼에 텍스트 올려주는게 setText
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
							(bcol==j&&Math.abs(brow-i)==1))) //한칸씩만 움직이게 함, Math.abs는 절대값
						return;
					panCount[brow][bcol]=panCount[i][j]; //빈공백에 넣어라
					panCount[i][j]=8; //내가 클릭한게 마지막 번호로
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
