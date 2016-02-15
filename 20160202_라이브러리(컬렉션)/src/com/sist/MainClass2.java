package com.sist;
import java.util.*;
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Sawon(int sabun, String name, String dept) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
	}
	
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Sawon> list=
        	new ArrayList<Sawon>();
        list.add(new Sawon(1,"ȫ�浿","���ߺ�"));
        list.add(new Sawon(2,"��û��","�����"));
        list.add(new Sawon(3,"������","�ѹ���"));
        list.add(new Sawon(4,"�ڹ���","������"));
        list.add(new Sawon(5,"�����","��ȹ��"));
        System.out.println("���� ������:"+list.size());
        System.out.println("======�������======");
        for(Sawon s:list)
        {
        	System.out.println(s.getSabun()+" "
        			+s.getName()+" "
        			+s.getDept());
        }
        System.out.println("======�űԻ�� �߰�======");
        list.add(new Sawon(list.size()+1,"�̼���","������"));
        System.out.println("======�������======");
        for(Sawon s:list)
        {
        	System.out.println(s.getSabun()+" "
        			+s.getName()+" "
        			+s.getDept());
        }
        System.out.println("======�߰��� �߰�=====");
        list.add(3,new Sawon(list.size()+1,"������","���ߺ�"));
        System.out.println("======�������======");
        for(Sawon s:list)
        {
        	System.out.println(s.getSabun()+" "
        			+s.getName()+" "
        			+s.getDept());
        }
        System.out.println("=====�ǰ� ����====");
        Random r=new Random();
        list.remove(r.nextInt(list.size()-1));
        System.out.println("======�������======");
        for(Sawon s:list)
        {
        	System.out.println(s.getSabun()+" "
        			+s.getName()+" "
        			+s.getDept());
        }
        System.out.println("==== ������ ���� ��� =====");
        list.set(r.nextInt(list.size()-1),new Sawon(r.nextInt(list.size()-1),"������(����)","�ѹ���") );
        System.out.println("=======���� ���=======");
        for(Sawon s:list)
        {
        	System.out.println(s.getSabun()+" "
        			+s.getName()+" "
        			+s.getDept());
        }
	}

}




