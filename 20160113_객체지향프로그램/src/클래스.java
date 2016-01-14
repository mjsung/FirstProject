/*
 * 	Ŭ���� ���� ����
	  	���� -> �迭 -> ����ü -> Ŭ����
	    : �����͸� ��Ƽ� ����
	  	���� : ���� �����͸� �����ؼ� ���
	  	�迭 : ���� ũ���� �����͸� �����ؼ� ���
	  	����ü : �ٸ� ũ���� �����͸� ��Ƽ� ��� (��� ������=>����)
	   Ŭ���� : ����ü + �޼ҵ� (�����)
 *  Ŭ������ �������
 *  	������(�Ӽ�)
 *  		=> �������
 *  		       ���뺯��(Ŭ��������) => static
 *  		       ��ü����(�ν��Ͻ� ����) => (x)
 *  		����
 *  		class A
 *  		{
 *				int a;
 *				static int b;  
 *  		}
 *  		b������ Ŭ������ ����ӽ� �о�� ��쿡 ����
 *  		a������ ���� ���� ���� �Ŀ� ����� ����(new)
 *  		A aa=new A();
 *  		stack
 *  		==== aa
 *  		100				heap
 *  		====			==== 100����
 *  						  a
 *  						====
 *  		�޼ҵ�(���) : ����� ������ ���ؼ� ���� ����
 *  
 *  		Ŭ���� ����
 *  		1) �߻�ȭ �۾� : ����(�𵨸�)
 *  		=> ���Ǽ����� ��� �繰�� �ܼ�ȭ
 *  		���
 *  		=======
 *  		  �̸�
 *  		  ����
 *  		  �ֹι�ȣ
 *  		  ��
 *  		  ��
 *  		  ��
 *  		  ��
 *  		=======
 *  		 ��=>���ϱ� ���
 *  		 ��=>��´�
 *  		 ��=>����  (���۱���� ������ ���� �޼ҵ�)
 *  		=======
 *  		2) ��üȭ �۾� : �𵨸� ������ �ùķ��̼�
 *  
 *  		1) ���� ==> �迭, Ŭ����
 *  		2) ��ɹ� ==> �޼ҵ�
 *  		3) Ŭ���� ==> ��Ű��
 *  ================================
 *  		Ŭ�������� (java)
 *  		1) package
 *  		2) import ==>������ �� �� ����
 *  		3) class className
 *  			{
 *  				��������
 *  			===================
 *  				�޼ҵ� ����
 *  			===================
 *  				������ ���� => ���� (new ������ �����°� ������)
 *  			===================
 *  			}
 *  
 *  		���ھ߱�����
 *  		�����߻� => com[]
 *  		�Է�	 =>	user[]
 *  		��	 => com[], user[] �� => s,b
 *  		��Ʈ	 => s,b
 *  		����  	 => s
 *  
 *  
 *  	void test()
 *  	{
 *  		int a=10;
 *  		System.out.println(a);
 *  		a++;
 *  	}
 *  
 *  	test();  => a=10
 *  	test();  => a=10
 *  	test();  => a=10 //a�� ���������� ����� ������ �����. 11�� �����ϰ� �����
 */

import javax.swing.*;
/*
 * *�ڱ� �ڽ� Ŭ������ ��������� ������ this. �� ��� Ȱ��ȴ� (s=0; �� ��� this.s=0;) 
 * ���� : 1. extends object 
 *  	- ��� Ŭ������ ����� �޾Ҵ�. object Ŭ������ ��ӹ��� (Ŭ������ ����� ������ ���)
 *  		object�� �ڹ��� �ֻ��� Ŭ����
 *  	2. import java.lang.*;
 *  	   ====================
 *  		String, Math, System�� �ڵ��ν� (��״� final-> final�� ����� �ȵ�, �����Ҽ����� Ŭ����)
 *  	3. ����ó�� => �˻��� ���ϱ� ������
 *  			=> ����� ����, �����Ͻ� ����
 *  
 * */
public class Ŭ���� {
	//�������
	int[] com=new int[3];
	int[] user=new int[3];
	int s, b; // ������� ==> �ڵ����� 0 �ʱ�ȭ
	void getRand()
	{
		int su=0;
		boolean bDash=false;
		for(int i=0;i<3;i++)
		{
			bDash=true;
			while(bDash)
			{
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{							
					if(com[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			com[i]=su;
			
		}
	}
	void userInput()
	{
		while(true)
		{
			String input=
					JOptionPane.showInputDialog("���ڸ� ���� �Է�:");
			if(input.length()!=3)
			{
				JOptionPane.showInputDialog(null, "�߸��� �Է��Դϴ�");
				continue;
			}
			user[0]=input.charAt(0)-'0'; // '1' -> ���� 1�� �ƴ϶� ���� '1'�̱⶧���� 49�� ����. �׷��� '0'�� 48�̾ ����
			user[1]=input.charAt(1)-'0';
			user[2]=input.charAt(2)-'0';
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2])
			{
				JOptionPane.showInputDialog(null, "�ߺ��� ���� ����� �� ����");
				continue;
			}
			break;
		}
		
		
		
	}
	void compare()
	{
		s=0;
		b=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
	}
	void hint()
	{
		System.out.printf("Input Number : %d-%d-%d, Result : %dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	boolean isEnd()
	{
		if(s==3)
			return true; //��� �޼ҵ�� return�� ������ ����
		return false;
	}
	void process()
	{
		getRand();
		while(true)
		{
			userInput();
			compare();
			hint();
			if(isEnd())
			{
				int a=JOptionPane.showConfirmDialog(null, "�����ұ��?","����",JOptionPane.YES_NO_OPTION);
				if(a==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null, "������ �����մϴ�");
					System.exit(0);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "�� ������ ���۵Ǿ����ϴ�");
					process();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ŭ���� a=new Ŭ����(); //static�� ���� ���� �� �����
		a.process();
	}

}

























