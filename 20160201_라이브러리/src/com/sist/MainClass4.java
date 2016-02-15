package com.sist;
//equals

class MyNumber
{
	int num;
	public MyNumber(int num)
	{
		this.num=num;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.num==((MyNumber)obj).num)
			return true;
		else
		return false;
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber m1=new MyNumber(10);
		MyNumber m2=new MyNumber(10);
		//m1==m2(주소값이 다르다)
		if(m1.equals(m2))
		{
			System.out.println("m1과 m2의 값은 동일하다");
		}
		else
		{
			System.out.println("m1과 m2의 값은 다르다");
		}
		String str1=new String("Hello");
		String str2=new String("Hello");
		//str1==str2(false)
		if(str1.equals(str2))
		{
			System.out.println("str1과 str2은 저장된 문자가 동일하다");
		}
		else
		{
			System.out.println("str1과 str2은 저장된 문자가 다르다");
		}
		
			
	}

}
