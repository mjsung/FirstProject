import java.util.Scanner;
public class ��9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��° ���� �Է�:");
		int num1=scan.nextInt();
		System.out.println("�ι�° ���� �Է�:");
		int num2=scan.nextInt();
		System.out.println("����° ���� �Է�:");
		int num3=scan.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("�Է��� �� �� "+num1+"�� ���� ū �� �Դϴ�.");
		}
		if(num2>num1 && num2>num3)
		{
			System.out.println("�Է��� �� �� "+num2+"�� ���� ū �� �Դϴ�.");
		}
		if(num3>num1 && num3>num1)
		{
			System.out.println("�Է��� �� �� "+num3+"�� ���� ū �� �Դϴ�.");
		}
	}

}
