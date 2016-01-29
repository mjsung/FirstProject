package com.sist.dao;
import java.sql.*;
import java.util.*;
//
public class EmpDAO {
	private Connection conn;
	//서버연결
	private PreparedStatement ps;
	//문장전송
	//서버주소
	private final String URL="jdbc:oracle:thin:@localhost:1521:ORCL"; //final 매우 중요
	public EmpDAO()
	{
		//오라클 연결 ==> 드라이버 설정
		try
		{
			//컴파일 예외 ==> 컴파일 시에 예외처리를 확인(반드시 예외처리 해야함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cf)
		{
			System.out.println(cf.getMessage());
		}
	}
	//연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"scott","tiger"); //아이디, 비밀번호 적어야함
		}catch(Exception ex){}
	}

	//연결해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex){}
	}
	//로그인
	public String login(int empno, String ename) //경우의 수가 3개라서 string 아이디가 없을때, 비밀번호 틀렸을 때, 로그인이 됐을 때
	{
		String result="";
		try
		{
			//연결
			getConnection();
			String sql="SELECT COUNT(*) FROM emp WHERE empno=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, empno); //위의 물음표 부분 채우기
			ResultSet rs=ps.executeQuery(); // 엔터친 것과 같은 것
			rs.next(); //커서위치 변경
			int count=rs.getInt(1);
			rs.close();
			if(count==0)
			{
				result="noid";
			}
			else
			{
				sql="SELECT ename FROM emp WHERE empno=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, empno); //물음표부분 채우기
				rs=ps.executeQuery();
				rs.next();
				String db_name=rs.getString(1);
				rs.close();
				if(db_name.equals(ename.toUpperCase()))//toUpperCase() -> 대문자로바꾸기
					//equlsIgnoreCase() -> 대소문자 구분없이 비교해줌, 중요!!
				{
					result="ok";
				}
				else
				{
					result="noname";
				}
			}
			
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();//에러난 위치를 잡아줌! 중요 ! 자주쓰자!
		}
		finally
		{
			disConnection();
		}
		return result;
		}
	
	
	
	
	
	
	
	
}