package com.io;
import java.util.*;
import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String msg="안녕하세요~ 자바입니다\n";
			FileWriter fos= new FileWriter("c:\\image\\io.txt"); //true를 써야 그 뒤에 이어씀, 없으면 새로 만듬
			fos.write(msg);
			fos.close();
			System.out.println("입력완료");
			
			
			FileReader fis=new FileReader("c:\\image\\io.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.println((char)i);
			}
			fis.close();
		}catch(Exception ex){}
	}

}
