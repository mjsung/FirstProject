package com.io;
import java.util.*;
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\download");
			if(!dir.exists())
			{
				dir.mkdir();
			}
			File[] fileList=dir.listFiles();
			for(File f:fileList)
			{
				if(f.isFile())
				{
				System.out.println(f.getName()); //파일정보 다가져옴
				}
				
			}
		}catch(Exception ex){}
	}

}
