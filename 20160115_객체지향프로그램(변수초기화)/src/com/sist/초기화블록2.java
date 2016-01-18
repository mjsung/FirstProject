package com.sist;

public class 초기화블록2 {
	static int a=10;
	static
	{
		for(int i=0;i<10;i++)
		{
			a=i;  //static 블록 초기화!
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

}
