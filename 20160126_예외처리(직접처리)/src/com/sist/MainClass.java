package com.sist;
/*
 * 	����ó��(�����ϴ� ���α׷�)
 * 	= ������ ����(�����Ͻÿ� ����ó�� Ȯ�� : �ݵ�� ����ó��)
 * 		IO, Thread, Network, Database, Web
 * 	= ����� ����(����ó�� ������ �� �ִ�)
 * 
 *  ����: ���ܰ� �߻����� �� ������ ���Ḧ �����ϰ� ���� ������¸� �����ϴ� ����.
 *  Error(����) => �ҽ��� �Է»󿡼� ������ �Ұ����� ����
 *  Exception(����) => ������ ������ ����(������ ����)
 *  	�Է� => ������(����� 0�� �Է�)
 *  	��Ʈ��ũ => �����ּҰ� Ʋ�� ���
 *  	���� => ��θ��� Ʋ����
 *  	�迭 => ���� �ʰ�
 *  		int[] arr=new int[2];
 * 			arr[2]=10; -> �迭 ���� �ʰ� error
 * ===================================================
 * 				��ӵ�
 * 
 * 			  Object
 * 				 |
 * 			 Throwable
 * 				 |
 * 		====================
 * 	    |					|
 * 	  error				  Exception
 * 							|
 * 					===================
 * 					|				   |
 * 				������ ����				 ����ÿ���
 * 			IOException				RuntimeException(����Ŭ�������� �Ʒ� ���� �� ���� �� ����)
 * 			interruptedException    	|
   			SQLException             NumberFormatException
 *                                   Integer.parseInt("1");
 *        MalformedURLException      ArrayIndexOutOfBoundsException
 *                                   ArithmeticException (0���� ������)
 *                                   NullPointerException 					 			
 * 									 ClassCastException
 * 			ClassNotFoundException
 * 			Class.forName("")
 * 
 * 			=> try
 * 				{
 * 					}catch(ClassCastException){}
 * 					 catch(NumberFormatException){}
 * 					 catch(ArrayIndexOutOfBoundsException){}
 * 					 catch(NullPointerException){}
 */
public class MainClass {

	public static void main(String[] args){
		
	}
}
