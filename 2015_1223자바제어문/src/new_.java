import java.util.Scanner;
public class new_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 Math.random() => 0.0~0.99
		int a=(int)(Math.random()*100);
		int b=(int)(Math.random()*100);
		
		System.out.println("문제를 맞춰보세요");
		System.out.println(a+"+"+b);
		Scanner scan=new Scanner(System.in);
		int user=scan.nextInt();
		
		if(user==a+b)
		{
			System.out.println((a+b)+"/ 정답입니다");
		}
		else
		{
			System.out.println("정답은\n"+(a+b)+"/ 다시 풀어보세요");
		}
			
	}

}
