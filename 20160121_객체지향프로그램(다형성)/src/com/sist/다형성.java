package com.sist;
/*
 * 	1. 다형성(오버로딩, 오버라이딩)
 * 		오버로딩(중복메소드 정의)
 * 		오버라이딩(메소드 재정의)
 * 	===============================
 * 		오버로딩 			오버라이딩
 * 	===============================
 * 	 같은 클래스 내에서 처리           상속이 있어야 처리
 *   메소드명이 동일		      메소드명이 동일
 *   매개변수가 다르다                  매개변수가 동일하다
 *   리터형과 관계없다	               리턴형이 동일하다
 *   				      접근지정어의 확대
 *   ===============================
 *   접근지정어의 크기
 *   private < default < protected < public
 *   
 *   1) 캡슐화 : 기능별 분리, 데이터 은닉화
 *   		=> 메소드와 변수가 하나로 묶어서
 *   2) 상속 : 기존의 클래스를 확장해서 사용
 *   		 추가(오버로딩), 변경(오버라이딩)=>(다형성)
 *   
 *   
 *   2. 클래스의 종류
 *   1) 추상 클래스 : 공통적으로 적용되는 메소드가 존재할 때
 *   			 버튼 클릭, 마우스 처리, 키보드 처리
 *   	원형) public abstract class className
 *   		{
 *   			선언만 된 메소드가 한개 이상 (구현이 없는 메소드)
 *   			public abstract 리턴형 메소드명(); -> 추상메소드
 *   			public void display(){}
 *   		}
 *   
 *   2) 내부 클래스 : 윈도우, 네트워크, 쓰레드
 *   		=> 공통으로 사용되는 데이터, 메소드가 있는 경우에 주로 사용
 *   		*******멤버 클래스
 *   		class A
 *   		{
 *   			A와 B가 공통으로 사용된 데이터
 *   			class B
 *   			{
 *   			}
 *   		}
 *   		*******익명의 클래스 : 상속없이 재정의(오버라이딩)
 *   		class A
 *   		{
 *   			B b=new B()
 *   			{
 *   				void display(){}
 *   			}
 *   		}
 *   		****** 지역클래스(사용안함. 그냥 있다는 것말 알아두기)
 *   		class A
 *   		{
 *   			public void display()
 *   			{
 *   				class B
 *   				{
 *   				}
 *   			}
 *   		}
 *   
 *   3) 종단 클래스 : 상속을 할 수 없는 클래스
 *   		=> 변경이 불가능한 클래스 (String, Math, System)
 *   		public final class className
 *   		{
 *  		} 
 *   
 *   4) 인터페이스 : 추상클래스의 일종
 *   		=> 다중상속이 가능하다
 *   		=> 모든 메소드가 추상메소드(선언만 되어있음)
 *   		=> 모든 변수는 상수형
 *   		=> 관련된 클래스를 묶어서 관리
 *   		=> 표준화가 가능하다.
 *      원형)
 *      	public interface Name
 *      	{
 *      		(public static final이 생략)int a=20; //상수형
 *      		(public abstract 생략)void display(); // 생략된 것 중요. 인터페이스는 안썼을 때 public이 생략
 *      	}
 *      	=> 클래스가 인터페이스로부터 상속 => 메소드를 구현해서 사용
 *      	public interface Name
 *      	{
 *      		void disp();
 *      		default public void aaa() //default, static이 1.8버전부터 사용가능, 기능추가가능!
 *      		{
 *      		}
 *      		public static void bbb()
 *      		{
 *      		}      	
 *      	}
 *      
 *      	=> 
 *      	class A implements Name
 *      	{
 *      		public void disp(){} //구현됨(public안쓰면 오류)
 *      	}
 *      
 *      상속
 *      	interface ==> interface
 *      			extends 사용
 *      	interface ==> class
 *      			implements 사용
 *      	class ==> class
 *      			extends 사용
 *      	class ==> interface
 *      			error -> 클래스에서 구현된 것을 인터페이스에서 관리 불가능
 *      
 *      	interface A
 *      	interface B extends A   (단일상속)
 *      	interface C extends B   (단일상속)
 *      	class D implements C    (단일상속)
 *      	class D implements A,B,C (다중상속) - implements는 가능, 쓰레드도 구현이 가능
 *      
 *      	============================================
 *      		추상 클래스					인터페이스
 *      	============================================
 *      		단일 상속					다중 상속
 *      		구현(o), 구현(x)			구현(x)
 *      								default, static(1.8)
 *      		오버라이딩					오버라이딩
 *      		클래스를 묶어서 사용 =========>factory 패턴
 *      	=============================================
 */
//추상클래스
abstract class Ani
{
	public abstract void eat(); //무조건 정의를 하고 들어감
	public void run() // 이거는 재정의 가능
	{
		System.out.println("네발로 걷는다");
	}
}
class Human extends Ani
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("수저로 먹는다");
	}
	public void run() // 이거는 재정의 가능
	{
		System.out.println("두발로 걷는다");
	}
	
}
class Dog extends Ani
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개같이 먹는다");
	}
}
class Pig extends Ani
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("돼지같이 먹는다");
	}
	
}
public class 다형성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ani an=new Human(); 
		an.eat();   //an. 하나로 관리! 추상클래스 interface가 편리!
		an.run();
		
		an=new Dog();
		an.eat();
		an.run();
		
		an=new Pig();
		an.eat();
		an.run();
	}

}
