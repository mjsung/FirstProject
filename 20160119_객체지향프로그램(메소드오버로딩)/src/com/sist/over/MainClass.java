package com.sist.over;
/*
 * �޼ҵ� �����ε�(�ߺ��޼ҵ�����)
 * 	=> ���� Ŭ����������
 * 	=> ���� �̸� �޼ҵ�
 * 		=> �Ű������� ������ Ʋ����, ���������� �ٸ���.
 * 		=> �������� �������
 * 			print, println
 * 	=> plus(����,����)
 * 	   plus(�Ǽ�,�Ǽ�)
 *     plus(�Ǽ�,����)
 *     plus(����,�Ǽ�)
 *     plus(����,����)
 */
public class MainClass {
	public void plus(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void plus(char a,int b,float c)
	{
		System.out.println(a+b+c);
	}
	public void plus(char a,float b,int c)
	{
		System.out.println(a+b+c);
	}
	public void plus(double a,double b,double c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc=new MainClass();
		mc.plus('A', 10, 20F);
	}

}
