package com.sist;
// StringTokenizer
/*
 * hasMoreTokens
 * nextToken
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="admin|hong|³²ÀÚ";
        StringTokenizer st=new StringTokenizer(data, "|");
        while(st.hasMoreTokens())
        {
        	System.out.println(st.nextToken());
        }
	}

}
