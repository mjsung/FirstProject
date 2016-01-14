import java.util.Scanner;
//단을 입력받아서 ==> 구구단 출력
/*
 *  단을 입력 ==> 정수값 저장(매개변수는 없고 리턴형은 있음)
 *  구구단 출력 ==> 저장된 정수(리턴형은 없고 매개변수는 있음)
 */
public class 메소드7 {
	static int danInput()
	{
		return (int)(Math.random()*8)+2; //2~9까지 발생
	}
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=danInput();
		gugudan(dan);
	}

}
