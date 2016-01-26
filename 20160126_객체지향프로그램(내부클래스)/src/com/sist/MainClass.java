package com.sist;
/*
 * 	반복문 : for-each
 *  형식) for(데이터형 변수 : 집합체)
 *  	=> 집합체 : 배열, 컬렉션
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
		String[] names={"홍길동","홍길순","홍동동","홍청동","홍향동"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("for-each");
		for(String name:names)
		{
			System.out.println(name);
		}
		System.out.println("사용자 정의 클래스");
		Student s1=new Student("홍길동", "남자", "010-1111-1111");
		Student s2=new Student("홍길순", "여자", "010-2222-2222");
		Student s3=new Student("홍길수", "남자", "010-3333-3333");
		Student[] std={s1,s2,s3};
		for(Student s:std)
		{
			System.out.println("이름 : "+s.name);
			System.out.println("성별 : "+s.sex);
			System.out.println("전화번호 : "+s.tel);
		}
	}

}
