package com.sist;
//interface가 주로 하는 역할 : 서로 다른 클래스를 연결해서 사용할 수 있다 
/*
 * 	interface A
 * 	{
 * 		int a=10;	//public static final
 * 		void disp(); // public abstract
 * 	}
 */
interface Connection
{
	public void getConnection();
	//1.8버전부터 사용가능함!!!
	static void disConnection() //static이라 공통으로 사용 가능, public 생략
	{
		System.out.println("데이터 베이스 종료");
	}
	default public void increment()  //일반메소드. 구현된 메소드, public 생략
	{
		System.out.println("auto increment");
	}
}
class Oracle implements Connection
{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("오라클 연결...");
	}

	@Override
	public void increment() {
		System.out.println("create sequence..");
	}
	
}
class MSSQL implements Connection
{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("MSSQL 연결...");
	}
	
}
class MySQL implements Connection
{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySQL 연결...");
	}
	
}
class Container
{
	public Connection getDeataBase(String type)
	{
		Connection conn=null;
		if(type.equals("oracle"))
			conn=new Oracle();
		else if(type.equals("mysql"))
			conn=new MySQL();
		else if(type.equals("mssql"))
			conn=new MSSQL();
		return conn;
	}
}
public class 데이터베이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Container c=new Container();
			Connection conn=c.getDeataBase("oracle");
			conn.getConnection();
			conn.increment();
			Connection.disConnection();
			
			
			conn=c.getDeataBase("mysql");
			conn.getConnection();
			conn.increment();
			Connection.disConnection();
			
			conn=c.getDeataBase("mssql");
			conn.getConnection();
			conn.increment();
			Connection.disConnection();
	}

}
