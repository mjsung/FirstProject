package com.io;
import java.io.*;
import java.net.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	/*BufferedReader in=
        		new BufferedReader(
        				new InputStreamReader(System.in));
        	System.out.println("�Է°�:");
        	String msg=in.readLine();
        	System.out.println(msg);*/
        	/*
        	 *  Ű���� �Է°��� �޴� ���
        	 *  BufferedReader in=
        		new BufferedReader(
        				new InputStreamReader(System.in));
        	          ���� �Է°�
        	    BufferedReader in=
        		new BufferedReader(
        				new InputStreamReader(new FileInputStream("���ϸ�"));  
        	          ��Ʈ��ũ
        	    BufferedReader in=
        		new BufferedReader(
        				new InputStreamReader(socket.getInputStream()));  
        	    ������ �̿�
        	    BufferedReader in=
        		new BufferedReader(
        				new InputStreamReader(url.openConnection().getInputStream()));  
        	 */
        	/*URL url=new URL("http://www.daum.net");
        	HttpURLConnection conn=
        		 (HttpURLConnection)url.openConnection();
        	if(conn!=null)
        	{
        		BufferedReader in=
        			new BufferedReader(new InputStreamReader(conn.getInputStream()));
        		while(true)
        		{
        			String msg=in.readLine();
        			System.out.println(msg);
        			if(msg==null)break;
        		}
        	}*/
        	/*BufferedReader in=
            		new BufferedReader(
            				new InputStreamReader(new FileInputStream("c:\\image\\io.txt"))); 
            while(true)
            {
            	String msg=in.readLine();
            	if(msg==null)break;
            	System.out.println(msg);
            }*/
        	System.out.println("�Է�:");
        	int data=System.in.read();
        	System.out.println();
        	
        }catch(Exception ex){}
	}

}





