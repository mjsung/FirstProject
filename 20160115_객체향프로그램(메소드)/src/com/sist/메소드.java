package com.sist;
/*
 * �Ѱ��� ���� �ȿ� Ŭ������ 2�� �̻�
 * 1) public ~ class�� �ݵ�� 1���� ����
 * 2) public ~ class ������� �ȴ�
 * 3)
 */
import java.util.Scanner;
/*
 *	Ŭ������ �뵵 2��
 *	1) ������ (������ ���� Ŭ����) :DTO
 *	2) ��� (�׼� Ŭ����) :DAO
 *	3) ������ + ��� ()
 */
// ����� ���� ��������
class Student
{
	int hakbun;
	String name;
	int kor; 
	int eng;
	int math;
	int rank;
	int total;
	double avg;
	char hak;
}

public class �޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std=new Student[3]; //������ ������� ���� ������ �ƴ�
		//int[] a=new int[3] => a[0~2] =0
		//Ŭ����[] a=new Ŭ����[3] => a[0~2] =null
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			std[i]=new Student(); //���� ������
			std[i].hakbun=i+1;
			System.out.print("�̸�:");
			std[i].name=scan.next();
			System.out.print("��������:");
			std[i].kor=scan.nextInt();
			System.out.print("��������:");
			std[i].eng=scan.nextInt();
			System.out.print("��������:");
			std[i].math=scan.nextInt();
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			std[i].avg=std[i].total/3.0;
			//~DTO, ~VO => �ƹ������ ����. ����ִ� ��
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("�̸� : "+std[i].name);
			System.out.println("�������� : "+std[i].kor);
			System.out.println("�������� : "+std[i].eng);
			System.out.println("�������� : "+std[i].math);
			System.out.println("����: "+std[i].total);
			System.out.println("��� : "+std[i].avg);
			System.out.println("===================");
		}
	}

}
