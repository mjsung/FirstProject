package com.sist;
import java.util.*;// Calendar
/*
 *   class A
 *   {
 *       static A a;
 *       public static A getInstance()
 *       {
 *           if(a==null)
 *             a=new A();
 *           return a;
 *       }
 *   }
 *   
 *   A a=A.getInstance()
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar cal=Calendar.getInstance();
        // �̱��� ���� 
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DATE);
        int week=cal.get(Calendar.DAY_OF_WEEK); //������ �����ö�
        
        
        System.out.println(year);
        System.out.println(month+1); //month�� �迭�̶� +1�� �������(0~11)
        System.out.println(day);
        String[] strWeek={"��","��","ȭ","��","��","��","��"};
        System.out.println(strWeek[week-1]);//week�� �ϳ��� �������(1~7)
	}

}
