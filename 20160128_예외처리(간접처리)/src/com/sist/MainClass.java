package com.sist;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/*
 * 간접처리
 * = 예외에 대한 등록(예약)
 * = 시스템에 의해 처리
 * = 사용법
 * 	메소드()throws 예외의 종류....
 * 
 * 	double div(int[] a) throws ArithmeticException, ArrayIndexOutOfBoundsException
 * 		=> 예외클래스 순서는 없다. 
 * 		이러한 에러가 예상된다고 쓰는 것 (실행시에러(RuntimeException)는 생략가능, 위의 내용은 처리를 하지않아도 에러가 안남!)
 * 		
 * 		int[] arr={1,2};
 * 		double res=div(arr);
 */
public class MainClass {
	double div(int[] arr) throws Exception, RuntimeException, SQLException
	{
		return arr[0]/arr[1];
	}
	public static void main(String[] args) 
	//throws Exception 
	{
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		int[] arr={10,0};
		try
		{
		double d=m.div(arr);
		}catch(Exception ex){} //위에 예상한 3개의 예외보다 큰걸로!
	}

}
