import java.util.Scanner;
public class ��11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�:");
		int num=scan.nextInt();
		int sum=0;
		int i=1;
		 while(i<=num)
		 {
			 sum+=i;;
		 	i++;
		 }
		 System.out.println();
			System.out.println("�Է��� �������� ��:"+sum);
	}

}
