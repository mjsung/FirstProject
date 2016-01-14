/*
 * 	클래스 발전 과정
	  	변수 -> 배열 -> 구조체 -> 클래스
	    : 데이터를 모아서 관리
	  	변수 : 단일 데이터를 저장해서 사용
	  	배열 : 같은 크기의 데이터를 저장해서 사용
	  	구조체 : 다른 크기의 데이터를 모아서 사용 (모든 데이터=>공개)
	   클래스 : 구조체 + 메소드 (비공개)
 *  클래스의 구성요소
 *  	데이터(속성)
 *  		=> 멤버변수
 *  		       공통변수(클래스변수) => static
 *  		       객체변수(인스턴스 변수) => (x)
 *  		사용법
 *  		class A
 *  		{
 *				int a;
 *				static int b;  
 *  		}
 *  		b변수는 클래스를 가상머신 읽어올 경우에 저장
 *  		a변수는 저장 공간 만든 후에 사용이 가능(new)
 *  		A aa=new A();
 *  		stack
 *  		==== aa
 *  		100				heap
 *  		====			==== 100번지
 *  						  a
 *  						====
 *  		메소드(기능) : 저장된 변수에 대해서 동작 수행
 *  
 *  		클래스 제작
 *  		1) 추상화 작업 : 설계(모델링)
 *  		=> 현실세계의 모든 사물을 단순화
 *  		사람
 *  		=======
 *  		  이름
 *  		  성별
 *  		  주민번호
 *  		  입
 *  		  눈
 *  		  코
 *  		  귀
 *  		=======
 *  		 입=>말하기 기능
 *  		 귀=>듣는다
 *  		 눈=>본다  (동작기능을 가지는 것이 메소드)
 *  		=======
 *  		2) 구체화 작업 : 모델링 내용을 시뮬레이션
 *  
 *  		1) 변수 ==> 배열, 클래스
 *  		2) 명령문 ==> 메소드
 *  		3) 클래스 ==> 패키지
 *  ================================
 *  		클래스형식 (java)
 *  		1) package
 *  		2) import ==>여러개 쓸 수 있음
 *  		3) class className
 *  			{
 *  				변수선언
 *  			===================
 *  				메소드 선언
 *  			===================
 *  				생성자 선언 => 생략 (new 다음에 나오는게 생성자)
 *  			===================
 *  			}
 *  
 *  		숫자야구게임
 *  		난수발생 => com[]
 *  		입력	 =>	user[]
 *  		비교	 => com[], user[] 비교 => s,b
 *  		힌트	 => s,b
 *  		종료  	 => s
 *  
 *  
 *  	void test()
 *  	{
 *  		int a=10;
 *  		System.out.println(a);
 *  		a++;
 *  	}
 *  
 *  	test();  => a=10
 *  	test();  => a=10
 *  	test();  => a=10 //a는 지역변수라서 블록이 끝나면 사라짐. 11로 증가하고 사라짐
 */

import javax.swing.*;
/*
 * *자기 자신 클래스의 멤버변수를 쓰려면 this. 을 찍고 활용된다 (s=0; 은 사실 this.s=0;) 
 * 생략 : 1. extends object 
 *  	- 모든 클래스는 상속을 받았다. object 클래스를 상속받음 (클래스를 만들면 무조건 상속)
 *  		object는 자바의 최상위 클래스
 *  	2. import java.lang.*;
 *  	   ====================
 *  		String, Math, System은 자동인식 (얘네는 final-> final은 상속이 안됨, 변경할수없는 클래스)
 *  	3. 예외처리 => 검색을 안하기 때문에
 *  			=> 실행시 예외, 컴파일시 예외
 *  
 * */
public class 클래스 {
	//멤버변수
	int[] com=new int[3];
	int[] user=new int[3];
	int s, b; // 멤버변수 ==> 자동으로 0 초기화
	void getRand()
	{
		int su=0;
		boolean bDash=false;
		for(int i=0;i<3;i++)
		{
			bDash=true;
			while(bDash)
			{
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{							
					if(com[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			com[i]=su;
			
		}
	}
	void userInput()
	{
		while(true)
		{
			String input=
					JOptionPane.showInputDialog("세자리 정수 입력:");
			if(input.length()!=3)
			{
				JOptionPane.showInputDialog(null, "잘못된 입력입니다");
				continue;
			}
			user[0]=input.charAt(0)-'0'; // '1' -> 숫자 1이 아니라 문자 '1'이기때문에 49를 뜻함. 그래서 '0'이 48이어서 빼줌
			user[1]=input.charAt(1)-'0';
			user[2]=input.charAt(2)-'0';
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2])
			{
				JOptionPane.showInputDialog(null, "중복된 수는 사용할 수 없다");
				continue;
			}
			break;
		}
		
		
		
	}
	void compare()
	{
		s=0;
		b=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
	}
	void hint()
	{
		System.out.printf("Input Number : %d-%d-%d, Result : %dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	boolean isEnd()
	{
		if(s==3)
			return true; //모든 메소드는 return이 나오면 끝남
		return false;
	}
	void process()
	{
		getRand();
		while(true)
		{
			userInput();
			compare();
			hint();
			if(isEnd())
			{
				int a=JOptionPane.showConfirmDialog(null, "종료할까요?","선택",JOptionPane.YES_NO_OPTION);
				if(a==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null, "게임을 종료합니다");
					System.exit(0);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "새 게임이 시작되었습니다");
					process();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		클래스 a=new 클래스(); //static이 없는 것이 다 저장됨
		a.process();
	}

}

























