/*
 * 다중 조건문
 * if(조건문)
 * 문장1
 * else if(조건문)
 * 문장2
 * else if(조건문)
 * 문장3
 * else
 * 문장4
 * 
 */
import java.util.Scanner;

public class 조건문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int jumsu=85;
		char hak='A';
		if(jumsu>=90) //false
			hak='A';
		else if(jumsu>=80) //t
			hak='B'	;
		else if(jumsu>=70) //t
			hak='C';
		else if(jumsu>=60) //f
			hak='D';
		else
			hak='F';
		
		System.out.println(hak);*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int jumsu=scan.nextInt();
		
		
		/*if(jumsu<0 || jumsu>100)
			System.out.println("0~100점 사이의 점수를 입력해주십시오");*/
		if(jumsu>=90 && jumsu<=100){
			System.out.println("A학점 / 점수 : "+jumsu);
		}
		else if(jumsu>=80 && jumsu<=89)
		{
			System.out.println("B학점 / 점수 : "+jumsu);
		}
		else if(jumsu>=70 && jumsu<=79)
		{
			System.out.println("C학점 / 점수 : "+jumsu);
		}	
		else if(jumsu>=60 && jumsu<=69)
		{
			System.out.println("D학점 / 점수 : "+jumsu);
		}
		else if(jumsu<60)
		{
			System.out.println("F학점 / 점수 : "+jumsu);
		}
		else
		{
			System.out.println("0~100점 사이의 점수를 입력해주십시오");
		}
	}

}
