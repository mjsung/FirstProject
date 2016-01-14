


import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan=new Scanner(System.in);
		System.out.print("정수(2~9)입력:");
		int dan=scan.nextInt();
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}*/
		
		//for을 이용해서 1~100까지의 정수를 누적한 값을 출력
		/*int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			System.out.println(i+":"+sum);
		}
		
		System.out.println("sum="+sum);
		*/
		//1~100 : 짝수의 합, 홀수의 합, 전체의 합을 구한다.
		/*int even=0; //0값 초기화
		int odd=0;
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				even+=i;
			
			 * even = 0
			 * even+=i => even=even+i;
			 * 			  even=0+2;
			 * 			  even=2;
			 * 				even+=i
			 * 				even=even+i
			 
			else
				odd+=i;
			
			sum+=i;
		}
		System.out.println("1~100의 짝수의 합:"+even);
		System.out.println("1~100의 홀수의 합:"+odd);
		System.out.println("1~100의 전체의 합:"+sum);*/
	
		int sum3=0; //누적되는 값은 초기값 무조건 0
		int sum5=0;
		int sum7=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				sum3+=i;
			if(i%5==0)
				sum5+=i;
			if(i%7==0)
				sum7+=i;
		
			
		}
		System.out.println("1~100의 3의 배수 합:"+sum3);
		System.out.println("1~100의 5의 배수 합 :"+sum5);
		System.out.println("1~100의 7의 배수 합 :"+sum7);
		
	}

}
