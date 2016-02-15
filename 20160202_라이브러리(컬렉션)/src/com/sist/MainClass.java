package com.sist;
/*
 *    �÷��� (Collection) : �ڷᱸ��
 *      => �����͸� �����ϴ� �� 
 *           Collection
 *              |
 *      -----------------------
 *      |          |           |
 *     Set       List        Queue   Map
 *                 |
 *            --------------
 *            |       |      |
 *         ArrayList  Vector LinkedList
 *        ===========
 *        1) ������ �����Ѵ�
 *        2) �����͸� �ߺ����� ������ ���� 
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        list.add("ȫ�浿1"); //0
        list.add("ȫ�浿2");//2
        list.add("ȫ�浿3");//3
        list.add("ȫ�浿4");//4
        list.add("ȫ�浿5");//5
        list.add(1,"ȫ�浿6"); //1���� �÷��� ���! //1
       System.out.println("�������尳�� :"+list.size());
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        list.remove(3); //3�� ����
        System.out.println("�������尳�� :"+list.size());
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        list.set(3,"��û��"); //3�� ����
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
	}

}


















