import java.util.Scanner;
public class 문자열3 {
	static String calc(int a, char op, int b)
	{
		String str=""; //초기화
		int res=0;
		switch(op)
		{
		case '+':
			res=a+b;
			str=String.valueOf(res); //valueOf : 모든 데이터형을 문자열로 변경
			break;
		case '-':
			res=a-b;
			str=String.valueOf(res); //문자열로 넘어감
			break;
		case '*':
			res=a*b;
			str=String.valueOf(res); //문자열로 넘어감
			break;
		case '/':
			if(b==0)
				str="0으로 나눌 수 없습니다";
			else
			{
			res=a/b;
			str=String.valueOf(res); //문자열로 넘어감
			}
			break;
			default:
				str="잘못된 연산자입니다";
		}
		return str;
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : " );
		int a=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/): " );
		String op=scan.next();
		System.out.print("두번째 정수 입력 : " );
		int b=scan.nextInt();
		
		String result=calc(a,op.charAt(0),b); //op.charAt(0)은 문자열 연산자 가져와야함
		System.out.println("결과: "+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
