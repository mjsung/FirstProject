/*
 *  3,5,7�� ���
 * 
 */
import java.util.Scanner;

public class ���ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num=21;
		if(num%3==0)
			System.out.println(num+"��(��) 3�� �����");
		if(num%5==0)
			System.out.println(num+"��(��) 5�� �����");
		if(num%7==0)
			System.out.println(num+"��(��) 7�� �����");
		int num=10;
		if(num%2==0)
			System.out.println(num+"��(��) ¦����");
			System.out.println("program End");*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1~100������ ������ �Է��ϼ���.");
		int num1=scan.nextInt();
		if(num1<0 || num1>100)
		{
			System.out.print("�߸��Է��ϼ̽��ϴ�.1~100������ ������ �Է��ϼ���.");
		}
		if(num1%3==0)
		{
			System.out.println(num1+"��(��) 3�� ����Դϴ�");
		}
		if(num1%5==0)
		{
			System.out.println(num1+"��(��) 5�� ����Դϴ�");
		}
		if(num1%7==0)
		{
			System.out.println(num1+"��(��) 7�� ����Դϴ�");
		}
		else if(num1%2==0)
		{
			System.out.println(num1+"��(��) ¦���Դϴ�");
		}
		else
		{
			System.out.println(num1+"��(��) Ȧ���Դϴ�");
		}
	}

}
