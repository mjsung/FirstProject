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
		System.out.println("B: aaa() Call..."); // A������ B�� �ִ� �Ŵ� ���پ��� ����. ����Ŭ�������� ������ ��������.
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
			b=(B)a; //����ȯ
			b.display();*/
			
			Object o=new A();
			o.toString();
			System.out.println(o.toString());
			Object o1=new B();
			//���� : Ŭ����Ÿ��, �޼ҵ� : �����ڸ� Ȯ��
			
			
			/*B b=new B();
			b.display();
			A c=new B();
			c.display();
			B d=new A(); //ERROR, Ŭ������ A�� �� ũ��
			d.display();*/
			
		
	}

}
