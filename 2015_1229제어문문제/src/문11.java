import java.util.Scanner;
public class 문11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		int sum=0;
		int i=1;
		 while(i<=num)
		 {
			 sum+=i;;
		 	i++;
		 }
		 System.out.println();
			System.out.println("입력한 값까지의 합:"+sum);
	}

}
