package com.sist;
/*
 * 	1) ����(Ȯ��)
 * 	2) �ݺ��ڵ��� ����
 *  3) ��� : ������ ����� �״�� ���
 *  		�����ؼ� ����� ���� ---> �������̵�
 *  4) �ڹ��� ����� ���� ���
		A	B
		C extends A,B(X)
		
		B extends A
C extends B => ���ϻ������ ���� �� �ִ�.(���߻���� ���߿� �������̽��� ����!)
 */
class ����
{
	static int age=10; //��ӹ��� ��� Ŭ������ �� ����� �� �ִ�!
	public void eat(){System.out.println("�Դ´�");}
	void run(){System.out.println("�ȴ´�");}
	public ����()
	{
		System.out.println("����() Call...");
	}
}
class ��� extends ����
{
	/*���
	int age=10;
	void eat(){System.out.println("�Դ´�");}
	void run(){System.out.println("�ȴ´�");}*/
	public void eat()
	{
		System.out.println("������ �Դ´�");
	}
	/*
	 * 	�������̵�
	 * 	  => ����� ����(�͸��� Ŭ����)
	 * 	  => �޼ҵ���� ����
	 *    => �Ű������� ����
	 *    => �������� ����
	 *    => Ȯ��, ��Ҵ� �Ұ���
	 *    => ��������� ��ҵǸ� �ȵ�(Ȯ��� ����. default -> public)
	 *   	 public > protected > default > private
	 *    => final�� �����ϴ� Ŭ������ ����� ���޴´�.
	 */
}
class �� extends ����
{
	/*���
	int age=10;
	void eat(){System.out.println("�Դ´�");}
	void run(){System.out.println("�ȴ´�");}*/
	public void eat()
	{
		System.out.println("������ �Դ´�");
	}
}
class �� extends ���
{
	/*���
	int age=10;
	void eat(){System.out.println("�Դ´�");}
	void run(){System.out.println("�ȴ´�");}*/
	public ��()
	{
		System.out.println("��() Call...");
	}
	/*public void eat()
	{
		System.out.println("�ǻ����� �Ѵ�");
	}*/
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�� a=new ��();
		System.out.println("age : "+a.age);
		a.eat();
		a.run();
		��� b=new ���();
		b.eat();
		b.age=10;
	}

}
