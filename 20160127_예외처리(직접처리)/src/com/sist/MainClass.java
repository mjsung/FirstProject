package com.sist;
/*
 * ����ó�� : ������¸� ����
 *  = ����ó�� : try~catch
 *  = ����ó�� : throws
 *  = ���� �߻� : throw
 *  = ����� ���� : class MyException extends Exception
 *  = �⺻ ���� : ������ �����ϴ� ���� ���α׷�
 *  *****���� ==> �ڹٴ� ��� Ŭ������ ����ó���� ������ �ִ�
 *  	 ����� ������ ����ó���� ������ �� �ִ�.
 *  	System.in : �ݵ�� ����ó��
 *  	System.out : ����ó���� ����
 *  
 *  1) check exception : �����Ͻ� ����
 *  2) noncheck exception : ����� ����
 *  
 *  �ڹ�
 *  		    ������(javac)				   java
 *  	���üҽ�  ==========> ����Ʈ �ڵ�(.class)  ======> ���
 *  
 *  *****ó�����
 *  try
 *  {
 *  	���� ������ �ҽ�
 *  	1 == �������
 *   	2 == ���ܹ߻� ===> 2
 *   	3 == ������� 
 *  }catch(����ó�� ����1)
 *  {
 *  	���ܿ� ���� ��ġ
 *  }catch(����ó�� ����2)
 *  {
 *  	���ܿ� ���� ��ġ  ====> 
 *  }catch(����ó�� ����3)
 *  {
 *  	���ܿ� ���� ��ġ
 *  }catch(����ó�� ����4)
 *  {
 *  	���ܿ� ���� ��ġ
 *  }catch(����ó�� ����5)
 *  {
 *  	���ܿ� ���� ��ġ
 *  }
 *  finally
 *  {
 *  	��������̳� ���� => ������ �����ϴ� ����(������ ����)
 *  	try catch
 *  	�ؿ� �ִ� ���� ����
 *  }
 *  4
 *  5    
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1��");
		System.out.println("2��");
		try
		{
			System.out.println("3��");
			System.out.println(10/0);
			System.out.println("4��");
			
		}
		//�迭���� �ʰ�
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("5��");
		}
		//������ȯ�� �߸��Ǿ��� ��. Integer.parseInt("1")
		catch(NumberFormatException e){
			System.out.println("6��");
		}
		//0���� �������
		catch(ArithmeticException e){
			System.out.println("7��");
		}
		//����� ��� ����
		catch(RuntimeException e){
			System.out.println("8��");
		}
		finally
		{
			System.out.println("9��");
		}
		System.out.println("10��");
		//1->2->3->7->9->10 ����
	}

}
