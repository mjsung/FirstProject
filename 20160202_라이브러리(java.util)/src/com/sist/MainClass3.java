package com.sist;
import java.util.*;
import java.text.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-d");
		String today=sdf.format(date);
		System.out.println(today);
		StringTokenizer st=new StringTokenizer(today, "-");
		String year=st.nextToken();
		String month=st.nextToken();
		String day=st.nextToken();
		
		System.out.println("년도:"+year);
		System.out.println("월:"+month);
		System.out.println("일:"+day);
	}

}
