package com.sist.board;

import java.lang.reflect.Method;

/*
 * 	�߻�Ŭ����
 * 		: �������� ����Ǵ� �޼ҵ� ����
 * 		: �ٸ� �������� �����ؼ� ���
 * 		����)
 * 		���������� abstract class
 */
public class MainClass {

	public static void main(String[] args) 
	throws Exception{
		// TODO Auto-generated method stub
		/*�Խ��� board=new �亯���Խ���();
		board.write();
		board=new ������Խ���();
		board.write();
		board=new �������Խ���();
		board.write();*/
		Class clsName=Class.forName("com.sist.board.�亯���Խ���");
		�亯���Խ��� rb=(�亯���Խ���)clsName.newInstance();
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
