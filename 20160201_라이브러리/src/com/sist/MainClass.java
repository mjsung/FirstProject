package com.sist;
/*
 * 라이브러리 Library : 완저품(자바) .class => 상속을 통해서 변경
 * 프레임워크 Framework : 레고 .class, .java => 완전변경이 가능
 * 		= spring, mybatis, jquery
 * 		==========================Open Source라고 함
 * 	1) 메모리구조
 * 		===============
 * 			메소드 영역 => 메소드, static 저장
 * 		===============
 * 			스택           => 매개변수, 지역변수 저장 : 메모리 자체가 관리, {}이 종료가 되면 메모리 해제
 * 		===============
 * 			힙              => 프로그래머 관리(인스턴스) -> new, GC(가비지 컬렉션)이 사라지게함
 * 		===============
 * 		주소 저장 : 스택
 * 		실제 데이터 : 힙
 * 		A a=new A();
 * 		 ==
 * 		  스택  ======> 실제 데이터가 저장(.)
 * 
 * 		===========================================================
 * 
 * 		라이브러리
 * 		1) java.lang
 * 			=> import를 생략할 수 있다.
 * 			Object : 최상위 클래스(모든 클래스는 Object 상속)
 * 			   기능)
 * 				* toString(): 객체를 문자열로 변환
 * 				  =>(String) 문자열로 형변환 시키는 것과 같음
 * 				* finalize() : 객체메모리 회수시에 호출되는 메소드
 * 					C++ => 객체생성(생성자)  A()
 * 						        객체소멸(소멸자)  ~A()
 * 						객체의 생명주기
 * 					생성==========>  활용   ==========>소멸
 * 				A a=new A();   a.display()      a.null
 * 					생성자						   (GC=>finalize())
 * 				* clone-> (복제)
 * 				복제할 때 클래스 뒤에 implements Cloneable 붙여야 함. 
 * 				* equals : 주소값을 비교하는 것이 아니라 저장된 변수값 자체를 비교
 * 
 * 		2) java.util
 * 		3) java.sql
 * 		4) java.io
 * 		5) java.net
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * 1) 클래스 영역 : 일반 변수(데이터형), 배열, 클래스이 올 수 있음
 * 	class A
 * {
 * 		int a;
 * 		int [] arr;
 * 		JButton b; ==> 멤버
 * }
 */
public class MainClass extends JFrame implements ActionListener{
	JComboBox box;
	JLabel la;
	JButton b;
	public MainClass()
	{
		//멤버변수의 초기화 ==> 생성자
		//멤버변수 : 일반변수(int a, b, ...), 객체
		la=new JLabel("성별");
		box=new JComboBox();
		box.addItem("남자");
		box.addItem("여자");
		b=new JButton("선택");
		setLayout(new FlowLayout());
		add(la);
		add(box);
		add(b);
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//이벤트 등록
		b.addActionListener(new MyEvent(this));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
