package com.sist.board;

import java.lang.reflect.Method;

/*
 * 	추상클래스
 * 		: 공통으로 적용되는 메소드 선언
 * 		: 다른 내용으로 구현해서 사용
 * 		형식)
 * 		접근지정어 abstract class
 */
public class MainClass {

	public static void main(String[] args) 
	throws Exception{
		// TODO Auto-generated method stub
		/*게시판 board=new 답변형게시판();
		board.write();
		board=new 댓글형게시판();
		board.write();
		board=new 갤러리게시판();
		board.write();*/
		Class clsName=Class.forName("com.sist.board.답변형게시판");
		답변형게시판 rb=(답변형게시판)clsName.newInstance();
		Method[] m=clsName.getDeclaredMethods();
		for(Method mm:m)
		{
			String name=mm.getName();
			if(name.equals("write"))
			{
				mm.invoke(rb,null);
			}
		}
	}

}
