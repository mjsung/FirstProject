package com.sist;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/*
 * ����ó��
 * = ���ܿ� ���� ���(����)
 * = �ý��ۿ� ���� ó��
 * = ����
 * 	�޼ҵ�()throws ������ ����....
 * 
 * 	double div(int[] a) throws ArithmeticException, ArrayIndexOutOfBoundsException
 * 		=> ����Ŭ���� ������ ����. 
 * 		�̷��� ������ ����ȴٰ� ���� �� (����ÿ���(RuntimeException)�� ��������, ���� ������ ó���� �����ʾƵ� ������ �ȳ�!)
 * 		
 * 		int[] arr={1,2};
 * 		double res=div(arr);
 */
public class MainClass {
	double div(int[] arr) throws Exception, RuntimeException, SQLException
	{
		return arr[0]/arr[1];
	}
	public static void main(String[] args) 
	//throws Exception 
	{
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		int[] arr={10,0};
		try
		{
		double d=m.div(arr);
		}catch(Exception ex){} //���� ������ 3���� ���ܺ��� ū�ɷ�!
	}

}
