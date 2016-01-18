package com.sist;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * 	초기화블록 : 멤버변수에 대한 초기화 값을 부여
 * 
 * 	초기화
 * 	class A
 * 	{
 *		int a=10; //직접 값을 부여 
 * 		//클래스 영역은 선언부 (선언만 할 수 있음!로직을 짜는 부분이 아님)
 * 		1) 인스턴스 블럭
 * 		{
 * 		}
 * 		2) static 블럭
 * 		static
 * 		{
 * 		}
 * 	}
 * 
 * 	//순서 ==> 1) 직접처리
 * 			 2) 초기화 블록
 * 			 3) 생성자 (데이터 초기화)
 */
import java.io.*;
public class 초기화블록 {
	/*int a=10;
	{
		a=20; //이 안에서는 초기화! 연산자나 제어문, 반복문 사용이 가능, 클래스에 바로 작성 못함
				// 데이터베이스, 네트워크, 쓰레드 -> 들어가자마자 작동하게 할 때 쓰임
	}*/
	String[] sawon=new String[5];
	{
		try
		{
			File file=new File("C:\\Users\\aaa\\Desktop\\sawon.txt");
			FileReader fw=new FileReader(file);
			int i=0;
			char[] buffer=new char[1024];
			String str="";
			while((i=fw.read(buffer,0,1024))!=-1)
			{
				str+=new String(buffer);
				
			}
			
			StringTokenizer st=
					new StringTokenizer(str, "\n");
			int a=0;
			while(st.hasMoreTokens())
			{
				sawon[a]=st.nextToken();
				a++;
			}
			
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			초기화블록 aa=new 초기화블록();
			//System.out.println(aa.a);
			for(int i=0;i<aa.sawon.length;i++)
			{
				System.out.println(aa.sawon[i]);
			}
	}

}
