


import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan=new Scanner(System.in);
		System.out.print("����(2~9)�Է�:");
		int dan=scan.nextInt();
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}*/
		
		//for�� �̿��ؼ� 1~100������ ������ ������ ���� ���
		/*int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			System.out.println(i+":"+sum);
		}
		
		System.out.println("sum="+sum);
		*/
		//1~100 : ¦���� ��, Ȧ���� ��, ��ü�� ���� ���Ѵ�.
		/*int even=0; //0�� �ʱ�ȭ
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
		System.out.println("1~100�� ¦���� ��:"+even);
		System.out.println("1~100�� Ȧ���� ��:"+odd);
		System.out.println("1~100�� ��ü�� ��:"+sum);*/
	
		int sum3=0; //�����Ǵ� ���� �ʱⰪ ������ 0
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
		System.out.println("1~100�� 3�� ��� ��:"+sum3);
		System.out.println("1~100�� 5�� ��� �� :"+sum5);
		System.out.println("1~100�� 7�� ��� �� :"+sum7);
		
	}

}
