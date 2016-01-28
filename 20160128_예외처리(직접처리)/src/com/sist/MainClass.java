package com.sist;
import java.util.Scanner;
//2개의 정수를 받아서 배열에 저장 => 나누기
//1) 문자열 ==> 정수변환
//2) 배열의 범위 초과
//3) 나누기 (0으로)
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			int[] num=new int[2];
			System.out.print("첫번째 정수:");
			num[0]=Integer.parseInt(scan.next());
			//1차에러(정수가 아닐 수 있음)
			System.out.println("두번째 정수:");
			num[2]=Integer.parseInt(scan.next());
			//2차에러(배열 초과)
			System.out.println(num[0]/num[1]);
			//3차에서(배열을 해결하면 그 다음 에러가 나올 수 있는 경우로 -> 0이 들어오면 문제)
		}catch(NumberFormatException e)
		{
			System.out.println("정수로 변환할 수 없다:"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 범위 초과:"+e.getMessage());
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없다:"+e.getMessage());
		}catch(RuntimeException e) //예외 상위클래스는 밑에 있어야 함.
		{
			System.out.println("기타 Error"+e.getMessage());
		}
		finally
		{
			System.out.println("프로그램 종료"); //에러가 나도 정상적으로 프로그램 종료를 띄워줌
		}
	}

}
