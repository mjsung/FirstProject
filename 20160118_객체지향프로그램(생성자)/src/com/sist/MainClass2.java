package com.sist;
import java.sql.*;
/*
 * ��ü ������ �ĺ��ڸ� ������ �ִ�. Saram hong; Saram shim;
 * 					   ===== =====��ü
 * 					       ����� ���� ��������
 * ��ü�� ����(����)�� ������ �ִ�.
 * ��ü�� ����� ������ �� �ִ� �޼ҵ带 ������ �ִ�
 * �����ڴ� ����� �ȵ�
 * 
 * for(int i=0;i<10<i++)
 * {
 * 		A a=new A();
 * } //10���� ������ ����� �������! �� �ٸ� �޸�
 * 
 * A a;
 * for(int i=0;i<10<i++)
 * {
 * 	 a=new A();
 * }//�ϳ��� �������� ���� ����ǰ� ����
 * 
 * 
 */
public class MainClass2 {
    Connection conn;
    PreparedStatement ps;
    
    MainClass2()
    {
    	// ����Ŭ ����ÿ� ����̹� ���� 
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
