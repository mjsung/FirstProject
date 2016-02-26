package com.sist;
import java.sql.*;
import java.util.*;
public class EmpDAO {
	public ArrayList<EmpDTO> empAllData()
	{
		ArrayList<EmpDTO> list=new ArrayList<EmpDTO>();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL="jdbc:oracle:thin:@localhost:1521:ORCL";
			Connection conn=DriverManager.getConnection(URL,"scott","tiger");
			String sql="SELECT empno,ename,sal FROM emp";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				EmpDTO d=new EmpDTO();
				d.setEmpno(rs.getInt(1)); //==d.setEmpno(rs.getInt("empno"));
				d.setEname(rs.getString(2));
				d.setSal(rs.getInt(3));
				list.add(d);
			}
			rs.close();
			ps.close();
			conn.close();
			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return list;
	}
}
