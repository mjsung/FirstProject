package com.sist;
//DAO, Manager - �����͸� �����ϴ� Ŭ����
import java.util.Scanner;
public class StudentConfig {
	public void jumsuInput(Student s)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("�������� �Է�:");
		s.setKor(scan.nextInt());
		System.out.print("�������� �Է�:");
		s.setEng(scan.nextInt());
		System.out.print("�������� �Է�:");
		s.setMath(scan.nextInt());
	}
	public void jumsuTotal(Student s)
	{
		s.setTotal(s.getKor()+s.getEng()+s.getMath());
	}
	public void jumsuAvg(Student s)
	{
		s.setAvg(s.getTotal()/3.0);
	}
	public void jumsuHarkjum(Student s)
	{
		char c='A';
		switch(s.getTotal()/30)
		{
		case 10:
		case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
			break;
		}
		s.setHakjum(c);
	}
}
