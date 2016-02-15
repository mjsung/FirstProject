package com.sist;
/*
 *    컬렉션 (Collection) : 자료구조
 *      => 데이터를 관리하는 것 
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
 *        1) 순서를 유지한다
 *        2) 데이터를 중복으로 저장이 가능 
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        list.add("홍길동1"); //0
        list.add("홍길동2");//2
        list.add("홍길동3");//3
        list.add("홍길동4");//4
        list.add("홍길동5");//5
        list.add(1,"홍길동6"); //1번에 올려라 명령! //1
       System.out.println("현재저장개수 :"+list.size());
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        list.remove(3); //3번 삭제
        System.out.println("현재저장개수 :"+list.size());
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        list.set(3,"심청이"); //3번 변경
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
	}

}


















