package com.sist;

public class �ʱ�ȭ���2 {
	static int a=10;
	static
	{
		for(int i=0;i<10;i++)
		{
			a=i;  //static ��� �ʱ�ȭ!
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

}
