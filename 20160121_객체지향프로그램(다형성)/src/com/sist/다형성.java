package com.sist;
/*
 * 	1. ������(�����ε�, �������̵�)
 * 		�����ε�(�ߺ��޼ҵ� ����)
 * 		�������̵�(�޼ҵ� ������)
 * 	===============================
 * 		�����ε� 			�������̵�
 * 	===============================
 * 	 ���� Ŭ���� ������ ó��           ����� �־�� ó��
 *   �޼ҵ���� ����		      �޼ҵ���� ����
 *   �Ű������� �ٸ���                  �Ű������� �����ϴ�
 *   �������� �������	               �������� �����ϴ�
 *   				      ������������ Ȯ��
 *   ===============================
 *   ������������ ũ��
 *   private < default < protected < public
 *   
 *   1) ĸ��ȭ : ��ɺ� �и�, ������ ����ȭ
 *   		=> �޼ҵ�� ������ �ϳ��� ���
 *   2) ��� : ������ Ŭ������ Ȯ���ؼ� ���
 *   		 �߰�(�����ε�), ����(�������̵�)=>(������)
 *   
 *   
 *   2. Ŭ������ ����
 *   1) �߻� Ŭ���� : ���������� ����Ǵ� �޼ҵ尡 ������ ��
 *   			 ��ư Ŭ��, ���콺 ó��, Ű���� ó��
 *   	����) public abstract class className
 *   		{
 *   			���� �� �޼ҵ尡 �Ѱ� �̻� (������ ���� �޼ҵ�)
 *   			public abstract ������ �޼ҵ��(); -> �߻�޼ҵ�
 *   			public void display(){}
 *   		}
 *   
 *   2) ���� Ŭ���� : ������, ��Ʈ��ũ, ������
 *   		=> �������� ���Ǵ� ������, �޼ҵ尡 �ִ� ��쿡 �ַ� ���
 *   		*******��� Ŭ����
 *   		class A
 *   		{
 *   			A�� B�� �������� ���� ������
 *   			class B
 *   			{
 *   			}
 *   		}
 *   		*******�͸��� Ŭ���� : ��Ӿ��� ������(�������̵�)
 *   		class A
 *   		{
 *   			B b=new B()
 *   			{
 *   				void display(){}
 *   			}
 *   		}
 *   		****** ����Ŭ����(������. �׳� �ִٴ� �͸� �˾Ƶα�)
 *   		class A
 *   		{
 *   			public void display()
 *   			{
 *   				class B
 *   				{
 *   				}
 *   			}
 *   		}
 *   
 *   3) ���� Ŭ���� : ����� �� �� ���� Ŭ����
 *   		=> ������ �Ұ����� Ŭ���� (String, Math, System)
 *   		public final class className
 *   		{
 *  		} 
 *   
 *   4) �������̽� : �߻�Ŭ������ ����
 *   		=> ���߻���� �����ϴ�
 *   		=> ��� �޼ҵ尡 �߻�޼ҵ�(���� �Ǿ�����)
 *   		=> ��� ������ �����
 *   		=> ���õ� Ŭ������ ��� ����
 *   		=> ǥ��ȭ�� �����ϴ�.
 *      ����)
 *      	public interface Name
 *      	{
 *      		(public static final�� ����)int a=20; //�����
 *      		(public abstract ����)void display(); // ������ �� �߿�. �������̽��� �Ƚ��� �� public�� ����
 *      	}
 *      	=> Ŭ������ �������̽��κ��� ��� => �޼ҵ带 �����ؼ� ���
 *      	public interface Name
 *      	{
 *      		void disp();
 *      		default public void aaa() //default, static�� 1.8�������� ��밡��, ����߰�����!
 *      		{
 *      		}
 *      		public static void bbb()
 *      		{
 *      		}      	
 *      	}
 *      
 *      	=> 
 *      	class A implements Name
 *      	{
 *      		public void disp(){} //������(public�Ⱦ��� ����)
 *      	}
 *      
 *      ���
 *      	interface ==> interface
 *      			extends ���
 *      	interface ==> class
 *      			implements ���
 *      	class ==> class
 *      			extends ���
 *      	class ==> interface
 *      			error -> Ŭ�������� ������ ���� �������̽����� ���� �Ұ���
 *      
 *      	interface A
 *      	interface B extends A   (���ϻ��)
 *      	interface C extends B   (���ϻ��)
 *      	class D implements C    (���ϻ��)
 *      	class D implements A,B,C (���߻��) - implements�� ����, �����嵵 ������ ����
 *      
 *      	============================================
 *      		�߻� Ŭ����					�������̽�
 *      	============================================
 *      		���� ���					���� ���
 *      		����(o), ����(x)			����(x)
 *      								default, static(1.8)
 *      		�������̵�					�������̵�
 *      		Ŭ������ ��� ��� =========>factory ����
 *      	=============================================
 */
//�߻�Ŭ����
abstract class Ani
{
	public abstract void eat(); //������ ���Ǹ� �ϰ� ��
	public void run() // �̰Ŵ� ������ ����
	{
		System.out.println("�׹߷� �ȴ´�");
	}
}
class Human extends Ani
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
	}
	public void run() // �̰Ŵ� ������ ����
	{
		System.out.println("�ι߷� �ȴ´�");
	}
	
}
class Dog extends Ani
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
	}
}
class Pig extends Ani
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Դ´�");
	}
	
}
public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ani an=new Human(); 
		an.eat();   //an. �ϳ��� ����! �߻�Ŭ���� interface�� ��!
		an.run();
		
		an=new Dog();
		an.eat();
		an.run();
		
		an=new Pig();
		an.eat();
		an.run();
	}

}
