package com.sist;
/*
 * 	java.util
 *    =========
 *    = Date : 시스템의 시간을 읽어 온다 (데이터베이스)
 *       => SYSDATE 
 *    = Calendar 
 *    = StringTokenizer , split
 *      빅데이터 , 네트워크 = 문자열로 묶어서 보내기  OutputStream
 *                     class로 묶어서 보내기 ObjectOutputStream
 *                       ===> 직렬화 
 */
import java.util.*; //Date
import java.text.*; // SimpleDateFormat
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 M월 d일 (h:mm:ss)");
		/*
		 * yyyy: 년도 (yy,yyy)
		 * MM : 월 (M) => 01 => 12 (출력이 아니라 윤년을 만들거나 할때는 01, 02월이 아니라 1,2,3 M으로 해야 8진법 오류가 안남)
		 * dd : 일(d)
		 * 
		 * hh : 시간(hour)
		 * mm : 분
		 * ss : 초
		 */
		System.out.println(sdf.format(date));
	}

}
