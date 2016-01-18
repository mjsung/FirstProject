package com.sist.swap;

public class MainClass2 {
	String str="Hello!!";
	void dataInput(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
	}
	void swap(MainClass2 m)
	{
		m.str="Hello Java";
	}
	void process()
	{
		int[] arr={1,2,3,4,5};
		dataInput(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		String str="Hello!!";
		MainClass2 m=new MainClass2();
		swap(m);
		System.out.println(m.str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
		m.process();
	}

}
