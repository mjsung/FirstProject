package com.sist;
interface �����
{
	void fly();
}
interface ��
{
	void ship();	
}
class �ڵ��� implements �����, ��
{

	@Override
	public void ship() {
		// TODO Auto-generated method stub
		System.out.println("�� ��� �߰�");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("����� ��� �߰�");
	}
	public void drive()
	{
		System.out.println("�ڵ��� ���");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			����� a=new �ڵ���();
			a.fly();
	
			
			�� b=new �ڵ���();
			b.ship();
			
			�ڵ��� c=new �ڵ���();
			c.drive();
			c.fly();
			c.ship();
	}

}
