package com.sist;
/*
 *    ��Ű�� => java.lang , java.util
 *    1) java.lang => import�� ������ �� �ִ� 
 *       Object : �ֻ��� Ŭ����
 *         = finalize() : ��ü �Ҹ�ÿ� ȣ�� (�Ҹ���)
 *         = toString() : Object�� ���ڿ��� ��ȯ 
 *         = equals() : ��ü�� ������ �ִ� ����������� ���Ͽ���
 *         = clone() : �޸� ���� 
 *           => Cloneable�� �����ؾ� �Ѵ� 
 *       String : ���ڿ� ���� Ŭ����
 *         => char[]
 *         = ���ڿ� �� : equals
 *         = ���ڿ� ���� : substring
 *                    split
 *         = �����Ѱ� ������ �´� : charAt
 *           String str="Hello"
 *            str.charAt(2)
 *           String str1="Java"
 *         = ��� ���������� ���ڿ� ���� : valueOf
 *               ===> static 
 *         = �տ� ���� ���ڿ��� �ִ��� Ȯ�� : startsWith
 *         = �ڿ� ���� ���ڿ��� �ִ��� Ȯ�� : endsWith
 *         ====================== ������Ʈ 
 *         = ���ϴ� ������ ��ġȮ�� : indexOf,lastIndexOf
 *         = toUpperCase,toLowerCase
 *       Math : ���� (���� Ŭ����)
 *         = random() ==> Random
 *         = abs() : ���밪
 *         = ceil() : �ø�  (*******)
 *         => count=38;// �Խù� 
 *           total=count/10; ==> 3
 *           if(count%10>0)
 *              total++;   ==> 4
 *              
 *           total=(int)(Math.ceil(count/10.0))
 *                           3.8 
 *       System 
 *         = gc()
 *         = exit() : �ý��� ���� 
 *       Wrapper 
 *         ***** = Integer (int)
 *            parseInt() : ���ڿ� => ������
 *            valueOf() : ������ ���� 
 *            
 *            Integer i=new Integer(10);
 *            int ii=i; unboxing
 *            Integer i=100; boxing
 *            
 *         ***** = Double (double)
 *         = Float  (float)
 *         = Boolean (boolean)
 *         = Byte (byte)
 *       StringBuffer
 *          = append()
 *       
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
