package com.sist;
import java.util.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] data={"aaa","bbb","ccc","ddd","eee","fff","ggg","hhh","iii","jjj","kkk","lll", "mmm","nnn"};
        int totalpage=(int)(Math.ceil(data.length/5.0));
        System.out.println("��������:"+totalpage);
        Scanner scan=new Scanner(System.in);
        System.out.print("������ �Է�:");
        int page=scan.nextInt();
        
        int j=0;
        int pagecut=(page*5)-5;
        for(int i=0;i<data.length;i++)
        {
        	if(j<5 && i>=pagecut)
        	{
        		System.out.println(data[i]);
        		j++;
        	}
        }
	}

}






