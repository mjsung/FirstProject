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
        // 싱글턴 패턴 
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DATE);
        int week=cal.get(Calendar.DAY_OF_WEEK); //요일을 가져올때
        
        
        System.out.println(year);
        System.out.println(month+1); //month는 배열이라 +1을 해줘야함(0~11)
        System.out.println(day);
        String[] strWeek={"일","월","화","수","목","금","토"};
        System.out.println(strWeek[week-1]);//week는 하나를 빼줘야함(1~7)
	}

}
