package com.sist;
class A
{
	public void display(){
		
		System.out.println("A: display() Call...");
	}
	public String toStrin()
	{
		return "aaa";
	}
}
class B extends A
{
	public void display(){
		
		System.out.println("B: display() Call...");
	}
	public void aaa()
	{
		System.out.println("B: aaa() Call..."); // A에서는 B에 있는 거는 갖다쓸수 없다. 하위클래스것은 가져다 쓸수없다.
	}
}
public class MainClass2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*A a=new A();
			a.display();
			B b=new B();
			a=b;
			a.display();
			b=(B)a; //형변환
			b.display();*/
			
			Object o=new A();
			o.toString();
			System.out.println(o.toString());
			Object o1=new B();
			//변수 : 클래스타입, 메소드 : 생성자를 확인
			
			
			/*B b=new B();
			b.display();
			A c=new B();
			c.display();
			B d=new A(); //ERROR, 클래스가 A가 더 크다
			d.display();*/
			
		
	}

}
