/*
 *  3,5,7의 배수
 * 
 */
import java.util.Scanner;

public class 조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num=21;
		if(num%3==0)
			System.out.println(num+"는(은) 3의 배수다");
		if(num%5==0)
			System.out.println(num+"는(은) 5의 배수다");
		if(num%7==0)
			System.out.println(num+"는(은) 7의 배수다");
		int num=10;
		if(num%2==0)
			System.out.println(num+"는(은) 짝수다");
			System.out.println("program End");*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1~100사이의 정수를 입력하세요.");
		int num1=scan.nextInt();
		if(num1<0 || num1>100)
		{
			System.out.print("잘못입력하셨습니다.1~100사이의 정수를 입력하세요.");
		}
		if(num1%3==0)
		{
			System.out.println(num1+"는(은) 3의 배수입니다");
		}
		if(num1%5==0)
		{
			System.out.println(num1+"는(은) 5의 배수입니다");
		}
		if(num1%7==0)
		{
			System.out.println(num1+"는(은) 7의 배수입니다");
		}
		else if(num1%2==0)
		{
			System.out.println(num1+"는(은) 짝수입니다");
		}
		else
		{
			System.out.println(num1+"는(은) 홀수입니다");
		}
	}

}
