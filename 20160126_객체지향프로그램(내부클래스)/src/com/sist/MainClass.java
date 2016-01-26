package com.sist;
/*
 * 	�ݺ��� : for-each
 *  ����) for(�������� ���� : ����ü)
 *  	=> ����ü : �迭, �÷���
 *  	
 *  	int[] arr={1,2,3,4,5};
 *	 	-> for(int i=0;i<arr.length;i++)
 *		-> for(int a:arr)
 *
 */
class Student
{
	String name;
	String sex;
	String tel;
	public Student(String n,String s, String t)
	{
		name=n;
		sex=s;
		tel=t;
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"ȫ�浿","ȫ���","ȫ����","ȫû��","ȫ�⵿"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("for-each");
		for(String name:names)
		{
			System.out.println(name);
		}
		System.out.println("����� ���� Ŭ����");
		Student s1=new Student("ȫ�浿", "����", "010-1111-1111");
		Student s2=new Student("ȫ���", "����", "010-2222-2222");
		Student s3=new Student("ȫ���", "����", "010-3333-3333");
		Student[] std={s1,s2,s3};
		for(Student s:std)
		{
			System.out.println("�̸� : "+s.name);
			System.out.println("���� : "+s.sex);
			System.out.println("��ȭ��ȣ : "+s.tel);
		}
	}

}
