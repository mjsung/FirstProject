import java.util.Scanner;
public class 문9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.println("세번째 정수 입력:");
		int num3=scan.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("입력한 값 중 "+num1+"이 가장 큰 수 입니다.");
		}
		if(num2>num1 && num2>num3)
		{
			System.out.println("입력한 값 중 "+num2+"이 가장 큰 수 입니다.");
		}
		if(num3>num1 && num3>num1)
		{
			System.out.println("입력한 값 중 "+num3+"이 가장 큰 수 입니다.");
		}
	}

}
