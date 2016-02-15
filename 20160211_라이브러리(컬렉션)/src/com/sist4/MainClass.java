package com.sist4;

import java.lang.reflect.Method;

class A
{
	
	public void display1()
	{
		System.out.println("A:display1 call..");
	}
	/*public void display2()
	{
		System.out.println("A:display2 call..");
	}*/
}
public class MainClass {

	public static void main(String[] args)
	{
		try
		{
			Class clsName=Class.forName("com.sist4.A");
			Object obj=clsName.newInstance();
			//A a=new A();
			Method[] m=clsName.getDeclaredMethods();
			m[0].invoke(obj, null);
			
		}catch(Exception ex){}
	}
}
