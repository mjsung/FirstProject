/*
 * ���� ���ǹ�
 * if(���ǹ�)
 * ����1
 * else if(���ǹ�)
 * ����2
 * else if(���ǹ�)
 * ����3
 * else
 * ����4
 * 
 */
import java.util.Scanner;

public class ���ǹ�6 {

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
		System.out.println("���� �Է� : ");
		int jumsu=scan.nextInt();
		
		
		/*if(jumsu<0 || jumsu>100)
			System.out.println("0~100�� ������ ������ �Է����ֽʽÿ�");*/
		if(jumsu>=90 && jumsu<=100){
			System.out.println("A���� / ���� : "+jumsu);
		}
		else if(jumsu>=80 && jumsu<=89)
		{
			System.out.println("B���� / ���� : "+jumsu);
		}
		else if(jumsu>=70 && jumsu<=79)
		{
			System.out.println("C���� / ���� : "+jumsu);
		}	
		else if(jumsu>=60 && jumsu<=69)
		{
			System.out.println("D���� / ���� : "+jumsu);
		}
		else if(jumsu<60)
		{
			System.out.println("F���� / ���� : "+jumsu);
		}
		else
		{
			System.out.println("0~100�� ������ ������ �Է����ֽʽÿ�");
		}
	}

}
