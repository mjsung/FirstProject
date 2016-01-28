package com.sist;
/*
 * 예외처리 : 정상상태를 유지
 *  = 직접처리 : try~catch
 *  = 간접처리 : throws
 *  = 임의 발생 : throw
 *  = 사용자 정의 : class MyException extends Exception
 *  = 기본 목적 : 에러를 방지하는 예방 프로그램
 *  *****원래 ==> 자바는 모든 클래스는 예외처리를 가지고 있다
 *  	 실행시 에러는 예외처리를 생략할 수 있다.
 *  	System.in : 반드시 예외처리
 *  	System.out : 예외처리를 생략
 *  
 *  1) check exception : 컴파일시 에러
 *  2) noncheck exception : 실행시 에러
 *  
 *  자바
 *  		    컴파일(javac)				   java
 *  	원시소스  ==========> 바이트 코드(.class)  ======> 출력
 *  
 *  *****처리방법
 *  try
 *  {
 *  	실행 가능한 소스
 *  	1 == 정상실행
 *   	2 == 예외발생 ===> 2
 *   	3 == 정상실행 
 *  }catch(예외처리 종류1)
 *  {
 *  	예외에 대한 조치
 *  }catch(예외처리 종류2)
 *  {
 *  	예외에 대한 조치  ====> 
 *  }catch(예외처리 종류3)
 *  {
 *  	예외에 대한 조치
 *  }catch(예외처리 종류4)
 *  {
 *  	예외에 대한 조치
 *  }catch(예외처리 종류5)
 *  {
 *  	예외에 대한 조치
 *  }
 *  finally
 *  {
 *  	정상수행이나 예외 => 무조건 수행하는 문장(생략이 가능)
 *  	try catch
 *  	밑에 있는 문장 수행
 *  }
 *  4
 *  5    
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1번");
		System.out.println("2번");
		try
		{
			System.out.println("3번");
			System.out.println(10/0);
			System.out.println("4번");
			
		}
		//배열범위 초과
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("5번");
		}
		//정수변환이 잘못되었을 때. Integer.parseInt("1")
		catch(NumberFormatException e){
			System.out.println("6번");
		}
		//0으로 나눌경우
		catch(ArithmeticException e){
			System.out.println("7번");
		}
		//실행시 모든 에러
		catch(RuntimeException e){
			System.out.println("8번");
		}
		finally
		{
			System.out.println("9번");
		}
		System.out.println("10번");
		//1->2->3->7->9->10 실행
	}

}
