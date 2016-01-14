//while문
//단을 입력받아서 => 해당 단을 출력
//입력값
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단을 입력해라
		Scanner scan=new Scanner(System.in);
		System.out.println("단 입력 : ");
		int dan=scan.nextInt();
		//단을 받아서 구구단 출력
		System.out.println("while문 처리");
		int i=1;
		while(i<=9)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		System.out.println("do~while문 처리");
		i=1; //i가 위에서 10일때 빠져나와서 현재 i값은 10임. 그래서 다시 i를 1로 초기화 , 또는 j라는 변수를 1로 지정해도됨
		do
		{
			System.out.println(dan+"*"+i+"="+dan*1);
			i++;
		}while(i<=9);
	}
	
}
// 변수 ==> 사용후에 다시 사용이 가능
// int i=10;
// i=5;