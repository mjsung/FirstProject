package com.sist;
import java.sql.*;
/*
 * 객체 유일한 식별자를 가지고 있다. Saram hong; Saram shim;
 * 					   ===== =====객체
 * 					       사용자 정의 데이터형
 * 객체는 상태(변수)를 가지고 있다.
 * 객체는 기능을 수행할 수 있는 메소드를 가지고 있다
 * 생성자는 상속이 안됨
 * 
 * for(int i=0;i<10<i++)
 * {
 * 		A a=new A();
 * } //10개의 공간이 생기고 사라지고! 다 다른 메모리
 * 
 * A a;
 * for(int i=0;i<10<i++)
 * {
 * 	 a=new A();
 * }//하나의 공간으로 값만 변경되고 있음
 * 
 * 
 */
public class MainClass2 {
    Connection conn;
    PreparedStatement ps;
    
    MainClass2()
    {
    	// 오라클 연결시에 드라이버 설정 
    	try
    	{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    	}catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    }
    void getData()
    {
    	try
    	{
    		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
    	    conn=DriverManager.getConnection(url,"scott","tiger");
    	    String sql="SELECT * FROM emp";
    	    ps=conn.prepareStatement(sql);
    	    ResultSet rs=ps.executeQuery();
    	    while(rs.next())
    	    {
    	    	System.out.println(rs.getInt(1)+" "
    	    			+rs.getString(2)+" "
    	    			+rs.getString(3));
    	    }
    	}catch(Exception ex)
    	{
    		System.out.println(ex.getMessage());
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass2 m=new MainClass2();
        m.getData();
	}

}
