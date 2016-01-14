import java.util.Scanner;
public class 문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("단을 입력하세요:");
		int dan=scan.nextInt();
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}

}
