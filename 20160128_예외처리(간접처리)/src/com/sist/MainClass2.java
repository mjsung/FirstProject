package com.sist;
/*
 * 	임의 발생
 * 	throw new 예외클래스 호출(X)
 * 
 * 	=> 자신의 객체를 나타낼 때 : this
 * 	=> 상위 클래스를 나타낼 때 : super
 * ==========================
 * 	생성자
 * 	자신의 생성자 : this()
 *  상위 클래스 생성자 : super()
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
		name="박문수";
				
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
		name="홍길동";
		super.print();
	}
	public Member(String id, String pwd)
	{
		this.id=id;
		this.pwd=pwd;
	}
	public Member(String id)
	{
		
		this(); //생성자호출. this()라는 메소드는 반드시 첫줄에 사용한다.
		//생성자 안에서만 사용이 가능
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
		m=new Member("hong","1234","홍길자");
		m.print();*/
		try
		{
			int a=10;
			if(a%2==0)
			{
				System.out.println();
				throw new MyException("짝수다");
				
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
