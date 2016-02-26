package com.sist.dao;
import java.sql.*;
import java.util.*;
/*
 *    JDBC : 자바언어를 이용해서 오라클의 데이터 제어 
 *    ==== 라이브러리 (java.sql.*)
 *    ==== 데이터베이스 연결 할 수 있는 드라이버 
 *         (ojdbc6.jar)
 *    작업 순서 
 *      1) 드라이버 설치 
 *         Class.forName("드라이버 이름")
 *         * oracle.jdbc.driver.OracleDriver
 *      2) 오라클 연결
 *         Connection : getConnection(URL,username,pwd)
 *      3) SQL문장을 오라클로 전송 
 *         Statement => 문장과 데이터를 동시에 전송
 *         PreparedStatement(일반화):미리 SQL문장을 제작후에 
 *                                 나중에 값 대입 
 *         CallableStatement(프로시저)
 *         예)
 *            String id="aaa";
 *            String pwd="1234";
 *            String name="홍길동";
 *            int age=30;
 *            String addr="서울";
 *            
 *            String sql="INSERT INTO member VALUES("
 *                      +"'"+id+"','"+pwd
 *                      +"','"+name+"',"+age+",'"+addr
 *                      +"')";
 *            String sql="INSERT INTO member VALUES("
 *                      +"?,?,?,?,?)";
 *            String sql="{CALL memberInsert(?,?,?,?,?)}";
 *            
 *            = ResultSet executeQuery() : SELECT
 *            = int executeUpdate() : UPDATE,DELETE,INSERT
 *            
 *        4) 결과값 받기 
 *           ResultSet 
 *           =====================
 *             id    pwd   name
 *           =====================
 *                   BOF
 *           =====================
 *            aaa   1234   hong  : next()
 *            bbb   1234   shim
 *            ccc   1234   park  : previous()
 *           =====================
 *                   EOF
 *           =====================
 *        5) 종료 
 *           
 *           시작 : Connection=Statement=ResultSet
 *           종료 : ResultSet=Statement=Connection
 *                       
 */
public class EmpDAO {
   // 연결 객체
   private Connection conn;
   // 전송 객체
   private PreparedStatement ps;
   // URL
   // jdbc:업체명:드라이버 이름:@IP:PORT:데이터베이스
   private final String URL="jdbc:oracle:thin:@211.238.142.20:1521:ORCL";
   //드라이버 설치
   public EmpDAO()
   {
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");//ojdbc6.jar
	   }catch(Exception ex)
	   {
		   System.out.println("EmpDAO():"+ex.getMessage());
	   }
   }
   // 연결 
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"scott","tiger");
		   // conn scott/tiger
	   }catch(Exception ex)
	   {
		   System.out.println("getConnection():"
	              +ex.getMessage());
	   }
   }
   // 연결 해제
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null) ps.close();
		   // ps => Input,Output
		   if(conn!=null) conn.close();
		   // socket
		   // exit;
	   }catch(Exception ex){}
   }
   // 기능 
   // 1. emp에 있는 사원 정보(전체)
   public ArrayList<EmpDTO> empAllData()
   {
	   ArrayList<EmpDTO> list=
			   new ArrayList<EmpDTO>();
	   try
	   {
		   // 연결 
		   getConnection();
		   // SQL 문장 만들기 
		   String sql="SELECT empno,ename,job,hiredate,deptno "
				     +"FROM emp";
		   // 전송 
		   ps=conn.prepareStatement(sql);
		   // 실행후에 결과값 받기
		   ResultSet rs=ps.executeQuery();
		   while(rs.next())
		   {
			   EmpDTO d=new EmpDTO();
			   d.setEmpno(rs.getInt(1));
			   d.setEname(rs.getString(2));
			   d.setJob(rs.getString(3));
			   d.setHiredate(rs.getDate(4));
			   d.setDeptno(rs.getInt(5));
			   list.add(d);
		   }
		   rs.close();
	   }catch(Exception ex)
	   {
		   System.out.println("empAllData():"+ex.getMessage());
	   }
	   finally
	   {
		   // 종료
		   disConnection();
	   }
	   return list;
   }
   // 2. emp에 있는 사원 상세정보  WHERE
   public EmpDTO empDetailData(int empno)
   {
	   EmpDTO d=new EmpDTO();
	   try
	   {
		   // 연결
		   getConnection();
		   String sql="SELECT * FROM emp "
				     +"WHERE empno=?";
		   ps=conn.prepareStatement(sql);
		   ps.setInt(1, empno);
		   ResultSet rs=ps.executeQuery();
		   rs.next();
		   d.setEmpno(rs.getInt(1));
		   d.setEname(rs.getString(2));
		   d.setJob(rs.getString(3));
		   d.setMgr(rs.getInt(4));
		   d.setHiredate(rs.getDate(5));
		   d.setSal(rs.getInt(6));
		   d.setComm(rs.getInt(7));
		   d.setDeptno(rs.getInt(8));
		   rs.close();
		   
	   }catch(Exception ex)
	   {
		   System.out.println("empDetailData:"+ex.getMessage());
	   }
	   finally
	   {
		   disConnection();
	   }
	   return d;
   }
   // 3. emp에 있는 사원 찾기  LIKE
   public ArrayList<EmpDTO> empFindData(String column,String data)
   {
	   ArrayList<EmpDTO> list=
			   new ArrayList<EmpDTO>();
	   try
	   {
		   getConnection();
		   String sql="SELECT empno,ename,job,hiredate,deptno "
				     +"FROM emp "
				     +"WHERE "+column+" LIKE '%'||?||'%'";
		// 전송 
		   ps=conn.prepareStatement(sql);
		   ps.setString(1, data.toUpperCase());// 'aaa'
		   // 실행후에 결과값 받기
		   ResultSet rs=ps.executeQuery();
		   while(rs.next())
		   {
			   EmpDTO d=new EmpDTO();
			   d.setEmpno(rs.getInt(1));
			   d.setEname(rs.getString(2));
			   d.setJob(rs.getString(3));
			   d.setHiredate(rs.getDate(4));
			   d.setDeptno(rs.getInt(5));
			   list.add(d);
		   }
		   rs.close();
	   }catch(Exception ex)
	   {
		   System.out.println(ex.getMessage());
	   }
	   finally
	   {
		   disConnection();
	   }
	   return list;
   }
   // 우편번호 
   public ArrayList<ZipcodeDTO> postFind(String dong)
   {
	   ArrayList<ZipcodeDTO> list=
			   new ArrayList<ZipcodeDTO>();
	   try
	   {
		   getConnection();
		   String sql="SELECT zipcode,sido,gugun,dong,bunji,NVL(bunji,' ') "
				     +"FROM zipcode "
				     +"WHERE dong LIKE '%'||?||'%'";
		   ps=conn.prepareStatement(sql);
		   ps.setString(1, dong);
		   ResultSet rs=ps.executeQuery();
		   while(rs.next())
		   {
			   ZipcodeDTO d=new ZipcodeDTO();
			   d.setZipcode(rs.getString(1));
			   d.setSido(rs.getString(2));
			   d.setGugun(rs.getString(3));
			   d.setDong(rs.getString(4));
			   d.setBunji(rs.getString(5));
			   list.add(d);
		   }
		   rs.close();
	   }catch(Exception ex)
	   {
		   System.out.println(ex.getMessage());
	   }
	   finally
	   {
		   disConnection();
	   }
	   return list;
   }
}





