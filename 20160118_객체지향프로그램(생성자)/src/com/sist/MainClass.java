package com.sist;
/*
 * �ڹ� => ������ ����
 * 	1) ���ϸ�� Ŭ�������� ����
 *  2) ����
 *     package : �ѹ��� ���
 *     import : ������ ��� �� �� �ִ�
 *     class className
 *     {
 *     	==============
 *     	�������(instance)
 *     	���뺯��(static)
 *     	==============
 *      �޼ҵ� ���� : �޼ҵ� �ȿ� �ٸ� �޼ҵ带 ������ �� ����.
 *     	==============
 *      ������ (������ ����)
 *     	==============
 *     }
 *       class A => ������, ��Ʈ��ũ
 *     {
 *     	   	class B
 *     		{
 *     		}
 *     		
 *     }
 *     /////���� ���ô� ���� Ŭ����
 *     
 *     class A
 *     {
 *     	    void disp()
 *     		{
 *     			class B
 *     			{
 *     			}
 *     		}
 *     }
 *     /////////���� ���ô� ����Ŭ����
 *     
 *     class A
 *     {
 *     	    void disp()
 *     		{
 *     			void aaa()
 *     			{
 *     			}
 *     		}
 *     }
 *     //////////���� ���ô� ����! �޼ҵ� �ȿ� �޼ҵ�� ���� �� ����.
 *     
 *     1) ��ü�� ���ȭ
 *     	�����Ϳ� ���۷��̼�(�޼ҵ�)�� �����ϴ� ����̴�.
 *      ==> ������ �׷�ȭ(ĸ��ȭ)
 *      ==> ����
 *      ==> ����, �߰�
 *     2) ������
 *     	==> Ŭ������ �޸𸮿� ������ ��쿡 ȣ��Ǵ� �޼ҵ�
 *     		new ������()
 *     	==> Ư¡
 *     		1. Ŭ������� ����
 *     		2. �������� ����
 *     		3. �����ε��� �����Ѵ�(�������� �����ڰ� ������ �� �ִ�)
 *     		================
 *     		 = ���� Ŭ������ ����
 *           = �޼ҵ���� ����
 *           = �Ű����� ������ ���������� �ٸ���
 *           = �������� ���谡 ����
 *           = �ߺ� �Լ� ����
 *           
 *     		4. ��������� �ʱ�ȭ(�ʱ�ȭ��)
 *     		5. ���ó : ������, ��Ʈ��ũ, ������, �����ͺ��̽�
 *     		6. �������Լ��� ������ �� ��쿡�� JVM �ڵ����� ������ �Լ��� �����Ѵ�.
 *     			(����Ʈ ������)-> �Ű����� ���� ������
 *     			new A();
 *     		7. ������ => ��ü�� ����
 *     			= ��ü�� �Ҹ� => �Ҹ���(object)
 *     			��ü�� null�̰ų� ���̻� ������� �ʴ� ��쿡 �ڵ����� �޸� ȸ��.(GC-Garbage Collector)
 */
public class MainClass {
    int age; //0
    String name; //nill
    /*MainClass()
    {
    	name="ȫ�浿";
    	age=30;
    }*/
    MainClass(String n,int a)
    {
    	name=n;
    	age=a;
    }
    MainClass()
    {
    	name="ȫ�浿";
    	age=30;
    }
    MainClass(int a)
    {
    	age=a;
    }
    MainClass(String n)
    {
    	name=n;
    }
    // �Ϲ� �޼ҵ�
    void MainClass()
    {
    	name="������";
    	age=28;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*MainClass m=new MainClass();
        System.out.println(m.name);
        System.out.println(m.age);*/
		MainClass m=new MainClass("��û��",25);
		System.out.println(m.name);
        System.out.println(m.age);
        m=new MainClass(20);
        System.out.println(m.name);
        System.out.println(m.age);
        
        m=new MainClass("�����");
        System.out.println(m.name);
        System.out.println(m.age);
		
	}
}








