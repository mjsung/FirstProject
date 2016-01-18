package com.sist.lotto;
import javax.swing.*;
public class �ζ����α׷�V2 {
	int[] lotto=new int[7];
    int[] user=new int[6];
    // ���� �߻� 
    void getRand()
    {
    	int su=0;
        boolean bDash=false;
        for(int i=0;i<7;i++)
		{
			bDash=true;
			while(bDash)
			{
				su=(int)(Math.random()*45)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			lotto[i]=su;
			
		}
    }
    void sort(int[] arr)
    {
    	int len=arr.length;
    	int size=0;
    	if(len==7)
    		size=len-1;
    	else
    		size=len;
    	for(int i=0;i<size-1;i++)
        {
        	for(int j=i+1;j<size;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
    }
    void print(int[] arr)
    {
    	for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
    }
    // ����� �Է� 
    void userInput()
    {
    	for(int i=0;i<user.length;i++)
        {
        	String strNum=JOptionPane.
        			showInputDialog("1~45���� ���� �Է�:");
        	int num=Integer.parseInt(strNum);
        	// ���������� (���ڿ�) 
        	// �� �������� => ����� ó�� �Ҽ� �ְ� ���� Ŭ���� : Wrapper
        	// int => Integer, byte=>Byte, Double...
        	// => ������,��(������ ����� �� ����) ==> ���������� ���� 
        	if(num<1 || num>45)
        	{
        		JOptionPane.showMessageDialog(null,
        				"�߸��� �Է��Դϴ�!!");
        		i--;
        		continue;// ������
        	}
        	int a=0;
        	for(int j=0;j<i;j++)
        	{
        		if(num==user[j])
        		{
        			a=1;
        			break;
        		}
        	}
        	if(a==0)
        	{
        		user[i]=num;
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null,
        				"�ߺ��� ���� ��� �� �� �����ϴ�");
        		i--;
        		continue;
        	}
        }
    }
    // ��
    int compare()
    {
    	int count=0;
        for(int i=0;i<lotto.length-1;i++)
        {
        	for(int j=0;j<user.length;j++)
        	{
        		if(lotto[i]==user[j])
        		{
        			count++;
        		}
        	}
        }
        return count;
    }
    void rankResult(int count)
    {
    	int b=0;
        String result="";
        if(count==5)
        {
	        for(int i=0;i<user.length;i++)
	        {
	        	if(user[i]==lotto[6])
	        	{
	        		b=1;
	        		result="�����մϴ�\n2�� ��÷�Դϴ�!!";
	        	}
	        }
        }
        
        switch(count)
        {
        case 3:
        	result="�����մϴ�\n5�� ��÷�Դϴ�!!";
        	break;
        case 4:
        	result="�����մϴ�\n4�� ��÷�Դϴ�!!";
        	break;
        case 5:
        	if(b!=1)
        	result="�����մϴ�\n3�� ��÷�Դϴ�!!";
        	break;
        case 6:
        	result="�����մϴ�\n1�� ��÷�Դϴ�!!";
        	break;
        default:
        	result="��÷�Դϴ�!!";
        }
        JOptionPane.showMessageDialog(null,
        		result);
    }
    // ���(����) 
    void process()
    {
    	getRand();
    	sort(lotto);
    	print(lotto);
    	System.out.println();
    	userInput();
    	sort(user);
    	print(user);
    	int count=compare();
    	rankResult(count);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        �ζ����α׷�V2 v=new �ζ����α׷�V2();
        v.process();
	}

}
