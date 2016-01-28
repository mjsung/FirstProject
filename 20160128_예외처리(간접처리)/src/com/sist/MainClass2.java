package com.sist;
/*
 * 	���� �߻�
 * 	throw new ����Ŭ���� ȣ��(X)
 * 
 * 	=> �ڽ��� ��ü�� ��Ÿ�� �� : this
 * 	=> ���� Ŭ������ ��Ÿ�� �� : super
 * ==========================
 * 	������
 * 	�ڽ��� ������ : this()
 *  ���� Ŭ���� ������ : super()
 * 
 */
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
class Saram
{
	String id;
	String pwd;
	String name;
	public Saram()
	{
		id="aaa";
		pwd="1111";
		name="�ڹ���";
				
	}
	public void print()
	{
		System.out.println("Id: "+id);
		System.out.println("password: "+pwd);
		System.out.println("name: "+name);
	}
}
class Member extends Saram
{
	String id;
	String pwd;
	String name;
	public Member()
	{
		super();
		id="admin";
		pwd="1234";
		name="ȫ�浿";
		super.print();
	}
	public Member(String id, String pwd)
	{
		this.id=id;
		this.pwd=pwd;
	}
	public Member(String id)
	{
		
		this(); //������ȣ��. this()��� �޼ҵ�� �ݵ�� ù�ٿ� ����Ѵ�.
		//������ �ȿ����� ����� ����
		this.id=id;
	}
	public Member(String id, String pwd,String name)
	{
		this(id,pwd);
		this.name=name;
	}
	public void print()
	{
		System.out.println("Id: "+id);
		System.out.println("password: "+pwd);
		System.out.println("name: "+name);
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Member m=new Member();
		//m.print();
		/*m=new Member("shim");
		m.print();
		m=new Member("hong","1234","ȫ����");
		m.print();*/
		try
		{
			int a=10;
			if(a%2==0)
			{
				System.out.println();
				throw new MyException("¦����");
				
			}
		}catch(MyException m)
		{
			System.out.println(m.getMessage());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
