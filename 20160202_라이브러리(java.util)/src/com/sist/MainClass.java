package com.sist;
//StringBuffer

import java.util.*;
import java.io.*;
import java.net.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			URL url=new URL("http://www.naver.com");
			//�������� ����
			HttpURLConnection conn= (HttpURLConnection)url.openConnection();
			if(conn!=null)//������ �����ߴٸ�
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
				//���پ� �б�
				StringBuffer sb=new StringBuffer();
				while(true)
				{
					String data=in.readLine();
					sb.append(data+"\n");
					if(data==null)
						break;
				}
				System.out.println(sb.toString());
			}	
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
