package com.sist;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setHakbun(1);
		s.setName("ȫ�浿");
		//ĸ��ȭ(get***-�б�, set***-����)
		StudentConfig sc=new StudentConfig();
		sc.jumsuInput(s);
		sc.jumsuTotal(s);
		sc.jumsuAvg(s);
		sc.jumsuHarkjum(s);
		
		//���
		System.out.println("�й�:"+s.getHakbun());
		System.out.println("�̸�:"+s.getName());
		System.out.println("��������:"+s.getKor());
		System.out.println("��������:"+s.getEng());
		System.out.println("��������:"+s.getMath());
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAvg());
		System.out.println("����:"+s.getHakjum());
		
	}

}
