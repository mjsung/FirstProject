package com.io;
import java.util.*;
import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String msg="�ȳ��ϼ���~ �ڹ��Դϴ�\n";
			FileWriter fos= new FileWriter("c:\\image\\io.txt"); //true�� ��� �� �ڿ� �̾, ������ ���� ����
			fos.write(msg);
			fos.close();
			System.out.println("�Է¿Ϸ�");
			
			
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
